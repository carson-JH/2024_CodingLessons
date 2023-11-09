package main.java.hello;

public class Circle extends Shape {
    private static final double PI = 3.14;
    private double              radius;

    public Circle(double r) {
        radius = r;
    }

    public Circle() {
        radius = 5;
    }

    public void setRaidus(double newRadius) {
        radius = newRadius;
    }

    public double area() {
        double circleArea;
        circleArea = PI * radius * radius;
        return (circleArea);

    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return area();
    }

    @Override
    public double getPerimeter() {
        return 2 * PI * radius;
    }
}
