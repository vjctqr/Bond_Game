package goodies;

import java.util.ArrayList;

public class M extends Mi6 {

    private ArrayList<Agent> agents;

    public M(String name, ArrayList<Agent> agents){
        super(name);
        this.agents = agents;
    }

    public ArrayList<Agent> getAgents(){
        return this.agents;
    }

    public int getAgentCount(){
        return this.agents.size();
    }

    public void addAgent(Agent agent){
        agents.add(agent);
    }
}
