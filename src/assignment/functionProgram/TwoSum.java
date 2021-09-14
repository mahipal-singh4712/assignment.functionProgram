package assignment.functionProgram;

// Write a program to print the sum of two numbers entered by user by defining your own method.

import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int ans = sum(n1,n2);
        System.out.println(ans);
    }
    static int sum(int n1,int n2){
        return n1+n2;
    }
}
