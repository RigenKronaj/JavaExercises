public class Truck extends Car {
    // Declaring the attributes of the Truck class
    private int weight;

    // Declaring the overload constructor
    public Truck(int speed, double regularPrice, String color, int weight)
    {
        super(speed, regularPrice, color);
        this.weight = weight;
    }

    // Getter
    public double getSalesPrice()
    {
        if(this.weight>2000)
            return (super.regularPrice * 0.9);
        return (super.regularPrice * 0.8);
    }
}
