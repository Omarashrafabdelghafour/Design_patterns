public class GreetingStrategy implements PrintStrategy {
    @Override
    public void printMessage() {
        System.out.println("Hello Greeting Strategy called");
    }
}
