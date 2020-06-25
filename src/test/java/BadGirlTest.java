import girlies.BadGirl;
import girlies.GoodGirl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BadGirlTest {
    private BadGirl badGirl;

    @Before
    public void before(){
        badGirl = new BadGirl("Xenia Onatopp");
    }

    @Test
    public void hasName(){
        assertEquals("Xenia Onatopp", badGirl.getName());
    }
}
