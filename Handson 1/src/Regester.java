import java.util.HashMap;

public class Regester {

    private HashMap<String,Device> regis;

    public Regester() {
        this.regis = new HashMap<String,Device>();
        initialize_de();
    }

    public void  initialize_de(){
Device lab1 =new Device(2,"samsung","mac",30.2,2,16,20.2);

regis.put("one",lab1);

    }


    public  Device getclone(){

        return  regis.get("one");


    }
}
