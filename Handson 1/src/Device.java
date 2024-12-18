public class Device implements Cloneable {

     String manufactre_name;
 double screene_size;
 int ram;
 String os;
 int capacity;
 double price;
 int quantity;

    public Device(int capacity, String manufactre_name, String os, double price, int quantity, int ram, double screene_size) {
        this.capacity = capacity;
        this.manufactre_name = manufactre_name;
        this.os = os;
        this.price = price;
        this.quantity = quantity;
        this.ram = ram;
        this.screene_size = screene_size;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


    public String getManufactre_name() {
        return manufactre_name;
    }
}
