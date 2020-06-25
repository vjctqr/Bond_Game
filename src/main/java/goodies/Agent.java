package goodies;

import behaviours.IHealth;
import behaviours.IWeapon;
import resources.Gadget;
import resources.Weapon;

import java.util.ArrayList;

public class Agent extends Mi6 implements IHealth, IWeapon {

   private Weapon weapon;
   private int health;
   private ArrayList<Gadget> gadgets;


    public Agent(String name, Weapon weapon) {
        super(name);
        this.weapon = weapon;
        this.health = 100;
        this.gadgets = new ArrayList<Gadget>();
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

    public int getGadgetCount(){
        return getGadgets().size();
    }

    public void loseHealth(){
        this.health -= 10;
    }

    public void recoverHeath() {
        this.health = 100;
    }

    public void useWeapon(){
        weapon.useWeapon();
    }

    public void changeWeapon(Weapon newWeapon){
        this.weapon = newWeapon;
    }

    public void drinkCocktail(){
        recoverHeath();
    }
    public void getJiggyWithIt(){
        recoverHeath();
    }

}
