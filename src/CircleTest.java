import java.util.*;

class Circle 
{
	private int radius;
	public void setRadius()
	{
		Scanner in = new Scanner(System.in);
        radius = in.nextInt();
	}
	public double findArea()
	{
		double area=3.14*radius*radius;
		return area;
	}
	public void displayArea(double area)
	{
		System.out.println(area);
	}
}
class CircleTest
{
	public static void main(String args[])
	{
	Circle c = new Circle();
	c.setRadius();
	c.displayArea(c.findArea());
}
}