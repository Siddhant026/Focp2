import java.util.*;

interface GeometricObject
{
	public double getPerimeter();
	public double getArea();
}

interface Resizeable
{
	public void resize(int percent);
}

class Circle implements GeometricObject
{
	public double radius;

	public Circle()
	{
		this.radius=1;
	}

	public Circle(double r)
	{
	    this.radius=r;	
	}

	public double getPerimeter()
	{
		return 2*3.14*this.radius;
	}

	public double getArea()
	{
		return 3.14*this.radius*this.radius;
	}
}

class ResizeableCircle extends Circle implements Resizeable
{
   public ResizeableCircle(double r)
   {
   	super(r);
   }

   public void resize(int percent)
   {
   	  radius+=percent/100;
   	  System.out.println("resized peri is "+super.getPerimeter()+"\nresized area is "+super.getArea());
   }	
}

class InterfaceTest
{
	static public void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		double r;
		int percent;
		r= input.nextDouble();
		percent= input.nextInt();
		ResizeableCircle ob = new ResizeableCircle(r);
		ob.resize(percent); 
	}
}