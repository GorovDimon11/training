package Polymorphism;

public class Rectangle extends Point{
    private double x1;
    private double y1;

    public Rectangle(double x1, double y1) {
        this.x1 = x1;
        this.y1 = y1;
    }

    public Rectangle(double x, double y, double x1, double y1) {
        super(x, y);
        this.x1 = x1;
        this.y1 = y1;
    }

    @Override
    public void draw() {
        super.draw();
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "x=" + getX() +
                ", y=" + getY() +
                ", x1=" + x1 +
                ", y1=" + y1 +
                '}';
    }
}
