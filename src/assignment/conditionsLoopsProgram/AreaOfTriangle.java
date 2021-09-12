package assignment.conditionsLoopsProgram;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int base = in.nextInt();
        int height = in.nextInt();
        float area = (float) (base * height)/2;
        System.out.println(area);
    }
}
