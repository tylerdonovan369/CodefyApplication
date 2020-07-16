public class Triangle extends Polygon
{
    private int base;
    private int height;
    public Triangle (int base, int height)
    {
        super(3);
        this.base = base;
        this.height = height;
    }
    
    public double getArea()
    {
        return (1.0/2 * (base * height));
    }
    
    public String toString()
    {
        return (super.toString() + "\nThis is a triangle" + "\nThe base is " + this.base + "\nThe height is " + this.height);
    }
}