package girlies;

import behaviours.ISeduce;
import behaviours.IWeapon;
import goodies.Agent;
import resources.Weapon;

public class BadGirl extends BondGirl implements IWeapon, ISeduce {

    private Weapon weapon;
    private Agent agent;

    public BadGirl(String name, Weapon weapon){
        super(name);
        this.weapon = weapon;
        this.agent = null;
    }

    public Weapon getWeapon(){
        return this.weapon;
    }

    public void useWeapon(){
        this.weapon.useWeapon();
    }

    public void changeWeapon(Weapon newWeapon){
        this.weapon = newWeapon;
    }

    public void seduce(Agent agent){
        agent.getJiggyWithIt();
    }

}
