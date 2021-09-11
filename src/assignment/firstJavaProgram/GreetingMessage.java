package assignment.firstJavaProgram;

import java.util.Scanner;

public class GreetingMessage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println(name + " How are you? ");
    }
}
