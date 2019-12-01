package Triangle;

public class Controller {
    Model Model = new Model();
    View View = new View();

    public Controller(Model model, View view) {
        this.Model = model;
        this.View = view;
    }


    public void processUser() {
        Side s1 = new Side(0,0, 3, 0);
        Side s2 = new Side(3,0, 0,4);
        Side s3 = new Side(0,4, 0,4);
        Triangle t1 = new Triangle( s1, s2, s3);
        

    }
/*
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
    */
}
