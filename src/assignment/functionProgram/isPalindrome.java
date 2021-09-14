package assignment.functionProgram;

import java.util.Scanner;

public class isPalindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int parameter = in.nextInt();
        boolean ans = isPalindromeNum(parameter);
        System.out.println(ans);
    }
    static boolean isPalindromeNum(int parameter){
        int temp = parameter;
        int ans = 0;
        int rem;
        while(parameter>0) {
            rem = parameter % 10;
            parameter = parameter / 10;
            ans = ans * 10 + rem;
        }
        return ans == temp;
    }

}
