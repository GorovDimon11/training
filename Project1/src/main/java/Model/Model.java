package Model;
;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Model {
    private List<Travel> TripList = new ArrayList<Travel>();

    public void addTrip(Travel travel){
        TripList.add(travel);
    }

    public Collection<Travel> Filter(Transport tr, Food food, int days){
         List<Travel> FilteredTripList =
                 TripList.stream()
                .filter(t -> t.getTransport().equals(tr))
                .filter(t-> t.getFood().equals(food))
                .filter(t -> t.getDays()==days)
                .sorted(Comparator.comparing(Travel::getCost))
                 .collect(Collectors.toList());

         return FilteredTripList;
    }


}
