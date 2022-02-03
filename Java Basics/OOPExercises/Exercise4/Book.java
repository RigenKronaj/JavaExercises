public class Book {
    // Declaring the attributes of the Book class
    private String name;
    private int isbn;
    private String author;
    private String publisher;

    // Declaring the overload Constructor
    public Book(String name, int isbn, String author, String publisher)
    {
        this.name = name;
        this.isbn = isbn;
        this.author = author;
        this.publisher = publisher;
    }
    
    // Setters and getters
    public void setName(String name)
    {
        this.name = name;
    }
    
    public void setIsbn(int isbn)
    {
        this.isbn = isbn;
    }
    
    public void setAuthor(String author)
    {
        this.author = author;
    }
    
    public void setPublisher(String publisher)
    {
        this.publisher = publisher;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public int getIsbn()
    {
        return this.isbn;
    }
    
    public String getAuthor()
    {
        return this.author;
    }
    
    public String getPublisher()
    {
        return this.publisher;
    }

    public String getBookInfo()
    {
        return ("The book " + name + " is written by " + author + " and published by " + publisher + ", its ISBN is " + isbn);
    }
}
