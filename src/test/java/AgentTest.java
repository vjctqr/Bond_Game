import goodies.Agent;
import org.junit.Before;
import org.junit.Test;
import resources.Gadget;
import resources.Weapon;

import static org.junit.Assert.assertEquals;

public class AgentTest {

    private Agent agent;

    @Before
    public void before(){
        agent = new Agent("James Bond");
    }

    @Test
    public void hasName(){
        assertEquals("James Bond", agent.getName());
    }

    @Test
    public void hasWeapon(){
        assertEquals("Walther PPK", agent.getWeapon().getName());
    }

    @Test
    public void has100Health(){
        assertEquals(100, agent.getHealth());
    }

    @Test
    public void hasEmptyGadgets(){
        assertEquals(0, agent.getGadgetCount());
    }

    @Test
    public void canLoseHealth(){
        agent.loseHealth();
        assertEquals(90, agent.getHealth());
    }

    @Test
    public void canRecoverHealth(){
        agent.loseHealth();
        agent.recoverHeath();
        assertEquals(100, agent.getHealth());
    }

    @Test
    public void canUseWeapon(){
        agent.useWeapon();
        assertEquals(5, agent.getWeapon().getAmmo());
    }

    @Test
    public void canChangeWeapon(){
        Weapon newWeapon = new Weapon("Flame Thrower", 5);
        agent.changeWeapon(newWeapon);
        assertEquals("Flame Thrower", agent.getWeapon().getName());
    }

    @Test
    public void canDrinkCocktail(){
        agent.drinkCocktail();
        assertEquals(100, agent.getHealth());
    }

    @Test
    public void canGetJiggyWithIt(){
        agent.getJiggyWithIt();
        assertEquals(100, agent.getHealth());
    }

    @Test
    public void canReceiveGadget(){
        Gadget gadget = new Gadget("Chewing Gum");
        agent.receiveGadget(gadget);
        assertEquals(1, agent.getGadgetCount());
    }

    @Test
    public void canUseGadget(){
        Gadget gadget = new Gadget("Chewing Gum");
        agent.receiveGadget(gadget);
        assertEquals("Boom", agent.useGadget(gadget));
    }

}
