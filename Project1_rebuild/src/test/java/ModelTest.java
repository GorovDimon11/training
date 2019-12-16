
import model.Model;
import model.entity.Transport;
import model.entity.Food;
import model.entity.Cruise;
import model.entity.Rest;
import model.entity.Travel;
import org.junit.Assert;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ModelTest {
    Model model;
    Travel sh1 = new Cruise(Transport.SHIP,1100,11,Food.ROUND_THE_CLOCK,
            "Victoria",new ArrayList(Arrays.asList("Italy", "Spain")));
    Travel sh2 = new Cruise(Transport.SHIP,2000,21,Food.THREE_MEALS_A_DAY,
            "Ann",new ArrayList(Arrays.asList("Italy", "Spain","Canada")));
    Travel sh3 = new Cruise(Transport.SHIP,1500,21,Food.ROUND_THE_CLOCK,
            "Santa",new ArrayList(Arrays.asList("Italy", "Spain","Ukraine")));
    Travel rst1 = new Rest(Transport.PLANE,1000,14,Food.THREE_MEALS_A_DAY,"Grand",5);

    @Before
    public void init(){
     model = new Model();
    }
    @Test
    public void testIsRightTransport(){
        List<Transport> transportFilter = new ArrayList<Transport>();
        transportFilter.add(Transport.PLANE);
        Assert.assertEquals(model.isRightTransport(transportFilter,rst1),true);
        Assert.assertEquals(model.isRightTransport(transportFilter,sh1),false);
    }
    @Test
    public void testIsRightFood(){
        List<Food> foodFilter = new ArrayList<Food>();
        foodFilter.add(Food.ROUND_THE_CLOCK);
        Assert.assertEquals(model.isRightFood(foodFilter,rst1),false);
        Assert.assertEquals(model.isRightFood(foodFilter,sh1),true);
    }
    @Test
    public void testIsRightDays(){
        Assert.assertEquals(model.isRightDays(12,21,rst1),true);
        Assert.assertEquals(model.isRightDays(12,21,sh1),false);
    }
    @Test
    public void testFilter(){
        model.addTrip(sh1);
        model.addTrip(sh2);
        model.addTrip(sh3);
        model.addTrip(rst1);
        ArrayList<Travel> CorrectTravel = new ArrayList<Travel>();
        CorrectTravel.add(rst1);
        CorrectTravel.add(sh3);
        CorrectTravel.add(sh2);

        List<Food> foodFilter1 = new ArrayList<Food>();
        foodFilter1.add(Food.ROUND_THE_CLOCK);
        foodFilter1.add(Food.THREE_MEALS_A_DAY);
        List<Transport> transportFilter1 = new ArrayList<Transport>();
        transportFilter1.add(Transport.SHIP);
        transportFilter1.add(Transport.PLANE);

        Assert.assertArrayEquals(model.Filter(14,21,transportFilter1,foodFilter1).toArray(), CorrectTravel.toArray());
        //model.printUAList(model.getFilteredTripList());
        //System.out.println(model.getFilteredTripList());
    }
}
