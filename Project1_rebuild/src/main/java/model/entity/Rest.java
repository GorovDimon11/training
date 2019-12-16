package model.entity;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
//@ToString
public class Rest implements Travel {
    private Transport transport;
    private int cost;
    private int days;
    private Food food;
    private String hotelName;
    private int hotelStars;

    public Rest(Transport transport, int cost, int days, Food food, String hotelName, int hotelStars) {
        this.transport = transport;
        this.cost = cost;
        this.days = days;
        this.food = food;
        this.hotelName = hotelName;
        this.hotelStars = hotelStars;
    }

    @Override
    public String toString() {
        return "\nRest{" +
                "\n    hotelName = '" + hotelName + '\'' +
                ",\n    hotelStars = " + hotelStars +
                ",\n    Transport = " + transport +
                ",\n    Cost = " + cost +
                ",\n    Days = " + days +
                ",\n    Food = " + food +
                '}';
    }
    @Override
    public String toUAString() {
        return "\nГотельний відпочинок{" +
                "\n    Назва готелю = '" + hotelName + '\'' +
                ",\n    Кількість зірок = " + hotelStars +
                ",\n    Транспорт = " + transport +
                ",\n    Вартість = " + cost +
                ",\n    Дні = " + days +
                ",\n    Тип харчування = " + food +
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
}
