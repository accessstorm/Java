//To Find Factorial of a number using bufferedreader.
import java.io.*;
class Factorial
{
public static void main(String z[])throws IOException
{
BufferedReader br=new BufferedReader(new
InputStreamReader(System.in));
int n,fact=1;
System.out.println("enter a no.");
n=Integer.parseInt(br.readLine());
for(int i=1; i<=n; i++)
{
fact=fact*i;
}
System.out.println("factorial is:"+fact);
}
}

















//To determine the sum of the following series
//1/1+1/2+1/3+1/4+.......+1/n

import java.io.*;

class Sum {
    public static void main(String args[]) throws IOException {
        int i, n;
        float sum = 0;
        
        // Read input from the user
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter value of n: ");
        String str = br.readLine();
        n = Integer.parseInt(str);
        
        // Calculate the sum of the series 1 + 1/2 + 1/3 + ... + 1/n
        for(i = 1; i <= n; i++) {
            sum += 1.0f / i;
        }
        
        // Output the result
        System.out.println("Sum = " + sum);
    }
}

//To determine the sum of the following series
//(2)1+1/2+1/3+1/4+.......+1/n

import java.io.*;

class SumSeries {
    public static void main(String args[]) throws IOException {
        int i, n, sign = 1;
        float sum = 0;
        
        // Read input from the user
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter value of n: ");
        String str = br.readLine();
        n = Integer.parseInt(str);
        
        // Calculate the sum of the alternating series 1 - 1/2 + 1/3 - 1/4 + ... + (-1)^(n+1)/n
        for (i = 1; i <= n; i++) {
            sum += 1.0f / i * sign;  // add the current term with the correct sign
            sign *= -1;              // alternate the sign for the next term
        }
        
        // Output the result
        System.out.println("Sum = " + sum);
    }
}









//Write a program to count the number of digits and sum of all digits of the user entered number. Also find the reverse of the number. Using a while loop.

import java.io.*;

class Digits {
    public static void main(String args[]) throws IOException {
        int sum = 0, n, rev = 0, c = 0;
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter any number:");
        n = Integer.parseInt(br.readLine());
        
        int originalNumber = n;  // Preserve the original number if needed later
        
        // Calculate the sum of digits, reverse of the number, and count of digits
        while (n != 0) {
            sum += n % 10;           // Add the last digit to sum
            rev = (rev * 10) + (n % 10);  // Build the reversed number
            n /= 10;                 // Remove the last digit
            c++;                     // Increment digit count
        }
        
        // Output results
        System.out.println("Sum of digits = " + sum);
        System.out.println("Reverse of the number = " + rev);
        System.out.println("Number of digits = " + c);
    }
}














//Write a program to implement a sequential search algorithm.

import java.io.*;

class Search {
    public static void main(String arg[]) throws IOException {
        int n, i, search;
        String str;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // Prompt for the number of elements
        System.out.print("Enter the number of elements: ");
        str = br.readLine();
        n = Integer.parseInt(str);
        
        int a[] = new int[n];
        
        // Read each element from the user
        for (i = 0; i < n; i++) {
            System.out.print("Enter the number: ");
            str = br.readLine();
            a[i] = Integer.parseInt(str);
        }
        
        // Prompt for the number to search for
        System.out.print("Enter the number to be searched: ");
        str = br.readLine();
        search = Integer.parseInt(str);
        
        // Perform a linear search
        for (i = 0; i < n; i++) {
            if (search == a[i]) {
                break;  // Exit the loop if the number is found
            }
        }
        
        // Output the result of the search
        if (i == n) {
            System.out.println("Number not found");
        } else {
            System.out.println("Index = " + i);
        }
    }
}









//Write a program to sort the array elements in ascending order.

import java.util.Scanner;

class Bubble {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int i, j, n, temp;

        // Read the number of elements
        System.out.println("Enter the number of elements to be sorted:");
        n = s.nextInt();
        
        int a[] = new int[n];
        
