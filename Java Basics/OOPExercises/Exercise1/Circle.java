public class Circle {
    // Declaring the attributes of the Circle class
    private double radius;
    private String color;

    // Declaring the default Constructor
    public Circle()
    {
        this.radius = 1.0;
        this.color = "red";
    }

    // Declaring the overload constructor
    public Circle(double r, String c)
    {
        this.radius = r;
        this.color = c;
    }

    // Getter methods
    public double getRadius()
    {
        return this.radius;
    }

    public double getArea()
    {
        return (Math.PI * (this.radius * this.radius));
    }

    public String getColor()
    {
        return this.color;
    }
}
