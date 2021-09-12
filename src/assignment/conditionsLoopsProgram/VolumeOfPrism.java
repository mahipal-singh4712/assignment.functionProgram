package assignment.conditionsLoopsProgram;

import java.util.Scanner;

public class VolumeOfPrism {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // volume of prism (v) = Bh       where B is base area and base is rectangle so B = length * width
        int h = in.nextInt();
        int length = in.nextInt();
        int width = in.nextInt();
        int bRectangleBaseArea = length * width;
        int volume =  bRectangleBaseArea * h ;
        System.out.println("volume of prism: " + volume);
    }
}
