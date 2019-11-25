import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestModel {
    @Before
    public void generate(){
        Model.setPrimaryBarrier(GlobalConstants.PRIMARY_MIN_BARRIER,GlobalConstants.PRIMARY_MAX_BARRIER);
    }
    @Test
    public void testGuess() {
        Model.random = 50;
        Assert.assertFalse("We should well guessed",Model.guessInt(50));
        Assert.assertTrue("We should not guessed",Model.guessInt(49));
    }
    @Test
    public void testChangingBarrier(){
        Model.random = 50;
        Model.guessInt(60);
        Assert.assertEquals(Model.getNextMax(),60);
        Model.guessInt(40);
        Assert.assertEquals(Model.getNextMin(),40);
    }

}
