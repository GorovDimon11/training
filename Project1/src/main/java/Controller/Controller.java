package Controller;

import Model.Model;
import View.View;

import java.util.Scanner;

import static Controller.Regex_Filter.REGEX_LANGUAGE;
import static View.ConstantMessages.CHOOSE_LANGUAGE;


public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() {
        Scanner scanner = new Scanner(System.in);
        //view.setBundle(inputLanguageWithScanner(CHOOSE_LANGUAGE,REGEX_LANGUAGE, scanner));





    }




    public int inputLanguageWithScanner(String message, String regex, Scanner scanner) {
        String res;
        view.printMessage(message);
        while (!(scanner.hasNext() &&
                (res = scanner.next()).matches(regex))) {
            view.printWrongStringInput(message);
        }
        return Integer.parseInt(res);
    }


}
