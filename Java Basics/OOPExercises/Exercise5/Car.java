public class Car {
    protected int speed;
    protected double regularPrice;
    protected String color;

    public Car(int speed, double regularPrice, String color)
    {
        this.speed = speed;
        this.regularPrice = regularPrice;
        this.color = color;
    }

    public double getSalesPrice()
    {
        return regularPrice;
    }

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
        return speed;
    }

    public double getRegularPrice()
    {
        return regularPrice;
    }

    public String getColor()
    {
        return color;
    }
}
