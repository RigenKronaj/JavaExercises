public class Object {
    private String author;
    private String title;
    private int price;

    public Object() {
        this.author = "Rigen";
        this.title = "Exercise";
        this.price = 50;
    }

    public Object(String author, String title, int price)
    {
        this.author = author;
        this.title = title;
        this.price = price;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public void setPrice(int price)
    {
        this.price = price;
    }

    public String getAuthor()
    {
        return author;
    }

    public String getTitle()
    {
        return title;
    }

    public String getPrice()
    {
        return price;
    }

    public String toString() 
    {
        return "This object's name is " + this.title + " and the author is " + this.author + " and the price is " + this.price;
    }
}
