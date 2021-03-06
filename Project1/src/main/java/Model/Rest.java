package Model;

import lombok.*;

@Getter
@Setter
@ToString
public class Rest extends Travel {
    private String HotelName;
    private int hotelStars;

    public Rest(Transport transport, int cost, int days, Food food, String hotelName, int hotelStars) {
        super(transport, cost, days, food);
        HotelName = hotelName;
        this.hotelStars = hotelStars;
    }

    @Override
    public String toString() {
        return "\nRest{" +
                "\n    HotelName = '" + HotelName + '\'' +
                ",\n    hotelStars = " + hotelStars +
                ",\n    Transport = " + super.getTransport() +
                ",\n    Cost = " + super.getCost() +
                ",\n    Days = " + super.getDays() +
                ",\n    Food = " + super.getFood() +
                '}';
    }
    @Override
    public String toUAString() {
        return "\nГотельний відпочинок{" +
                "\n    Назва готелю = '" + HotelName + '\'' +
                ",\n    Кількість зірок = " + hotelStars +
                ",\n    Транспорт = " + super.getTransport() +
                ",\n    Вартість = " + super.getCost() +
                ",\n    Дні = " + super.getDays() +
                ",\n    Тип харчування = " + super.getFood() +
                '}';
    }
}
