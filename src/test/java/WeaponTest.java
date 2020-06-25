import org.junit.Before;
import org.junit.Test;
import resources.Weapon;

import static org.junit.Assert.assertEquals;

public class WeaponTest {

    private Weapon weapon;

    @Before
    public void before(){
        weapon = new Weapon("Walther PPK", 6);
    }

    @Test
    public void hasName(){
        assertEquals("Walther PPK", weapon.getName());
    }

    @Test
    public void hasBullets(){
        assertEquals(6, weapon.getBullets());
    }

}
