package assignment.firstJavaProgram;

import java.util.Scanner;

public class OperatorWithTwoNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        if(num1>num2){
            System.out.println(num1-num2);
        }else if(num2>num1){
            System.out.println(num1+num2);
        }else{
            System.out.println(num1*num2);
        }
    }
}
