//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BookType fictionType = BookTypeFactory.getBookType("Fiction", "Penguin", "Best-selling novels");
        BookType scienceType = BookTypeFactory.getBookType("Science", "HarperCollins", "Educational books");

        // Create books with different names & prices but same BookType
        Book book1 = new Book("The Alchemist", 15.99, fictionType);
        Book book2 = new Book("1984", 12.49, fictionType);
        Book book3 = new Book("Astrophysics for People in a Hurry", 18.75, scienceType);

        // Display books
        book1.display();
        book2.display();
        book3.display();

    }
}