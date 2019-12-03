package Model;

import java.util.ArrayList;

public class Tours extends Travel {
    private ArrayList<String> AttractionsList = new ArrayList<String>();

    public Tours(Transport tr, int cost, int days, Food fd, ArrayList<String> attractionsList) {
        super(tr, cost, days, fd);
        this.AttractionsList = attractionsList;
    }

    public Tours(Transport tr, int cost, int days, Food fd) {
        super(tr, cost, days, fd);
    }

    public ArrayList<String> getAttractionsList() {
        return AttractionsList;
    }

    public void setAttractionsList(ArrayList<String> attractionsList) {
        AttractionsList = attractionsList;
    }

    public void addAttraction(String attr){
        this.AttractionsList.add(attr);
    }
    public int numberOfAttractions(){
        return this.AttractionsList.size();
    }
}
