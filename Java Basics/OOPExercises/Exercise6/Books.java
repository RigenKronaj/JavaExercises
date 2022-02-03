public class Books {
    // Declaring the attributes of the Books class
    private String name;
    private Author author;
    private double price;
    private int quantity;

    // Declaring the overload constructor
    public Books(String name, Author author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    // Declaring another overload constructor with an additional parameter
    public Books(String name, Author author, double price, int quantity) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.quantity = quantity;
    }

    // Setters and getters`
    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Creating a toString() method to print out a short description of the Book
    public String toString() {
        return ("Book [name=" + this.name + ", author=" + this.author + ", price=" + this.price + ", quantity=" + this.quantity + "]");
    }
}
