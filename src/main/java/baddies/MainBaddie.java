package baddies;

import java.util.ArrayList;

public class MainBaddie extends Villain{

    private ArrayList<Henchman> henchmen;

    public MainBaddie(String name){
        super(name);
        this.henchmen = new ArrayList<Henchman>();
    }

}

