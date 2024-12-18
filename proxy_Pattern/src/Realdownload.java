public class Realdownload implements  Download {

String targetfile;
String targetdata;

    public Realdownload(String targetfile) {
        this.targetfile = targetfile;
    }

    public   void Downloadfrominternet(){
        this.targetdata="this is a test data";


    }

    @Override
    public void Download() {
        System.out.println(this.targetdata);
    }
}
