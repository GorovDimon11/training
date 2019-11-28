package Encapsulation;

public class Main3 {
    public static void main(String[] args) {
        Point3 point = new Point3();
        point.setX(3);
        point.setY(5);
        int coordinateX = point.getX();
        int coordinateY = point.getY();

        point.setDoubleX(4.);
        point.setDoubleY(7.);
        double coordinateDoubleX = point.getDoubleX();
        double coordinateDoubleY = point.getDoubleY();
    }
}
