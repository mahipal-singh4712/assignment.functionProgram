package assignment.functionProgram;

import java.util.Scanner;

public class PrimeNumInterval {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        primeInter(n1,n2);
    }
    static void primeInter(int n1, int n2){
        int i,j,prime;
        for(i=n1;i<=n2;i++) {
            if (i == 1 || i == 0)
                continue;
            prime = 1;
            for (j = 2; j <= i/2; j++) {
                if (i % j == 0) {
                    prime = 0;
                    break;
                }
            }
                if (prime == 1)
                    System.out.println("number is prime: " + i);
        }
    }
}
