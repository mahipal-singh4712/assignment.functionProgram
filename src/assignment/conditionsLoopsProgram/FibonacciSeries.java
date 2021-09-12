package assignment.conditionsLoopsProgram;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int count = 0;

        while(n>count){
            System.out.print(a + " ");
            int temp = b;
            b = a + b;
            a = temp;
            count++;
        }
    }
}
