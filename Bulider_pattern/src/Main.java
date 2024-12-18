//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        StarBucksBuilder teaBuilder = new TeaBuilder();
        teaBuilder.createStarBucks();
        teaBuilder.buildSize();
        teaBuilder.buildDrink();
        StarBucks tea = teaBuilder.getStarBucks();
        System.out.println(tea); // Output: Drink: Tea, Size: Large

        // Using CoffeeBuilder to create a coffee drink
        StarBucksBuilder coffeeBuilder = new CoffeeBuilder();
        coffeeBuilder.createStarBucks();
        coffeeBuilder.buildSize();
        coffeeBuilder.buildDrink();
        StarBucks coffee = coffeeBuilder.getStarBucks();
        System.out.println(coffee);
    }
}