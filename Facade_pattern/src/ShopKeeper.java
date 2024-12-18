public class ShopKeeper {
    private  Mobile_shop iphone;
    private  Mobile_shop samsung;
    private Mobile_shop blackberry;


    public  ShopKeeper(){
        iphone = new Iphone();
        samsung =new samsung();
        blackberry= new Blackberry();



    }

    public  void iphonesale(){
        iphone.MobileNo();
        iphone.price();

    }


    public  void  samungesale(){

        samsung.MobileNo();
        samsung.price();
    }

    public void  blackberrysale(){
        blackberry.MobileNo();
        blackberry.price();

    }
}
