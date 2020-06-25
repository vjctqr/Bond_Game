import girlies.BadGirl;
import goodies.Agent;
import org.junit.Before;
import org.junit.Test;
import resources.Weapon;

import static org.junit.Assert.assertEquals;

public class BadGirlTest {
    private BadGirl badGirl;
    private Weapon weapon;
    private Agent agent;

    @Before
    public void before(){
        weapon = new Weapon("thighs", 20);
        badGirl = new BadGirl("Xenia Onatopp", weapon);
        agent = new Agent("James Bond");
    }

    @Test
    public void hasName(){
        assertEquals("Xenia Onatopp", badGirl.getName());
    }

    @Test
    public void hasWeapon(){
        assertEquals(weapon, badGirl.getWeapon());
    }

    @Test
    public void canUseWeapon(){
        badGirl.useWeapon();
        assertEquals(19, badGirl.getWeapon().getAmmo());
    }

    @Test
    public void canChangeWeapon(){
        Weapon newWeapon = new Weapon("fists", 30);
        badGirl.changeWeapon(newWeapon);
        assertEquals("fists", badGirl.getWeapon().getName());
    }

    @Test
    public void canSeduce(){
        badGirl.seduce(agent);
        assertEquals(100, agent.getHealth());
    }
}
