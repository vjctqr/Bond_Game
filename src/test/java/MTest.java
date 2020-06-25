import goodies.Agent;
import goodies.M;
import org.junit.Before;
import org.junit.Test;
import resources.Weapon;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.Assert.assertEquals;

public class MTest {

    private M m;
    private Agent agent;
    private Weapon weapon;
    private ArrayList<Agent> agents;

    @Before
    public void before(){
        weapon = new Weapon("Walther PPK", 6);
        agent = new Agent("James Bond", weapon);
        agents = new ArrayList<Agent>();
        Collections.addAll(agents, agent);
        m = new M("M", agents);
    }

    @Test
    public void hasName(){
        assertEquals("M", m.getName());
    }

    @Test
    public void hasAgents(){
        assertEquals(1, m.getAgentCount());
    }
}
