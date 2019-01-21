import java.util.*;
import java.lang.*;

class Circle
{
	private double radius;
	private String color;

	public Circle()
	{
		this.radius=1;
		this.color="red";
	}

	public Circle(double r)
	{
		this.radius=r;
		this.color="red";
	}

	public Circle(double r, String c)
	{
		this.radius=r;
		this.color=c;
	}

	public double getRadius()
	{
		return this.radius;
	}

	public void setRadius(double r)
	{
		this.radius=r;
	}

	public String getColor()
	{
		return this.color;
	}

	public void setColor(String c)
	{
		this.color=c;
	}

	public double getArea()
	{
		double ar=Math.PI*getRadius()*getRadius();
		return ar;
	}
}

class Cylinder extends Circle
{
	private double height;

	public Cylinder()
	{
		super();
		this.height=1;
	}

	public Cylinder(double r)
	{
		super(r);
		this.height=1;
	}

	public Cylinder(double r, double h)
	{
		super(r);
		this.height=h;
	}

	public Cylinder(double r, double h, String c)
	{
		super(r,c);
		this.height=h;	
	}

	public double getHeight()
	{
		return height;
	}

	public void setHeight(double h)
	{
		this.height=h;
	}

	public double getVolume()
	{
		double vol=Math.PI*getRadius()*getRadius()*getHeight();
		return vol;
	}
}

class TestCylinder
{
	static public void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		double r,h;
		String c;
		System.out.println("Enter Radius and Height of Cylinder");
		r=input.nextDouble();
		h=input.nextDouble();
		Cylinder ob = new Cylinder(r,h);
		System.out.println("base area of cylinder is "+ob.getArea()+" volume of cylinder is "+ob.getVolume()+" color of cylinder is "+ob.getColor());
	}
}