package assignment.firstJavaProgram;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter principle value: ");
        float principle = scan.nextFloat();
        System.out.print("enter rate of interest: ");
        float rate = scan.nextFloat();
        System.out.print("enter time: ");
        float time = scan.nextFloat();
        float simpleInterest = principle*rate*time /100;
        System.out.println("simple interest " + simpleInterest);
    }
}
