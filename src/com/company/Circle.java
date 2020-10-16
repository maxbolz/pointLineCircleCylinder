package com.company;

public class Circle {

    private double radius;

    public Circle(double r)
    {
        radius = r;
    }

    public double area()
    {
        double a = Math.PI*Math.pow(radius,2);
        return a;
    }

    public double circumference()
    {
        double c = 2 * Math.PI * radius;
        return c;
    }

    public static void main (String[] args) {

        Circle c1 = new Circle(3);

        System.out.println("Circle with a radius of 3:\n");
        System.out.println("Radius: " + c1.radius);
        System.out.println("Area: " + c1.area());
        System.out.println("Circumference: " + c1.circumference());

    }

}
