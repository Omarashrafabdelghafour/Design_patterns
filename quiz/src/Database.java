public  class Database {
    public static Database mydb;
    private Database(){}

    public String readdata(){
        return "this is the data";
    }
    public  void Writedata(){
        System.out.println("data is writed");

    }
    public static Database getinstance(){
        if(mydb==null)
           return  new Database();

        else   {
            return  mydb;
        }

    }

}
