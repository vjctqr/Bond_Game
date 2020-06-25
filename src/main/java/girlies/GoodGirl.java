package girlies;

import behaviours.ISeduce;
import goodies.Agent;

public class GoodGirl extends BondGirl implements ISeduce {

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

    public void seduce(Agent agent){
        makeCocktail();
        agent.getJiggyWithIt();
    }



}
