package assignment.functionProgram;

import java.util.Scanner;

public class MaxAndMinNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        int max = largest(n1,n2,n3);
        int min = smallest(n1,n2,n3);
        System.out.println("maximum value: " + max);
        System.out.println("minimum value: " + min);

    }
    static int largest(int n1,int n2,int n3){
        if(n1>n2){
            if(n1>n3){
                return n1;
            }else{
                return n3;
            }
        }
        if(n3>n2){
            return n3;
        }else{
            return n2;
        }

    }
    static int smallest(int n1,int n2,int n3){
        if(n1<n2){
            if(n1<n3){
                return n1;
            }else{
                return n3;
            }
        }
        if(n3<n2){
            return n3;
        }else{
            return n2;
        }

    }
}
