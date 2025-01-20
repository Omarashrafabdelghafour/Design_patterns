//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Printer printer = new Printer();

        // Use the Greeting Strategy
        printer.setStrategy(new GreetingStrategy());
        printer.print(); // Output: Hello, welcome to the Strategy Pattern!

        // Use the Farewell Strategy
        printer.setStrategy(new FarewellStrategy());
        printer.print();
    }
}