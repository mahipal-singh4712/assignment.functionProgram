package assignment.functionProgram;

import java.util.Scanner;

public class NaturalNumSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int ans = naturalSum(n);
        System.out.println("Sum of " + n + " number is: " + ans);
    }
    static int naturalSum(int n){
        int natural = 0;
        for(int i=n; i>0; i--)
            natural = natural + i;
        return natural;
    }
}
