package goodies;

import behaviours.IHealth;
import resources.Gadget;
import resources.Weapon;

import java.util.ArrayList;

public class Agent extends Mi6 implements IHealth {

   private Weapon weapon;
   private int health;
   private ArrayList<Gadget> gadgets;


    public Agent(String name, Weapon weapon) {
        super(name);
        this.weapon = weapon;
        this.health = 100;
        this.gadgets = new ArrayList;
    }

    public Weapon getWeapon(){
        return this.weapon;
    }

    public int getHealth(){
        return this.health;
    }

    public ArrayList<Gadget> getGadgets() {
        return gadgets;
    }

    public int getGad
}
