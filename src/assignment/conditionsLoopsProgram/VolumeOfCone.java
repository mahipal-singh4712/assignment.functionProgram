package assignment.conditionsLoopsProgram;

import java.util.Scanner;

public class VolumeOfCone {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int height = in.nextInt();
        int radius = in.nextInt();
        double pia = 3.14;
        double volume = pia*radius*radius*height/3;
        System.out.println("Volume of cone: " + volume);
    }
}
