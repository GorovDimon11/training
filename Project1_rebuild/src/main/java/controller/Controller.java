package controller;

import model.*;
import model.entity.*;
import view.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import static controller.Regex_Filter.REGEX_LANGUAGE;
import static view.ConstantMessages.CHOOSE_LANGUAGE;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() {
        Scanner scanner = new Scanner(System.in);
        //SETTING LANGUAGE
        view.setBundle(inputLanguageWithScanner(CHOOSE_LANGUAGE,REGEX_LANGUAGE, scanner));

        // CREATING DATA BASE
        Travel sh1 = new Cruise(Transport.SHIP,1500,11, Food.ROUND_THE_CLOCK,
                "Victoria",new ArrayList(Arrays.asList("Italy", "Spain")));
        Travel sh2 = new Cruise(Transport.SHIP,2000,21, Food.THREE_MEALS_A_DAY,
                "Ann",new ArrayList(Arrays.asList("Italy", "Spain","Canada")));
        Travel sh3 = new Cruise(Transport.SHIP,1500,21, Food.ROUND_THE_CLOCK,
                "Santa",new ArrayList(Arrays.asList("Italy", "Spain","Ukraine")));
        Travel rst1 = new Rest(Transport.PLANE,3000,14, Food.THREE_MEALS_A_DAY,"Grand",5);
        Travel tour1 = new Tours(Transport.BUS,700,12,Food.BREAKFAST_ONLY,
                new ArrayList(Arrays.asList("Disneyland", "Colosseum", "Eiffel Tower", "The Louvre")));
        model.addTrip(sh1);
        model.addTrip(sh2);
        model.addTrip(sh3);
        model.addTrip(rst1);
        model.addTrip(tour1);

        // CREATING FILTERS
        List<Food> foodFilter1 = new ArrayList<Food>();
        foodFilter1.add(Food.BREAKFAST_ONLY);
        foodFilter1.add(Food.THREE_MEALS_A_DAY);
        List<Transport> transportFilter1 = new ArrayList<Transport>();
        transportFilter1.add(Transport.SHIP);
        transportFilter1.add(Transport.PLANE);
        transportFilter1.add(Transport.BUS);
        int minDays = 10;
        int maxDays = 21;

        // OUTPUT RESULTS
        view.printStringOutput(transportFilter1.toString(),foodFilter1.toString(),minDays,maxDays);
        if(String.valueOf(View.bundle.getLocale()).equals("ua")){
            printUAList(model.Filter(minDays, maxDays, transportFilter1, foodFilter1));
        }else{
            view.printMessage(model.Filter(minDays, maxDays, transportFilter1, foodFilter1).toString());
        }

        // переписать : не использовать служебные toString()
        // проверить и обработать пустой результирующий список
        //
    }

    public void printUAList(List<Travel> filteredTripList){
        filteredTripList.forEach(f -> view.printMessage(f.toUAString()));
    }

    public int inputLanguageWithScanner(String message, String regex, Scanner scanner) {
        String res;
        view.printMessage(message);
        while (!(scanner.hasNext() &&
                (res = scanner.next()).matches(regex))) {
            view.printWrongLanguageInput(message);
        }
        return Integer.parseInt(res);
    }
}
