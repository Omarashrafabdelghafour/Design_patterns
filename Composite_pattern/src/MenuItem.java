// Leaf Class - Individual Menu Item
class MenuItem extends MenuComponent {
    private String name;
    private double price;

    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void display() {
        System.out.println("  → " + name + " : $" + price);
    }
}
