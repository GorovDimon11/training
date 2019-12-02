package Controller;

import View.View;

import java.util.Scanner;

public class UtilityController {
    private Scanner scanner;
    private View view;

    public UtilityController(Scanner scanner, View view) {
        this.scanner = scanner;
        this.view = view;
    }

    String inputStringValueWithScanner(String message, String regex) {
        String res;
        view.printStringInput(message);
        while( !(scanner.hasNext() &&
                (res = scanner.next()).matches(regex))) {
            view.printWrongStringInput(message);
        }
        return res;
    }

    int inputIntValueWithScanner(String message, String regex) {
        String res;
        view.printStringInput(message);
        while( !(scanner.hasNext() &&
                (res = scanner.next()).matches(regex))) {
            view.printWrongStringInput(message);
        }
        return Integer.parseInt(res);
    }

    int inputLanguageWithScanner(String message, String regex) {
        String res;
        view.printMessage(message);
        while( !(scanner.hasNext() &&
                (res = scanner.next()).matches(regex))) {
            view.printWrongStringInput(message);
        }
        return Integer.parseInt(res);
    }

}
