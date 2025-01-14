import java.util.ArrayList;
import java.util.List;

// Composite Class - Contains MenuItems and other Menus
class Menu extends MenuComponent {
    private String name;
    private List<MenuComponent> menuComponents = new ArrayList<>();

    public Menu(String name) {
        this.name = name;
    }

    @Override
    public void add(MenuComponent component) {
        menuComponents.add(component);
    }

    @Override
    public void remove(MenuComponent component) {
        menuComponents.remove(component);
    }

    @Override
    public MenuComponent getChild(int index) {
        return menuComponents.get(index);
    }

    @Override
    public void display() {
        System.out.println("\n📌 " + name + " 📌");
        for (MenuComponent component : menuComponents) {
            component.display();
        }
    }
}
