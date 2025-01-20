
// Context Class
public class Printer {
    private PrintStrategy strategy;

    // Set the strategy dynamically
    public void setStrategy(PrintStrategy strategy) {
        this.strategy = strategy;
    }

    // Execute the strategy
    public void print() {
        if (strategy != null) {
            strategy.printMessage();
        } else {
            System.out.println("No strategy set!");
        }
    }
}
