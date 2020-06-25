import org.junit.Before;
import org.junit.Test;
import resources.Gadget;

import static org.junit.Assert.assertEquals;

public class GadgetTest {

    private Gadget gadget;

    @Before
    public void before(){
        gadget = new Gadget("Rolex");
    }

    @Test
    public void hasName(){
        assertEquals("Rolex", gadget.getName());
    }

    @Test
    public void canBomb(){
        assertEquals("Boom", gadget.explode());
    }



}
