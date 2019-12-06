package Model;

import java.util.ArrayList;
import lombok.*;

@Getter
@Setter
@ToString
public class Tours extends Travel {
    private ArrayList<String> AttractionsList;

    public Tours(Transport transport, int cost, int days, Food food, ArrayList<String> attractionsList) {
        super(transport, cost, days, food);
        AttractionsList = attractionsList;
    }

    @Override
    public String toString() {
        return "\nTours{" +
                "\n    AttractionsList = " + AttractionsList +
                ",\n    Transport = " + super.getTransport() +
                ",\n    Cost = " + super.getCost() +
                ",\n    Days = " + super.getDays() +
                ",\n    Food = " + super.getFood() +
                '}';
    }
    @Override
    public String toUAString() {
        return "\nТур{" +
                "\n    Список відвудуємих пам'яток =" + AttractionsList +
                ",\n    Транспорт = " + super.getTransport() +
                ",\n    Вартість = " + super.getCost() +
                ",\n    Дні = " + super.getDays() +
                ",\n    Тип харчування = " + super.getFood() +
                '}';
    }
}
