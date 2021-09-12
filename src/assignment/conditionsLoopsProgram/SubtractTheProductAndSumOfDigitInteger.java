package assignment.conditionsLoopsProgram;

import java.util.Scanner;

public class SubtractTheProductAndSumOfDigitInteger {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // explanation suppose n = 1234 the product 4*3*2*1 = 24; and sum 4+3+2+1 = 10; and difference 24-10 = 14 is ans!
        int n = in.nextInt();
        int product = 1;
        int sum = 0;


        while (n>0){
            int rem = n%10;
            product = product*rem;
            sum = sum+rem;
            n = n/10;

        }
        int ans = product - sum;
        System.out.println(ans);

    }
}
