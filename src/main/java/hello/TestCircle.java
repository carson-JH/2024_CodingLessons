package main.java.hello;

import java.util.Scanner;

public class TestCircle {

    static Circle  circle = new Circle();

    static Scanner sc     = new Scanner(System.in);

    public static void main(String[] varArgs) {

        System.out.println("gimme radius: ");
        double radius = sc.nextInt();
        circle.setRaidus(radius);
        System.out.println(circle.area());
    }
}