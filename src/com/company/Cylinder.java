package com.company;

public class Cylinder {

    private Circle base;
    private double height;

    public Cylinder(double r, double h)
    {
        base = new Circle(r);
        height = h;
    }

    public double vol()
    {
        double v = base.area()*height;
        return v;
    }

    public double sa()
    {
        double s = base.circumference()*height + base.area()*2;
        return s;
    }

}
