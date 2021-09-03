package lecture04;

import java.util.Scanner;

public class Example01 {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        // ask the user for a name
        // read in the name from the command line
        // print out the name to standard output
        System.out.print("What is your name? ");
        String name = in.nextLine();
        System.out.println("Hello, " + name + ", nice to meet you!");
    }
}
