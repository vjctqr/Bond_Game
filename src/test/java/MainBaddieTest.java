import baddies.MainBaddie;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainBaddieTest {

    private MainBaddie mainBaddie;

    @Before
    public void before(){
        mainBaddie = new MainBaddie("Blofeld");
    }

    @Test
    public void hasName(){
        assertEquals("Blofeld", mainBaddie.getName());
    }

    @Test
    public void startsWith100Health(){
        assertEquals(100, mainBaddie.getHealth());
    }

    @Test
    public void canLoseHealth(){
        mainBaddie.loseHealth();
        assertEquals(90, mainBaddie.getHealth());
    }
}
