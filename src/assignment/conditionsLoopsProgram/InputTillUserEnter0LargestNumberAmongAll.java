package assignment.conditionsLoopsProgram;

import java.util.Scanner;

public class InputTillUserEnter0LargestNumberAmongAll {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the input: ");
        int max = 0;

        while(in.hasNextInt()){
            int input = in.nextInt();

            if(input == 0){
                break;
            }
            if(input>max){
                max = input;
            }
            System.out.print(max + " ");
        }
        System.out.print("");
    }
}
