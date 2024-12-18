public class Waiter  {
    BulderBurger build;

    public Waiter(BulderBurger  b)  {
     this.build =b;

    }


public Burger getBuild(){

        return  build.ret_Burger();
}

public void buildbur(){
        build.buildsauce();
        build.buikdtype();
}

}
