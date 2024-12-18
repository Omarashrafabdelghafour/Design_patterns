public class ProxyDownload  implements  Download{
    private  Realdownload realdownload;
   private String targetfile;

    public ProxyDownload(String targetfile) {
        this.targetfile = targetfile;
    }
    @Override
    public void Download(){

        if(realdownload==null)
        {
            realdownload =new Realdownload(targetfile);

        }
        realdownload.Downloadfrominternet();

    }

}
