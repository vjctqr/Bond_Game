import goodies.M;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MTest {

    private M m;

    @Before
    public void before(){
        m = new M("M");
    }

    @Test
    public void hasName(){
        assertEquals("M", m.getName());
    }
}
