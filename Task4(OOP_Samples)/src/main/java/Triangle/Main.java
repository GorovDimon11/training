package Triangle;

public class Main {
    public static void main(String[] args) {
        Model Model = new Model();
        View View = new View();
        Controller Controller = new Controller(Model, View);

        Controller.processUser();
    }
}
