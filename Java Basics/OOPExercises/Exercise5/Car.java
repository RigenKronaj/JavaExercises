public class Car {
    // Declaring the attributes of the Car class
    protected int speed;
    protected double regularPrice;
    protected String color;

    // Declaring the overload Constructor
    public Car(int speed, double regularPrice, String color)
    {
        this.speed = speed;
        this.regularPrice = regularPrice;
        this.color = color;
    }

    // Setters and getters
    public void setSpeed(int speed)
    {
        this.speed = speed;
    }
    
    public void setRegularPrice(double regularPrice)
    {
        this.regularPrice = regularPrice;
    }
    
    public void setColor(String color)
    {
        this.color = color;
    }
    
    public int getSpeed()
    {
        return this.speed;
    }
    
    public double getRegularPrice()
    {
        return this.regularPrice;
    }
    
    public String getColor()
    {
        return this.color;
    }

    public double getSalesPrice()
    {
        return this.regularPrice;
    }
}
