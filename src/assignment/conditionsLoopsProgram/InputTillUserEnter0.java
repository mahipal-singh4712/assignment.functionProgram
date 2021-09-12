package assignment.conditionsLoopsProgram;

import java.util.Scanner;

public class InputTillUserEnter0 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the input: ");
        int sum = 0;

        while(in.hasNextInt()){
            int input = in.nextInt();
            sum += input;
            if(input == 0){
                break;
            }
            System.out.print(sum + " ");
        }
        System.out.print("");
    }
}
