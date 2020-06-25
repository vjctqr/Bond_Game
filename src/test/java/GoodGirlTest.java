import baddies.Henchman;
import girlies.GoodGirl;
import goodies.Agent;
import org.junit.Before;
import org.junit.Test;
import resources.Weapon;

import static org.junit.Assert.assertEquals;

public class GoodGirlTest {

    private GoodGirl goodGirl;
    private Weapon weapon1;
    private Agent agent;
    private Henchman henchman;

    @Before
    public void before(){
        goodGirl = new GoodGirl("Honey Ryder");
        agent = new Agent("James Bond");
        weapon1 = new Weapon("Bowler hat", 10);
        henchman = new Henchman("Oddjob", weapon1);
    }

    @Test
    public void hasName(){
        assertEquals("Honey Ryder", goodGirl.getName());
    }

//    @Test
//    public void canMakeCocktail(){
//
//        goodGirl.makeCocktail("Martini");
//        assertEquals();
//    }

}
