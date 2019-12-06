package Model;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public abstract class Travel {
    private  Transport transport;
    private int cost;
    private int days;
    private Food food;

    public String toUAString() {
        return
                " \n    Транспорт = " + this.getTransport() +
                ",\n    Вартість = " + this.getCost() +
                ",\n    Дні = " + this.getDays() +
                ",\n    Тип харчування = " + this.getFood() +
                '}';
    }
}
