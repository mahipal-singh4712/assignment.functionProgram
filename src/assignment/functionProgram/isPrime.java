package assignment.functionProgram;

// Q) Define a method to find out if a number is prime or not.

import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean ans = primeNum(n);
        System.out.println(ans);

    }
    static boolean primeNum(int n){
        if(n<=1){
            return false;
        }
        int c = 2;
        while(c*c<=n){
            if(n%c==0){
                return false;
            }
            c++;
        }
        return c * c > n;

    }
}
