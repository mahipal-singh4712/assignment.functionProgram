package assignment.functionProgram;

//  Q)  Write a program to print the factorial of a number by defining a method named 'Factorial'. Factorial of any number n is represented by n!

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int ans = factorial(number);
        System.out.println("Factorial of " + number + " is " + ans);
    }
    static int factorial(int n){
        int fact =1;
        for(int i=1; i<=n; i++)
            fact = fact * i ;
            return fact;
    }
}
