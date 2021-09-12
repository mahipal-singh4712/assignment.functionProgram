package assignment.conditionsLoopsProgram;

import java.util.Scanner;

public class PerimeterOfCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int r = in.nextInt();
        float perimeter = (float) (2*3.14*r);
        System.out.println("Perimeter of circle: " + perimeter);
    }
}
