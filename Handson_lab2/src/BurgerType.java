public class BurgerType extends BulderBurger {

    @Override
    void buikdtype() {
        burger.setSauce("creeated sause");
        System.out.println("");
    }

    @Override
    void buildsauce() {
        burger.setType("created typ");
        System.out.println("e");

    }

    @Override
    Burger ret_Burger() {
        return  burger;
    }
}
