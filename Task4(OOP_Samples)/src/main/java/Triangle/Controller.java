package Triangle;

public class Controller {
    Model Model = new Model();
    View View = new View();

    public Controller(Triangle.Model model, Triangle.View view) {
        Model = model;
        View = view;
    }


    public void processUser() {
        Point p1 = new Side(1,1);
        System.out.println();
    }

    public class Side extends Point {
        double x2;
        double y2;

        public Side(double x2, double y2) {
            this.x2 = x2;
            this.y2 = y2;
        }

        public Side(double x, double y, double x2, double y2) {
            super(x, y);
            this.x2 = x2;
            this.y2 = y2;
        }

        public double checkLong(double x, double y, double x2, double y2){
            return Math.sqrt(Math.pow((x2 - x),2)  + Math.pow((y2 - y),2));
        }
    }
}
