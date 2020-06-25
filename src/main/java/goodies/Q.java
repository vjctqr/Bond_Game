package goodies;

import resources.Gadget;

import java.util.ArrayList;

public class Q extends Mi6{

    private ArrayList<Gadget> gadgets;

    public Q(String name, ArrayList<Gadget> gadgets){
        super(name);
        this.gadgets = gadgets;
    }

    public ArrayList<Gadget> getGadgets(){
        return this.gadgets;
    }

    public int getGadgetCount(){
        return getGadgets().size();
    }

    public void addGadget(Gadget gadget){
        this.gadgets.add(gadget);
    }
}

