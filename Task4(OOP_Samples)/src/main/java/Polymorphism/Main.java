package Polymorphism;

public class Main {
    public static void main(String[] args) {

        Point point = new Point(4,5);
        Circle circle = new Circle(3,5,2);
        Rectangle rectangle = new Rectangle(2,5,7,9);
        point.draw();
        circle.draw();
        rectangle.draw();
        System.out.println("====================");
        Point p1 = new Point(6,2);
        p1.draw();
        p1 = new Circle(4,2,3);
        p1.draw();
        p1 = new Rectangle(4,6,7,9);
        p1.draw();
        System.out.println("====================");
        Circle circle1 = new Circle(4,5,7);
        Point circleThroughPoint = circle1;
        System.out.println(circle1.toString());
        System.out.println(circleThroughPoint.toString());
        System.out.println(circle1.getRadius());
        //System.out.println(circleThroughPoint.getRadius());
        System.out.println("====================");
        Point circle2 = new Circle(4,5,7);
        //circle2 = new Point(3,8);
        //System.out.println(circle2.getRadius());
        Circle pointThroughCircle = (Circle) circle2;
        System.out.println(pointThroughCircle.getRadius());
        System.out.println("====================");
        Point[] points = {point, new Point(3,7), circle, new Circle(4,6,8),
                rectangle, new Rectangle(4,6,5,9)};

        for (Point currentPoint : points){
            System.out.println(currentPoint);
            if (currentPoint instanceof Circle){
                Circle circleDefault = (Circle) currentPoint;
                System.out.println("radius = " + circleDefault.getRadius());
            }
        }

    }
}
