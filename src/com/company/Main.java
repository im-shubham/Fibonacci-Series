// Fibonacci Series Using java


// In fibonacci series, next number is the sum of previous two numbers for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc.
// The first two numbers of fibonacci series are 0 and 1.


package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int a=0,b=1,c,n;
        System.out.print("Enter value of n: ");
        n=sc.nextInt();
        System.out.print(a+" "+ b+ " ");

        for(int i=3;i<=n;i++){   //Already two numbers we have printed so now starting from i=3,and we want fibonacci series till n.

            c=a+b;
            a=b;
            b=c;
            System.out.print(c+" ");
        }



    }
}
