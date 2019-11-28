package InitializationClass;

public class Point2 {
    private double x;
    private double y;

    public Point2() {
    }

    public static void main(String[] args) {
        Point2 p2 = new Point2();
        p2.setAllParameters(2,5);
        System.out.println(p2.toString());
    }
    public Point2(double x, double y) {
        //this.x = x; //!!!!!
        setX(x);
        this.y = y;
    }

    public void setAllParameters (final double x, double y){
        // x = Math.abs(x);
        setX(x);
        this.x = x;// !!!!!
        this.y = y;
    }

    public void moveCoordinate (double dX, double dY){
        this.x = Math.abs(this.x + dX); // !!!!!!!
        this.y += dY;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = Math.abs(x);
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
