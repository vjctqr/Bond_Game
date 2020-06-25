import goodies.Q;
import org.junit.Before;
import org.junit.Test;
import resources.Gadget;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.Assert.assertEquals;

public class QTest {

    private Q q;
    private ArrayList<Gadget> gadgets;
    private Gadget gadget1;
    private Gadget gadget2;

    @Before
    public void before(){
        gadget1 = new Gadget("Rolex");
        gadget2 = new Gadget("Fountain Pen");
        gadgets = new ArrayList<Gadget>();
        Collections.addAll(gadgets, gadget1, gadget2);
        q = new Q("Q", gadgets);

    }

    @Test
    public void hasName(){
        assertEquals("Q", q.getName());
    }

    @Test
    public void hasGadgets(){
        assertEquals(2, q.getGadgetCount());
    }

    @Test
    public void canAddGadgets(){
        Gadget gadget3 = new Gadget("Cuff Links");
        q.addGadget(gadget3);
        assertEquals(3, q.getGadgetCount());
    }
}
