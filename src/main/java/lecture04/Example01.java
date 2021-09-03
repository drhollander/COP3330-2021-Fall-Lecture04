package lecture04;

import java.util.Scanner;

public class Example01 {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("What is your name? ");
        String name = in.nextLine();
        System.out.println("Hello, " + name + ", nice to meet you!");
    }
}
