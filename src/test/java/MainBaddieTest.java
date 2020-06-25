import baddies.Henchman;
import baddies.MainBaddie;
import org.junit.Before;
import org.junit.Test;
import resources.Weapon;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import static org.junit.Assert.assertEquals;

public class MainBaddieTest {

    private MainBaddie mainBaddie;
    private Henchman henchman1;
    private Henchman henchman2;
    private Henchman henchman3;
    private Weapon weapon1;
    private Weapon weapon2;
    private Weapon weapon3;
    private ArrayList<Henchman> henchmen;

    @Before
    public void before(){
        weapon1 = new Weapon("Bowler hat", 10);
        weapon2 = new Weapon("Teeth", 32);
        weapon3 = new Weapon("Metal arm", 5);
        henchman1 = new Henchman("Oddjob", weapon1);
        henchman2 = new Henchman("Jaws", weapon2);
        henchman3 = new Henchman("Teehee", weapon3);
        henchmen = new ArrayList<Henchman>();
        Collections.addAll(henchmen, henchman1, henchman2, henchman3);
        mainBaddie = new MainBaddie("Blofeld", henchmen);
    }

    @Test
    public void hasName(){
        assertEquals("Blofeld", mainBaddie.getName());
    }

    @Test
    public void startsWith100Health(){
        assertEquals(100, mainBaddie.getHealth());
    }

    @Test
    public void canLoseHealth(){
        mainBaddie.loseHealth();
        assertEquals(80, mainBaddie.getHealth());
    }

    @Test
    public void hasHenchmen(){
        assertEquals(3, mainBaddie.getHenchmenCount());
    }

    @Test
    public void canAddHenchmen(){
        Weapon weapon4 = new Weapon("Poison shoe", 4);
        Henchman henchman4 = new Henchman("Rosa Klebb", weapon4);
        mainBaddie.addHenchman(henchman4);
        assertEquals(4, mainBaddie.getHenchmenCount());
    }

    @Test
    public void canLoseHenchmen(){
        mainBaddie.loseHenchman(henchman3);
        assertEquals(2, mainBaddie.getHenchmenCount());
    }
}
