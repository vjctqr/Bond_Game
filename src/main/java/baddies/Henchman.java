package baddies;

import behaviours.IWeapon;
import resources.Weapon;

public class Henchman extends Villain implements IWeapon {

    private Weapon weapon;

    public Henchman(String name, Weapon weapon){
        super(name);
        this.weapon = weapon;
    }

    public Weapon getWeapon(){
        return this.weapon;
    }

    public void useWeapon(){
        weapon.useWeapon();
    }

    public void changeWeapon(Weapon newWeapon){
        this.weapon = newWeapon;
    }
}
