//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MenuComponent pizza = new MenuItem("Pizza", 8.99);
        MenuComponent burger = new MenuItem("Burger", 5.49);
        MenuComponent fries = new MenuItem("Fries", 2.99);
        MenuComponent iceCream = new MenuItem("Ice Cream", 3.99);
        MenuComponent soda = new MenuItem("Soda", 1.99);

        // Creating menus (Composites)
        MenuComponent mainMenu = new Menu("Main Menu");
        MenuComponent lunchMenu = new Menu("Lunch Menu");
        MenuComponent dessertMenu = new Menu("Dessert Menu");
        MenuComponent drinksMenu = new Menu("Drinks Menu");

        // Building menu hierarchy
        lunchMenu.add(pizza);
        lunchMenu.add(burger);
        lunchMenu.add(fries);

        dessertMenu.add(iceCream);
        drinksMenu.add(soda);

        // Main menu includes everything
        mainMenu.add(lunchMenu);
        mainMenu.add(dessertMenu);
        mainMenu.add(drinksMenu);

        // Display complete menu
        mainMenu.display();

        }
    }
