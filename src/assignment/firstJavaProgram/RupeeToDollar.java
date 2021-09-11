package assignment.firstJavaProgram;

import java.util.Scanner;

public class RupeeToDollar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float rupee = scan.nextFloat();
        double dollar = rupee/73.53;
        System.out.println("rupee to dollar " + dollar);
    }
}
