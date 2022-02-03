public class Sedan extends Car {
    // Declaring the attributes of the Sedan class
    private int length;

    // Declaring the overload constructor
    public Sedan(int speed, double regularPrice, String color, int length)
    {
        super(speed, regularPrice, color);
        this.length = length;
    }

    // Getter method
    public double getSalesPrice()
    {
        if(length > 20)
            return (regularPrice * 0.95);
        return (regularPrice * 0.9);
    }
}
