package resources;

import behaviours.IWeapon;

public class Weapon implements IWeapon {
    private String name;
    private int ammo;

    public Weapon(String name, int ammo){
        this.name = name;
        this.ammo = ammo;
    }

    public String getName(){
        return this.name;
    }

    public int getAmmo(){
        return this.ammo;
    }

    public void useWeapon(){
        this.ammo -= 1;
    }

    public void changeWeapon(Weapon newWeapon){
        this.name = newWeapon.name;
        this.ammo = newWeapon.ammo;
    }
}
