package assignment.functionProgram;

// Define a method that returns the product of two numbers entered by user.

import java.util.Scanner;

public class ProductNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int ans = productVal(n1,n2);
        System.out.println(ans);
    }
    static int productVal(int n1,int n2){
        return n1*n2;
    }
}
