package model.entity;

import lombok.*;

import java.util.ArrayList;

@Getter
@Setter
@NoArgsConstructor
//@ToString
public class Cruise implements Travel {
    private Transport transport;
    private int cost;
    private int days;
    private Food food;
    private String Liner;
    private ArrayList<String> CountriesList;

    public Cruise(Transport tr, int cost, int days, Food fd, String liner, ArrayList<String> countriesList) {
        this.transport = transport;
        this.cost = cost;
        this.days = days;
        this.food = food;
        Liner = liner;
        CountriesList = countriesList;
    }

    @Override
    public String toString() {
        return "\nCruise{" +
                "\n    Liner = '" + Liner + '\'' +
                ",\n    CountriesList = " + CountriesList +
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
        return "\nКруїз{" +
                "\n    Лайнер = '" + Liner + '\'' +
                ",\n    Список країн = " + CountriesList +
                ",\n    Транспорт = " + transport +
                ",\n    Вартість = " + cost +
                ",\n    Дні = " + days +
                ",\n    Тип харчування = " + food +
                '}';
    }
}
