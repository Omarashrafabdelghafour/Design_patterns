public abstract class StarBucksBuilder {
    protected StarBucks starBucks;

    public StarBucks getStarBucks() {
        return starBucks;
    }

    public void createStarBucks() {
        starBucks = new StarBucks();
        System.out.println("Drink is created");
    }

    public abstract void buildSize();
    public abstract void buildDrink();
}
