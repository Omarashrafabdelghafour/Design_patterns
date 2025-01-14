// Context Class - Book with extrinsic data
public class Book {
    private final String name;
    private final double price;
    private final BookType bookType; // Reference to shared object

    public Book(String name, double price, BookType bookType) {
        this.name = name;
        this.price = price;
        this.bookType = bookType;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public BookType getBookType() {
        return bookType;
    }

    public void display() {
        System.out.println("Book: " + name + " | Price: $" + price + " | " + bookType);
    }
}
