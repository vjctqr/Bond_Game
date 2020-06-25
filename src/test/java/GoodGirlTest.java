import girlies.GoodGirl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GoodGirlTest {

    private GoodGirl goodGirl;

    @Before
    public void before(){
        goodGirl = new GoodGirl("Honey Ryder");
    }

    @Test
    public void hasName(){
        assertEquals("Honey Ryder", goodGirl.getName());
    }

}
