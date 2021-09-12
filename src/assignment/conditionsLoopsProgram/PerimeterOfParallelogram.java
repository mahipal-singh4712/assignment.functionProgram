package assignment.conditionsLoopsProgram;

import java.util.Scanner;

public class PerimeterOfParallelogram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int perimeter = 2*(a + b);
        System.out.println("Perimeter of parallelogram: " + perimeter);
    }
}
