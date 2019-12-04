
import Model.Model;
import Model.Transport;
import Model.Food;
import Model.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class TestModel {
    @Before
    public void start(){

    }
    @Test
    public void testFilter(){
        Travel sh1 = new Cruise(Transport.SHIP,1500,14,Food.ROUND_THE_CLOCK,
                "Victoria",new ArrayList(Arrays.asList("Italy", "Spain")));
        Travel sh2 = new Cruise(Transport.SHIP,2000,21,Food.ROUND_THE_CLOCK,
                "Ann",new ArrayList(Arrays.asList("Italy", "Spain","Canada")));
        Travel sh3 = new Cruise(Transport.SHIP,1500,21,Food.ROUND_THE_CLOCK,
                "Santa",new ArrayList(Arrays.asList("Italy", "Spain","Ukraine")));

        Model.addTrip(sh1);
        Model.addTrip(sh2);
        Model.addTrip(sh3);
        ArrayList<Travel> CorrectTravel = new ArrayList<Travel>();
        CorrectTravel.add(sh3);
        CorrectTravel.add(sh2);

        Assert.assertArrayEquals(Model.Filter(Transport.SHIP, Food.ROUND_THE_CLOCK,21).toArray(), CorrectTravel.toArray());
        System.out.println(Model.getFilteredTripList());
    }
}
