package Triangle;

public class Point {
    private double x;
    private double y;

    public Point() {
         x = y = 0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setAllParameters (double x, double y){
        this.x = x;
        this.y = y;
    }

    public void moveCoordinate (double dX, double dY){
        this.x += dX;
        this.y += dY;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
