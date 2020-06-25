import baddies.Henchman;
import baddies.MainBaddie;
import goodies.Agent;
import locations.SecretLocation;
import org.junit.Before;
import org.junit.Test;
import resources.Weapon;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.Assert.assertEquals;

public class SecretLocationTest {

    private SecretLocation secretLocation;
    private Agent agent;
    private MainBaddie mainBaddie;

    @Before
    public void before(){
        mainBaddie = new MainBaddie("Goldfinger");
        secretLocation = new SecretLocation("Casino de Monte Carlo, Monaco", mainBaddie);
        agent = new Agent("James Bond");
    }

    @Test
    public void hasName(){
        assertEquals("Casino de Monte Carlo, Monaco", secretLocation.getName());
    }

    @Test
    public void hasMainBaddie(){
        assertEquals("Goldfinger", secretLocation.getMainBaddie().getName());
    }

    @Test
    public void hasSecretDocument(){
        assertEquals("For Your Eyes Only", secretLocation.getSecretDocument());
    }



}
