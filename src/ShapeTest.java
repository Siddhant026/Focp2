import java.util.*;

abstract class Shape
{
	double x,y;

	Shape(double x, double y)
	{
		this.x=x;
		this.y=y;
	}

	abstract void display_area();
}

class Rectangle extends Shape 
{
	Rectangle(double a, double b)
	{
		super(a,b);
	}

	void display_area()
	{
		System.out.println("Area is "+(x*y));
	}
}

class Triangle extends Shape 
{
	Triangle(double bs, double h)
	{
		super(bs,h);
	}

	void display_area()
	{
		System.out.println("Area is "+(0.5*x*y));
	}
}

class ShapeTest
{
	static public void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		double a=input.nextDouble();
		double b=input.nextDouble();
		double bs=input.nextDouble();
		double h=input.nextDouble();
		Rectangle ob1=new Rectangle(a,b);
		ob1.display_area();
		Triangle ob2=new Triangle(bs,h);
		ob2.display_area();
	}
}