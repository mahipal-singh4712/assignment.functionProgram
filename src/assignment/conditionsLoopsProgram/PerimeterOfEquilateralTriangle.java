package assignment.conditionsLoopsProgram;

import java.util.Scanner;

public class PerimeterOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int perimeter = 3 * a ;
        System.out.println("perimeter of equilateral Triangle: " + perimeter);
    }
}
