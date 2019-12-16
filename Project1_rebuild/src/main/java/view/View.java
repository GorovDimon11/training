package view;

import java.util.Locale;
import java.util.ResourceBundle;

import static view.ConstantMessages.*;

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

    public void printStringOutput(String tr, String fd, int n1, int n2) {
        printMessage(concatenationString(
                bundle.getString(OUTPUT_FIRST_PART_DATA),
                tr,
                bundle.getString(OUTPUT_SECOND_PART_DATA),
                fd,
                bundle.getString(OUTPUT_THIRD_PART_DATA),
                Integer.toString(n1)," ",
                bundle.getString(OUTPUT_FOURTH_PART_DATA),
                Integer.toString(n2)," ",
                bundle.getString(OUTPUT_LAST_PART_DATA)
                ));
    }

    public void printWrongLanguageInput(String message) {
        printMessage(concatenationString(WRONG_LANGUAGE_DATA, message));
    }

}
