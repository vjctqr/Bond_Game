package baddies;

import java.util.ArrayList;

public class MainBaddie extends Villain{

    private ArrayList<Henchman> henchmen;

    public MainBaddie(String name, ArrayList<Henchman> henchmen){
        super(name);
        this.henchmen = henchmen;
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
}

