public class CoffeeBuilder extends StarBucksBuilder {
    @Override
    public void buildSize() {
        starBucks.setSize("Medium");
        System.out.println("Build medium size");
    }

    @Override
    public void buildDrink() {
        starBucks.setDrink("Coffee");
        System.out.println("Build coffee drink");
    }
}
