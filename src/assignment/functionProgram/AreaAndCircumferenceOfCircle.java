package assignment.functionProgram;

//  Q) Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.

import java.util.Scanner;

public class AreaAndCircumferenceOfCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int r = in.nextInt();
        double area = area(r);
        double circumference = circumference(r);
        System.out.println("area of circle: " + area);
        System.out.print("circumference of circle: " + circumference);

    }
    static double area(int r){
        return 3.14 * r * r;
    }
    static double circumference(int r){
        return 2*3.14*r;
    }
}
