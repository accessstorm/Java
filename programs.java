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
