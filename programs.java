#include <stdio.h>
#include <string.h>
#include<conio.h>
int i, j, m, n, LCS[20][20],z=0;
char b[20][20],d[20],S1[20],S2[20];
void print(int i,int j)
{
if(i==0 || j==0)
return ;
if(b[i][j]=='c')
{
print(i-1,j-1);
d[z]=S1[i-1];
z++;
printf("%c",S1[i-1]);
}
else
if(b[i][j]=='u'
) print(i-1,j);
else
print(i,j-1);
}
void lcs()
{
m = strlen(S1);
n = strlen(S2);
for (i = 0; i <= m; i++)
LCS[i][0]=0;
for (j = 0; j <= n; j++)
LCS[0][j]=0;
for(i=1;i<=m;i++)
for(j=1;j<=n;j++)
{
if (S1[i - 1] == S2[j - 1])
{
LCS[i][j] = LCS[i - 1][j - 1] + 1;
b[i][j]='c';
}
else if(LCS[i-1][j]>=LCS[i][j-1])
{
LCS[i][j]=LCS[i-1][j];
b[i][j]='u';
} else {
LCS[i][j]=LCS[i][j-1];
b[i][j]='l';
}
}
}
void main()
{
int
p,q,rlen=0;
clrscr();
printf("Dynamic Progrmming:Longest Common Subseqeunce>>");
printf("\nEnter First String: \n");
scanf("%s",S1);
printf("\nEnter Second String: \n");
scanf("%s",S2);
lcs();
printf("\n\n");
for(p=0;p<n;p++)
printf("%c",S2[p]);
printf("\n");
for(p=0;p<n;p++)
printf(" --- ");
printf("\n");
for(p=0;p<m;p++)
{
printf("%c |\t ",S1[p]);
for(q=0;q<n;q++)
{
printf("%d\t",LCS[p][q]);
}
printf("\n");
}
printf("\n The Longest Common Subsequence is\"");
print(m,n);
printf("\"");
for(p=0;p<20;p++)
if(d[p]!='\0')
rlen++;
printf("\n\n Length of Common Subsequence is:%d",rlen);
getch();
}



xxxxxxxxxx

#include <stdio.h>
#include <stdio.h>
#include<conio.h>
#define MAX_VERTICES 100
int isSafe(int graph[MAX_VERTICES][MAX_VERTICES], int color[], int vertex, int c, int V)
{
int i;
 for (i = 0; i < V; i++) {
if (graph[vertex][i] == 1 && color[i] == c)
{
 return 0;
}
 }
 return 1;
}
int graphColoringUtil(int graph[MAX_VERTICES][MAX_VERTICES], int color[], int vertex, int V, int m)
{
int c;
if (vertex == V)
{
return 1;
 }
 for ( c = 1; c <= m; c++)
 {
if (isSafe(graph, color, vertex, c, V))
{
 color[vertex] = c;
if (graphColoringUtil(graph, color, vertex + 1, V, m))
 {
return 1;
 }
 color[vertex] = 0;
}
 }
 return 0;
 }
int graphColoring(int graph[MAX_VERTICES][MAX_VERTICES], int V, int m)
{
 int color[MAX_VERTICES] = {0},i;
 if (graphColoringUtil(graph, color, 0, V, m) == 0)
{
printf("Solution does not exist\n");
return 0;
 }
 printf("Solution exists: Following are the assigned colors\n");
 for ( i = 0; i < V; i++)
{
printf("Vertex %d -> Color %d\n", i + 1, color[i]);
 }
 return 1;
}
void main()
{
 int V, E, m,i;
int graph[MAX_VERTICES][MAX_VERTICES] = {0};
 clrscr();
 printf("Enter number of vertices: ");
 scanf("%d", &V);
 printf("Enter number of edges: ");
 scanf("%d", &E);
 printf("Enter the edges (in the format u v):\n");
 for (i = 0; i < E; i++)
 {
int u, v;
scanf("%d %d", &u, &v);
graph[u - 1][v - 1] = 1;
graph[v - 1][u - 1] = 1;
 }
 printf("Enter the number of colors to use: ");
 scanf("%d", &m);
 graphColoring(graph, V, m);
 getch();
}
