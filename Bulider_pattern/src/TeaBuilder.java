public class TeaBuilder extends StarBucksBuilder {
    @Override
    public void buildSize() {
        starBucks.setSize("Large");
        System.out.println("Build large size");
    }

    @Override
    public void buildDrink() {
        starBucks.setDrink("Tea");
        System.out.println("Build tea drink");
    }
}
