package model.entity;

import java.util.ArrayList;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
//@ToString
public class Tours implements Travel {
    private Transport transport;
    private int cost;
    private int days;
    private Food food;
    private ArrayList<String> AttractionsList;

    public Tours(Transport transport, int cost, int days, Food food, ArrayList<String> attractionsList) {
        this.transport = transport;
        this.cost = cost;
        this.days = days;
        this.food = food;
        AttractionsList = attractionsList;
    }

    @Override
    public String toString() {
        return "\nTours{" +
                "\n    AttractionsList = " + AttractionsList +
                ",\n    Transport = " + transport +
                ",\n    Cost = " + cost +
                ",\n    Days = " + days +
                ",\n    Food = " + food +
                '}';
    }

    @Override
    public Transport transport() {
        return transport;
    }

    @Override
    public int cost() {
        return cost;
    }

    @Override
    public int days() {
        return days;
    }

    @Override
    public Food food() {
        return food;
    }

    @Override
    public String toUAString() {
        return "\nТур{" +
                "\n    Список відвудуємих пам'яток =" + AttractionsList +
                ",\n    Транспорт = " + transport +
                ",\n    Вартість = " + cost +
                ",\n    Дні = " + days +
                ",\n    Тип харчування = " + food +
                '}';
    }
}
