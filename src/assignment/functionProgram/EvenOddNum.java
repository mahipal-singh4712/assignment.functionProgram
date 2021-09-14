package assignment.functionProgram;

import java.util.Scanner;

public class EvenOddNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        isEven(n);
    }
    static void isEven(int n ){
        if(n%2==0){
            System.out.println("Number is Even");
        }else{
            System.out.println("Number is Odd");
        }
    }

}
