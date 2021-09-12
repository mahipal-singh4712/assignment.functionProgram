package assignment.conditionsLoopsProgram;

import java.util.Scanner;

public class AreaOfRhombus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pDiagonal = in.nextInt();
        int qDiagonal = in.nextInt();
        int area = pDiagonal * qDiagonal /2;
        System.out.println("Area of rhombus: " + area);
    }
}
