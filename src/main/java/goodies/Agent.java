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
   private ArrayList<String> secretDocuments;


    public Agent(String name) {
        super(name);
        this.weapon = new Weapon("Walther PPK", 6);
        this.health = 100;
        this.gadgets = new ArrayList<Gadget>();
        this.secretDocuments = null;
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

//    public String getSecretDocuments(){
//        return this.secretDocuments.get(0);
//    }

    public int getGadgetCount(){
        return getGadgets().size();
    }

    public void loseHealth(){
        this.health -= 10;
    }

    public void recoverHealth() {
        this.health = 100;
    }

    public void useWeapon(){
        weapon.useWeapon();
    }

    public void changeWeapon(Weapon newWeapon){
        this.weapon = newWeapon;
    }

    public void drinkCocktail(){
        recoverHealth();
    }

    public void getJiggyWithIt(){
        recoverHealth();
    }

    public void receiveGadget(Gadget gadget){
        gadgets.add(gadget);
    }

    public String useGadget(Gadget gadget){
        return gadget.explode();
    }

//    public void takeSecretDocument(String secretDocument){
//        this.secretDocuments.add(secretDocument);
//    }

}
