package locations;

import baddies.Henchman;
import goodies.Agent;

import java.util.ArrayList;

public class StartLocation extends Location {

    private ArrayList<Henchman> henchmen;

    public StartLocation(String name, ArrayList<Henchman> henchmen){
        super(name);
        this.henchmen = henchmen;
    }

    public ArrayList<Henchman> getHenchmen(){
        return this.henchmen;
    }

    public int getHenchmenCount(){
        return getHenchmen().size();
    }

    public void removeHenchman(Henchman henchman){
        if (henchman.getHealth() == 0){
            this.henchmen.remove(henchman);
        }
    }


}
