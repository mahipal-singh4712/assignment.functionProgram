package assignment.firstJavaProgram;

import java.util.Scanner;

public class NumberIsOddOrEven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if(num%2==0){
            System.out.println("number is even");
        }else{
            System.out.println("number is odd");
        }
//        System.out.println();
    }
}
