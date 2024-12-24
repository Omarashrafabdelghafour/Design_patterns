public class MovableAdapterImp implements MovableAdapter {
    private Movable luxuryCars; // Variable to hold the Movable instance

    // Constructor to initialize Movable instance
    public MovableAdapterImp(Movable luxuryCars) {
        this.luxuryCars = luxuryCars;
    }

    // Method to convert mph to km/h and return the speed
    @Override
    public double getSpeed() {
        return convert(luxuryCars.getSpeed());
    }

    // Conversion method from mph to km/h
    private double convert(double mph) {
        return mph * 1.60934; // Conversion factor from miles per hour to kilometers per hour
    }
}