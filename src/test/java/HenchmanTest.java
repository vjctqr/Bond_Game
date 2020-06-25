import baddies.Henchman;
import org.junit.Before;
import org.junit.Test;
import resources.Weapon;

import static org.junit.Assert.assertEquals;

public class HenchmanTest {
    private Henchman henchman;
    private Weapon weapon;

    @Before
    public void before(){
        weapon = new Weapon("Bowler hat", 10);
        henchman = new Henchman("Oddjob", weapon);
    }

    @Test
    public void hasName(){
        assertEquals("Oddjob", henchman.getName());
    }

    @Test
    public void startsWith100Health(){
        assertEquals(100, henchman.getHealth());
    }

    @Test
    public void canLoseHealth(){
        henchman.loseHealth();
        assertEquals(90, henchman.getHealth());
    }

    @Test
    public void hasWeapon(){
        assertEquals("Bowler hat", henchman.getWeapon().getName());
    }

    @Test
    public void canUseWeapon(){
        henchman.useWeapon();
        assertEquals(9, henchman.getWeapon().getAmmo());
    }

    @Test
    public void canChangeWeapon(){
        Weapon newWeapon = new Weapon("Golf club", 10);
        henchman.changeWeapon(newWeapon);
        assertEquals("Golf club", henchman.getWeapon().getName());
    }
}
