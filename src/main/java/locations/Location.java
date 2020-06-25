package locations;

import goodies.Agent;

import java.util.ArrayList;

public abstract class Location {

    private String name;
    private Agent agent;

    public Location(String name){
        this.name = name;
        this.agent = null;
    }

    public String getName(){
        return this.name;
    }

    public Agent getAgent(){
        return this.agent;
    }

    public void agentArrives(Agent agent){
        this.agent = agent;
    }

}
