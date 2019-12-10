package View;

import java.util.Locale;
import java.util.ResourceBundle;

import static View.ConstantMessages.INPUT_STRING_DATA;
import static View.ConstantMessages.WRONG_INPUT_DATA;
import static View.ConstantMessages.WRONG_LANGUAGE_DATA;

public class View {
    static String MESSAGES_BUNDLE_NAME = "messages";
    public static ResourceBundle bundle;

    public static void setBundle(int ch){
        switch (ch){
            case 1: bundle =
                    ResourceBundle.getBundle(
                            MESSAGES_BUNDLE_NAME,
                            new Locale("ua", "UA"));  // Ukrainian
                break;
            case 2: bundle =
                    ResourceBundle.getBundle(
                            MESSAGES_BUNDLE_NAME,
                            new Locale("en"));        // English
                break;
            default:
                System.out.println("Wrong input! Не вірне введення! ");
        }

    }

    public void printMessage(String message){
        System.out.println(message);
    }

    public String concatenationString(String... message){
        StringBuilder concatString = new StringBuilder();
        for(String v : message) {
            concatString = concatString.append(v);
        }
        return new String(concatString);
    }

    public void printStringInput(String message) {
        printMessage(concatenationString(
                bundle.getString(INPUT_STRING_DATA),
                bundle.getString(message)));
    }

    public void printWrongStringInput(String message) {
        printMessage(concatenationString(
                bundle.getString(WRONG_INPUT_DATA),
                bundle.getString(INPUT_STRING_DATA),
                bundle.getString(message)));
    }

    public void printWrongLanguageInput(String message) {
        printMessage(concatenationString(WRONG_LANGUAGE_DATA, message));
    }

}
