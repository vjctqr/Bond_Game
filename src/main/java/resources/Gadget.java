package resources;

public class Gadget {
    private String name;

    public Gadget(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String explode(){
        return "Boom";
    }
}




