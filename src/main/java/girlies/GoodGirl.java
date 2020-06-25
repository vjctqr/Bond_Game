package girlies;

import goodies.Agent;
import resources.Weapon;

public class GoodGirl extends BondGirl{

    private Agent agent;

    public GoodGirl(String name) {
        super(name);
        this.agent = null;
    }

    public Agent getAgent(){
        return this.agent;
    }

    public String makeCocktail(){
        return "Your Martini, shaken, not stirred";
    }

    public void seduceAgent(Agent agent){
        makeCocktail();
        agent.getJiggyWithIt();
    }



}
