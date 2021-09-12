package assignment.conditionsLoopsProgram;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int r = in.nextInt();
        float area = (float) (3.14 * r * r);
        System.out.println(area);

    }
}
