package girlies;

import behaviours.IWeapon;
import resources.Weapon;

public class BadGirl extends BondGirl implements IWeapon {

    private Weapon weapon;

    public BadGirl(String name, Weapon weapon){
        super(name);
        this.weapon = weapon;
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


}
