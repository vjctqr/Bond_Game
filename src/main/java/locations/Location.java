package locations;

import goodies.Agent;

import java.util.ArrayList;

public abstract class Location {

    private String name;
    private ArrayList<Agent> agents;

    public Location(String name){
        this.name = name;
        this.agents = new ArrayList<Agent>();
    }

    public String getName(){
        return this.name;
    }

    public ArrayList<Agent> getAgents(){
        return this.agents;
    }

    public int getAgentCount(){
        return getAgents().size();
    }
}
