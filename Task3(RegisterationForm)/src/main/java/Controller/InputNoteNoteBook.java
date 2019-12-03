package Controller;

import Model.Human;
import View.View;

import java.util.Scanner;

import static Controller.RegexFilter.*;
import static View.ConstantMessages.CHOOSE_LANGUAGE;
import static View.ConstantMessages.NAME;
import static View.ConstantMessages.NICKNAME;

public class InputNoteNoteBook {
    private View view;
    private Scanner sc;

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
        human.setFirstname(utilityController.inputStringValueWithScanner
                (NAME, str));

        human.setNickName(utilityController.inputStringValueWithScanner
                (NICKNAME, REGEX_LOGIN));
    }
}
