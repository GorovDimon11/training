package Controller;

import Model.Model;
import View.View;
import Model.Human;

import java.util.Scanner;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() {
        Scanner sc = new Scanner(System.in);

        InputNoteNoteBook inputNoteNoteBook =
                new InputNoteNoteBook(view, sc);
        Human h1 = new Human();
        inputNoteNoteBook.inputNote(h1);
        System.out.println(h1.toString());

    }
}
