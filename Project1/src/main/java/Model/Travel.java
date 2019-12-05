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
}
