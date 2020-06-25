package resources;

import behaviours.IWeapon;

public class Weapon implements IWeapon {
    private String name;
    private int bullets;

    public Weapon(String name, int bullets){
        this.name = name;
        this.bullets = bullets;
    }

    public String getName(){
        return this.name;
    }

    public int getBullets(){
        return this.bullets;
    }

    public void fireWeapon(){
        this.bullets -= 1;
    }

    public void changeWeapon(String newWeapon){
        this.name = newWeapon;
    }
}
