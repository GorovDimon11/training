package Polymorphism;

public class Circle extends Point{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double x, double y, double radius) {
        super(x, y);
        this.radius = radius;
    }
/*
    @Override
    public void draw() {
        super.draw();
    }*/

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "x=" + getX() +
                ", y=" + getY() +
                ", radius=" + radius +
                '}';
    }
}
