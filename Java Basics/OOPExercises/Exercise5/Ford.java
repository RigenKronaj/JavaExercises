public class Ford extends Car {
    // Declaring the attributes of the Ford class
    private int year;
    private int manufacturerDiscount;

    // Declaring the overload constructor
    public Ford(int speed, double regularPrice, String color, int year, int manufacturerDiscount)
    {
        super(speed, regularPrice, color);
        this.year = year;
        this.manufacturerDiscount = manufacturerDiscount;
    }

    // Getters
    public double getSalesPrice()
    {
        return (this.regularPrice - this.manufacturerDiscount);
    }

    public int getYear()
    {
        return this.year;
    }
}
