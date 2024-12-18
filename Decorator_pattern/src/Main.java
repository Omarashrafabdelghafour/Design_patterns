//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
Beverage beverage = new Expresso();
        System.out.println(beverage.getDescription()+"     "+beverage.Cost());



        Beverage beverage1 =new Houseblend();
        beverage1 =new Mocha(beverage1);
        System.out.println(beverage1.getDescription()+"      "+beverage1.Cost());
    }
}