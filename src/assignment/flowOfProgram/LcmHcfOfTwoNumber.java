package assignment.flowOfProgram;

import java.util.Scanner;

public class LcmHcfOfTwoNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int h = 1;
        int L;
        for(int i=1; i<=a;i++){
            if(a%i==0 && b%i==0){
                h=i;
            }
        }
        L = (a*b)/h;
        System.out.println("LCM of two number is " + L);
        System.out.println("HCF of two number is " + h);
    }
}
