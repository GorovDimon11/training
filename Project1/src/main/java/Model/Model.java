package Model;
;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Model {
    private static List<Travel> TripList = new ArrayList<Travel>();
    private static List<Travel> FilteredTripList;

    public static List<Travel> getTripList() {
        return TripList;
    }

    public static List<Travel> getFilteredTripList() {
        return FilteredTripList;
    }
}