        // Read array elements from user
        System.out.println("Enter " + n + " elements:");
        for (i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        
        // Perform Bubble Sort
        for (i = 0; i < n - 1; i++) {
            for (j = 0; j < n - i - 1; j++) { // Optimization: limit the inner loop
                if (a[j] > a[j + 1]) {
                    // Swap adjacent elements if they are in the wrong order
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        
        // Print the sorted array
        System.out.println("Sorted array in ascending order is:");
        for (i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}








//To count the number of vowels, blank spaces, digits & consonants in a String.

import java.util.Scanner;

class Vowel {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter a string:");
        String st = s.nextLine();
        
        int n = st.length();
        int vowel = 0, consonant = 0, blank = 0, digit = 0;
        
        // Loop through each character in the string
        for (int i = 0; i < n; i++) {
            char ch = st.charAt(i);

            if (ch >= '0' && ch <= '9') {
                // Count digits
                digit++;
            } else if (ch == ' ') {
                // Count blank spaces
                blank++;
            } else if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
                // Check if character is a letter
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                    // Count vowels
                    vowel++;
                } else {
                    // Count consonants
                    consonant++;
                }
            }
        }
        
        // Display results
        System.out.println("Blank spaces: " + blank);
        System.out.println("Digits: " + digit);
        System.out.println("Vowels: " + vowel);
        System.out.println("Consonants: " + consonant);
    }
}








import java.io.*;

class Factorial {
    public static void main(String args[]) throws IOException {
        int n, r, ncr, npr;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // Calculate nCr
        System.out.println("Enter the values of n and r to find nCr:");
        System.out.print("Enter n: ");
        n = Integer.parseInt(br.readLine());
        System.out.print("Enter r: ");
        r = Integer.parseInt(br.readLine());
        
        if (r <= n) {
            ncr = fact(n) / (fact(r) * fact(n - r));
            System.out.println("nCr = " + ncr);
        } else {
            System.out.println("Invalid input: r should be less than or equal to n.");
        }

        // Calculate nPr
        System.out.println("\nEnter the values of n and r to find nPr:");
        System.out.print("Enter n: ");
        n = Integer.parseInt(br.readLine());
        System.out.print("Enter r: ");
        r = Integer.parseInt(br.readLine());
        
        if (r <= n) {
            npr = fact(n) / fact(n - r);
            System.out.println("nPr = " + npr);
        } else {
            System.out.println("Invalid input: r should be less than or equal to n.");
        }
    }

    // Factorial method
    static int fact(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}








//Write a program to find the values of ncr and npr.

import java.io.*;

class Factorial {
    public static void main(String args[]) throws IOException {
        int n, r, ncr, npr;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // Calculate nCr
        System.out.println("Enter the values of n and r to find nCr:");
        System.out.print("Enter n: ");
        n = Integer.parseInt(br.readLine());
        System.out.print("Enter r: ");
        r = Integer.parseInt(br.readLine());
        
        if (r <= n) {
            ncr = fact(n) / (fact(r) * fact(n - r));
            System.out.println("nCr = " + ncr);
        } else {
            System.out.println("Invalid input: r should be less than or equal to n.");
        }

        // Calculate nPr
        System.out.println("\nEnter the values of n and r to find nPr:");
        System.out.print("Enter n: ");
        n = Integer.parseInt(br.readLine());
        System.out.print("Enter r: ");
        r = Integer.parseInt(br.readLine());
        
        if (r <= n) {
            npr = fact(n) / fact(n - r);
            System.out.println("nPr = " + npr);
        } else {
            System.out.println("Invalid input: r should be less than or equal to n.");
        }
    }

    // Factorial method
    static int fact(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}










//Write a program to accept a number and compute the summation of digits recursively.

import java.io.*;
class Digits
{
public static void main(String args[])throws IOException
{
int n,sum;
BufferedReader br=new BufferedReader(new
InputStreamReader(System.in));
String str;
System.out.println("Enter a no");
str=br.readLine();
n=Integer.parseInt(str);
sum=add(n);
System.out.println("Sum of digits="+sum);
}
static int add(int n)
{
if(n==0)
return 0;
else
return(n%10+add(n/10));
}
}
