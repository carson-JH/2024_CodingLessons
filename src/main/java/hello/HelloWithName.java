package main.java.hello;

import java.util.Scanner;

public class HelloWithName {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] varArgs) {

        System.out.println("What is your name?");

        String name = scanner.nextLine();

        System.out.println("Happy Easter " + name);

        System.out.println("What are you current views on politics right now?");

        String politics = scanner.nextLine();

        System.out.println("I don't like your anwer! Don't ever say: " + politics + " :again, " + name + ", you suck!");


    }

}