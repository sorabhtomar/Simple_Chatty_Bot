package bot;

import java.util.Scanner;

public class SimpleBot {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Hello! My name is Aid.");
        System.out.println("I was created in 2018.");
        System.out.println("Please, remind me your name.");

        // reading a name
        String name = scn.nextLine();
        System.out.println("What a great name you have, " + name + "!");
    }
}
