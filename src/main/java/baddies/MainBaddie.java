package baddies;

import java.util.ArrayList;

public class MainBaddie extends Villain{

    private ArrayList<Henchman> henchmen;

    public MainBaddie(String name){
        super(name);
        this.henchmen = new ArrayList<Henchman>();
    }

    public ArrayList<Henchman> getHenchmen(){
        return this.henchmen;
    }

    public int getHenchmenCount(){
        return getHenchmen().size();
    }

    public void addHenchman(Henchman henchman){
        henchmen.add(henchman);
    }

    public void loseHenchman(Henchman henchman){
        henchmen.remove(henchman);
    }
}

