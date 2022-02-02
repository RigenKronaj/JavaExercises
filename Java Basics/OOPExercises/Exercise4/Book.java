public class Book {
    private String name;
    private int isbn;
    private String author;
    private String publisher;

    public Book(String name, int isbn, String author, String publisher)
    {
        this.name = name;
        this.isbn = isbn;
        this.author = author;
        this.publisher = publisher;
    }
    
    public String getBookInfo()
    {
        return ("The book " + name + " is written by " + author + " and published by " + publisher + ", its ISBN is " + isbn);
    }

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
        return name;
    }

    public int getIsbn()
    {
        return isbn;
    }

    public String getAuthor()
    {
        return author;
    }

    public String getPublisher()
    {
        return publisher;
    }
}
