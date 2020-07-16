public class Rectangle extends Polygon
{
    private int length;
    private int width;
    public Rectangle(int length, int width)
    {
        super(4);
        this.length = length;
        this.width = width;
    }
    public double getArea()
    {
        return length * width;
    }
    public String toString()
    {
        return (super.toString() + "\nThis is a rectangle" + "\nThe length is " + this.length + "\nThe width is " + this.width);
    }
    public int getLength()
    {
        return length;
    }
}