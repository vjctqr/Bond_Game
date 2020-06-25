import baddies.Henchman;
import goodies.Agent;
import locations.StartLocation;
import org.junit.Before;
import org.junit.Test;
import resources.Weapon;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.Assert.assertEquals;

public class StartLocationTest {

    private StartLocation startLocation;
    private Agent agent;
    private ArrayList<Henchman> henchmen;
    private Henchman henchman1;
    private Henchman henchman2;
    private Weapon weapon1;
    private Weapon weapon2;

    @Before
    public void before(){
        henchman1 = new Henchman("Oddjob", weapon1);
        henchman2 = new Henchman("Jaws", weapon2);
        henchmen = new ArrayList<Henchman>();
        Collections.addAll(henchmen, henchman1, henchman2);
        startLocation = new StartLocation("London", henchmen);
        agent = new Agent("James Bond");
    }

    @Test
    public void hasName(){
        assertEquals("London", startLocation.getName());
    }
    
    @Test
    public void hasHench
}
