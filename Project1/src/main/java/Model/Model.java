package Model;

import lombok.Getter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Getter
public class Model {
    private List<Travel> TripList = new ArrayList<Travel>();
    private List<Travel> FilteredTripList;

    public void addTrip(Travel travel) {
        TripList.add(travel);
    }

    public List<Travel> Filter(int minDays, int maxDays, List<Transport> transportList, List<Food> foodList) {
        FilteredTripList =
                TripList.stream()
                        .filter(t -> isRightTransport(transportList, t))
                        .filter(t -> isRightFood(foodList, t))
                        .filter(t -> isRightDays(minDays, maxDays, t))
                        .sorted(Comparator.comparing(Travel::getCost).thenComparing(Travel::getDays))
                        .collect(Collectors.toList());

        return FilteredTripList;
    }

    public boolean isRightFood(List<Food> foodTypes, Travel travel) {
        return foodTypes.contains(travel.getFood());
    }

    public boolean isRightTransport(List<Transport> transportTypes, Travel travel) {
        return transportTypes.contains(travel.getTransport());
    }

    public boolean isRightDays(int minDays, int maxDays, Travel travel) {
        return (travel.getDays() >= minDays && travel.getDays() <= maxDays);
    }


}
