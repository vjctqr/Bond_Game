package baddies;

import behaviours.IHealth;

public abstract class Villain implements IHealth {

    private String name;
    private int health;

    public Villain(String name){
        this.name = name;
        this.health = 100;
    }

    public String getName(){
        return this.name;
    }

    public int getHealth(){
        return this.health;
    }

    public void loseHealth(){
        this.health -= 20;
    }

}
