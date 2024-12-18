public class StarBucks {
    private String drink;
    private String size;

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Drink: " + drink + ", Size: " + size;
    }
}
