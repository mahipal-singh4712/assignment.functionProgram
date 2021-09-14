package assignment.functionProgram;
//A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.
import java.util.Scanner;

public class EleVote {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        eleVote(n);

    }
    static void eleVote(int n ){
        if(n>=18){
            System.out.println("eligible to vote");
        }else{
            System.out.println("not eligible to vote");
        }
    }
}
