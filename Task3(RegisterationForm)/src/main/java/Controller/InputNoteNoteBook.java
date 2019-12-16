package Controller;

import Model.Human;
import Model.NotUniqueNickException;
import View.View;

import java.util.Scanner;

import static Controller.RegexFilter.*;
import static View.ConstantMessages.*;

public class InputNoteNoteBook {
    private View view;
    private Scanner sc;

    private String firstName;
    private String nickData;

    public InputNoteNoteBook(View view, Scanner sc) {
        this.view = view;
        this.sc = sc;
    }

    public void inputNote(Human human) {
        UtilityController utilityController =
                new UtilityController(sc, view);

        view.setBundle(utilityController.inputLanguageWithScanner(CHOOSE_LANGUAGE,REGEX_LANGUAGE));

        String str = (String.valueOf(View.bundle.getLocale()).equals("ua"))
                ? REGEX_NAME_UKR : REGEX_NAME_LAT;
        human.setSurname(utilityController.inputStringValueWithScanner(SURNAME_NAME, str));
        human.setFirstname(utilityController.inputStringValueWithScanner
                (NAME, str));
        human.setPatronymic(utilityController.inputStringValueWithScanner(PATRONOMIC_NAME, str));
        while(true) {
            try {
                human.setNickName(utilityController.inputStringValueWithScanner
                        (NICKNAME, REGEX_LOGIN));
                break;
            } catch (NotUniqueNickException e) {
                e.printStackTrace();
                System.out.println("Not Unique Nick " + e.getNickData());
            }
        }

    }

}
