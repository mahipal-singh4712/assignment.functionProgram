package assignment.conditionsLoopsProgram;

import java.util.Scanner;

public class AreaOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        float area = (float) (a * a * 1.73/4);
        System.out.println("Area Of Equilateral triangle: " + area );
    }
}
