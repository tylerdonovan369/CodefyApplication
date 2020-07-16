public abstract class Polygon
{
    private int sideCount;
    public Polygon(int sideCount)
    {
        this.sideCount = sideCount;
    }
    
    public abstract double getArea();
    public String toString()
    {
        return "This is a polygon with " + sideCount + " sides." + "\nThe polygon's area is " + this.getArea();
    }
}