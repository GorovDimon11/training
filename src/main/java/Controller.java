import java.util.Random;
import java.util.Scanner;

public class Controller {
    private Model model;
    private View view;

    public Controller(View view, Model model) {
        this.model=model;
        this.view=view;
    }

    public void processUser(){

        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int num = random.nextInt(101);

        while(model.guessInt(inputNumberWithScanner(sc),num)){
            view.printMessage(model.getIntermediateAnswer());
        }

        view.printMessage(View.RIGHT_INT + View.printAnswersArray());
    }

    public int inputNumberWithScanner(Scanner sc) {
        view.printMessage(View.INPUT_INT + View.printRange());
        while (!sc.hasNextInt() /* || sc.nextInt() < 0 || sc.nextInt() > 100 */) {
            view.printMessage(View.WRONG_INPUT + View.INPUT_INT + View.printRange());
            sc.next();
        }
        return sc.nextInt();
    }
}
