public class Painting extends Object {
    private int width;
    private int height;

    public Painting()
    {
        super();
        this.width = 300;
        this.height = 400;
    }

    public Painting(String author, String title, int price, int width, int height)
    {
        super(Object.author, Object.title, Object.price);
        this.width = width;
        this.height = height;
    }

    public double getArea()
    {
        return this.width * this.height;
    }

    public String toString()
    {
        return "The width of the painting is " + this.width + " , the height is " + this.height + " , and the area is " + getArea();
    }

}
