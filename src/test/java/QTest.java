import goodies.Q;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QTest {

    private Q q;

    @Before
    public void before(){
        q = new Q("Q");
    }

    @Test
    public void hasName(){
        assertEquals("Q", q.getName());
    }
}
