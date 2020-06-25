package locations;

import baddies.MainBaddie;
import goodies.Agent;

public class SecretLocation extends Location{

    private MainBaddie mainBaddie;
    private String secretDocument;

    public SecretLocation(String name, MainBaddie mainBaddie){
        super(name);
        this.mainBaddie = mainBaddie;
        this.secretDocument = "For Your Eyes Only";
    }

    public MainBaddie getMainBaddie(){
        return this.mainBaddie;
    }

    public String getSecretDocument(){
        return this.secretDocument;
    }


}
