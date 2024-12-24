public class Main {
    public static void main(String[] args) {
        // Create an instance of Bugatti (Movable)
        Movable car = new Bugatti();

        // Create an adapter for the Bugatti car
        MovableAdapter bugattiAdapter = new MovableAdapterImp(car);

        // Print the speed in kilometers per hour
        System.out.println("The speed of the Bugatti in km/h is: " + bugattiAdapter.getSpeed());
    }
}