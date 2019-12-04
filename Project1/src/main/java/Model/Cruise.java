package Model;

import java.util.ArrayList;

public class Cruise extends Travel {
    private String Liner;
    private ArrayList<String> CountriesList = new ArrayList<String>();

    public Cruise(Transport tr, int cost, int days, Food fd, String liner, ArrayList<String> countriesList) {
        super(tr, cost, days, fd);
        Liner = liner;
        CountriesList = countriesList;
    }

    public Cruise(Transport tr, int cost, int days, Food fd, String liner) {
        super(tr, cost, days, fd);
        Liner = liner;
    }

    public String getLiner() {
        return Liner;
    }

    public void setLiner(String liner) {
        Liner = liner;
    }

    public ArrayList<String> getCountriesList() {
        return CountriesList;
    }

    public void setCountriesList(ArrayList<String> countriesList) {
        CountriesList = countriesList;
    }

    public void addCountryInList(String country){
        CountriesList.add(country);
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
