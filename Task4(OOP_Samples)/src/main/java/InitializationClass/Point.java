package InitializationClass;

public class Point {
    private double x = 5;
    private double y = 5;

    public static void main(String[] args) {
        Point p1 = new Point();
        System.out.println(p1.x + p1.y);
        p1.moveCoordinate(5,-6);
        System.out.println(p1.toString());
    }

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
