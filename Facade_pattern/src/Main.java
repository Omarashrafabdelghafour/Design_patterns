import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static int choice;

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ShopKeeper sk = new ShopKeeper();

        do {
            System.out.println("============= Mobile Shop =============\n");
            System.out.println("1. iPhone");
            System.out.println("2. Samsung");
            System.out.println("3. Blackberry");
            System.out.println("4. Exit\n");
            System.out.print("Enter your choice: ");

            try {
                choice = Integer.parseInt(br.readLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                continue;
            }

            switch (choice) {
                case 1 -> sk.iphonesale();
                case 2 -> sk.samungesale();
                case 3 -> sk.blackberrysale();
                case 4 -> System.out.println("Exiting... Thank you!");
                default -> System.out.println("Invalid choice. Please select a valid option.");
            }
        } while (choice != 4);
    }
}
