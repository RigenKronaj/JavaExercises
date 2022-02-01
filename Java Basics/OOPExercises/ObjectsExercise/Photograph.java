public class Photograph extends Object {
    private int resolution;
    private boolean isColored;

    public Photograph()
    {
        super();
        this.resolution = 10;
        this.isColored = false;
    }

    public Photograph(String author, String title, int price, int resolution, boolean isColored)
    {
        super(Object.author, Object.title, Object.price);
        this.resolution = resolution;
        this.isColored = isColored;
    }

    public int getResolution()
    {
        return resolution;
    }

    public boolean isColored()
    {
        return isColored;
    }

    public String toString()
    {
        return "Photograph resolution is " + resolution + ", photograph is colored: " + isColored;
    }
}
