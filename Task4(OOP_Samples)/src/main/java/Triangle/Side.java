package Triangle;

public class Side extends Point {
    double x2;
    double y2;
    double length;

    public Side(double x, double y, double x2, double y2) {
        super(x, y);
        this.x2 = x2;
        this.y2 = y2;
        setLength(x,y,x2,y2);
    }

    public  double calculateL (double x, double y, double x2, double y2){
        return Math.sqrt(Math.pow(x2 - x, 2) + Math.pow(y2 - y, 2) );
    }

    public void setLength(double x, double y, double x2, double y2){
        if( calculateL(x,y,x2,y2) <= 0 ){
            throw new IllegalArgumentException("Incorrect coordinates, length must be greater then 0");
        }
        this.length = calculateL(x,y,x2,y2);
    }

    @Override
    public String toString() {
        return "Side{" +
                super.toString()+
                "length=" + length +
                '}';
    }
}
