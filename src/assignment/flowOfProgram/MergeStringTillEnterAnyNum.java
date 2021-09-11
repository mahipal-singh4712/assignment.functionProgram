package assignment.flowOfProgram;

import java.util.Scanner;

public class MergeStringTillEnterAnyNum {
    public static void main(String[] args) {
        System.out.print("Enter String 1 = ");
        Scanner scan = new Scanner(System.in);
        String merge = " ";
        int i = 1;
        while(scan.hasNext()){
            if(scan.hasNextInt())
                break;
            String name = scan.next();
            merge += name + " ";
            i++;
            System.out.print("Enter string " + i + " = " );
        }
        System.out.println(merge);
    }
}
