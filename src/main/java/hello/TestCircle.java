package main.java.hello;

import java.util.Scanner;

public class TestCircle {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] varArgs) {
        Circle circle = new Circle();
        System.out.println("gimme radius: ");
        double radius = sc.nextInt();
        circle.setRaidus(radius);
        System.out.println(circle.area());

        Circle circleone = new Circle();
        System.out.println("gimme another radius: ");
        double radiusone = sc.nextInt();
        circleone.setRaidus(radiusone);
        System.out.println(circleone.area());

        Circle circletwo = new Circle();
        System.out.println("gimme another another radius: ");
        double radiustwo = sc.nextInt();
        circletwo.setRaidus(radiustwo);
        System.out.println(circletwo.area());

        System.out.println(circle.area() + " " + circletwo.area());

        Circle c4 = new Circle(10);

        System.out.println("the area is: " + c4.getArea());

        Shape c5 = new Circle(10);
        System.out.println("the area is: " + c5.getArea());



        Shape c6 = c4;
        c4.setRaidus(2);
        System.out.println("the area of c6 is: " + c6.getArea());
    }
}