package assignment.functionProgram;

// Q) Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:

import java.util.Scanner;

public class GradeMarks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int mark = in.nextInt();
        markGrade(mark);
    }
    static void markGrade(int n){
        if(n>=91){
            System.out.println("you got AA grade");
        }else if(n>=81){
            System.out.println("you got AB grade");
        }else if(n>=71){
            System.out.println("you got BB grade");
        }else if(n>=61){
            System.out.println("you got BC grade");
        }else if(n>=51){
            System.out.println("you got CD grade");
        }else if(n>=41){
            System.out.println("you got DD grade");
        }else System.out.println("you Fail");
    }
}
