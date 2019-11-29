package Triangle;

public class Circle extends Point{
    private double radius;

    public Circle(double radius) {
        checkRadius(radius);
    }

    public Circle(double x, double y, double radius) {
        super(x, y);
        checkRadius(radius);
    }

    //@Override
    public void setAllParameters(double x, double y, double radius) {
        super.setAllParameters(x, y);
        setRadius(radius);
    }

    @Override
    public void moveCoordinate(double dX, double dY) {
        super.moveCoordinate(dX, dY);
    }

    public final void checkRadius(double radius) throws IllegalArgumentException {
        if( radius <= 0 ){
            throw new IllegalArgumentException("radius must be greater then 0");
        }
        this.radius = radius;
    }

    public void setRadius(double radius) {
        checkRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                super.toString()+
                "radius=" + radius +
                '}';
    }
}
