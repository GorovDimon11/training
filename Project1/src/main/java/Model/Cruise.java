package Model;

import lombok.*;

import java.util.ArrayList;

@Getter
@Setter
@ToString
public class Cruise extends Travel {
    private String Liner;
    private ArrayList<String> CountriesList;

    public Cruise(Transport tr, int cost, int days, Food fd, String liner, ArrayList<String> countriesList) {
        super(tr, cost, days, fd);
        Liner = liner;
        CountriesList = countriesList;
    }
    @Override
    public String toString() {
        return "\nCruise{" +
                "\n    Liner='" + Liner + '\'' +
                ",\n    CountriesList=" + CountriesList +
                ",\n    Transport=" + super.getTransport() +
                ",\n    Cost=" + super.getCost() +
                ",\n    Days=" + super.getDays() +
                ",\n    Food=" + super.getFood() +
                '}';
    }
}
