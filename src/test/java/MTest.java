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
    private ArrayList<Agent> agents;

    @Before
    public void before(){
        agent = new Agent("James Bond");
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

    @Test
    public void canAddAgents(){
        Agent agent1 = new Agent("Alec Trevelyan");
        m.addAgent(agent1);
        assertEquals(2, m.getAgentCount());
    }
}
