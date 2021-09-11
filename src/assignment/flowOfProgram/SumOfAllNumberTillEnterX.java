package assignment.flowOfProgram;

import java.util.Scanner;

public class SumOfAllNumberTillEnterX {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter num 1 = " );

        int sum = 0;
        int i = 1;
        while(scan.hasNextInt()){
            int num = scan.nextInt();
            sum+=num;
            i++;
            System.out.print("Enter num " + i + " = ");
        }
        System.out.println("Total = " + sum);
    }
}
