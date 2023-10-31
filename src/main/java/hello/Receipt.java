package main.java.hello;

import java.util.Scanner;

public class Receipt {

    static Scanner      scanner  = new Scanner(System.in);
    static final double TAX_RATE = 0.13;

    public static void main(String[] varArgs) {
        System.out.println("what is the cost");

        double cost = scanner.nextDouble();
        System.out.println("Taxes:" + (cost * TAX_RATE));

    }

}
