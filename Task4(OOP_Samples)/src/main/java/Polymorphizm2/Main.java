package Polymorphizm2;

public class Main {
    public static void main(String[] args) {
        Operation o1 = new Addition();
        //System.out.println(o1.calculate(5, 3));
        Operation.printOperation(o1,5,3);
        o1 = new Subtraction();
        //System.out.println(o1.calculate(5, 3));
        Operation.printOperation(o1,5,3);
    }
}
