package assignment.conditionsLoopsProgram;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        int width = in.nextInt();
        int area = length * width;
        System.out.println("Area of rectangle" + area);
    }
}
