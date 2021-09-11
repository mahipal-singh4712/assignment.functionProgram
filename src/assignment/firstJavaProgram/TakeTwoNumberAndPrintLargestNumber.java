package assignment.firstJavaProgram;

import java.util.Scanner;

public class TakeTwoNumberAndPrintLargestNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        if(num1>num2){
            System.out.println("The largest value: " + num1);
        }else{
            System.out.println("The largest value: " + num2);
        }
    }
}
