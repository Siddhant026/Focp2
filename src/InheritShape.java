import java.util.*;

class Shape
{
	private String color;
	private boolean filled;

    public Shape()
    {
    	this.color="red";
    	this.filled=true;
    }

	public Shape(String c, boolean f)
	{
		this.color=c;
		this.filled=f;
	}

	public String getColor()
	{
		return this.color;
	} 

	public void setColor(String c)
	{
		this.color=c;
	}

	public boolean isFilled()
	{
		return this.filled;
	}

	public void setFilled(boolean f)
	{
		this.filled=f;
	}

	//abstract double getArea();

	//abstract double getPerimeter();

	//abstract String toString();
}

class Circle extends Shape
{
	double radius;

	public Circle()
	{
		super();
		this.radius=1;
	}

	public Circle(double r)
	{
		this.radius=r;
	}

	public Circle(double r, String c, boolean f)
	{
		super(c,f);
		this.radius=r;
	}

	public void setRadius(double r)
	{
		this.radius=r;
	}

	public double getRadius()
	{
		return this.radius;
	}

	public double getArea()
	{
		return 3.14*this.radius*this.radius;
	}	

	public double getPerimeter()
	{
		return 2*3.14*this.radius;
	}

	/*public String toString()
	{
		return getColor();
	}*/
}

class Rectangle extends Shape
{
	double width,length;

	public Rectangle()
	{
		super();
		this.width=1;
		this.length=1;
	}

	public Rectangle(double w, double l)
	{
		super();
		this.width=w;
		this.length=l;
	}

	public Rectangle(double w, double l, String c, boolean f)
	{
		super(c,f);
		this.width=w;
		this.length=l;
	}

	public double getWidth()
	{
		return this.width;
	}

	public void setWidth(double w)
	{
		this.width=w;
	}

	public double getLength()
	{
		return this.length;
	}

	public void setLength(double l)
	{
		this.length=l;
	}

	public double getArea()
	{
		return this.length*this.width;
	}

	public double getPerimeter()
	{
		return 2*(this.length+this.width);
	}

	/*public String toString()
	{
		return getColor();
	}*/
}

class Square extends Rectangle
{
	public Square()
	{
		super();
	}

	public Square(double s)
	{
		super(s,s);
	}

	public Square(double s, String c, boolean f)
	{
		super(s,s,c,f);
	}

	public double getSide()
	{
		return getWidth();
	}

	public void setSide(double s)
	{
		//super(s,s);
		setWidth(s);
		setLength(s);
	}

	public double getArea()
	{
		return super.getArea();
	}

	public double getPerimeter()
	{
		return super.getPerimeter();
	}

	/*public String toString()
	{
		return getColor();
	}*/
}

class InheritShape
{
	static public void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		String c=input.next();
		boolean f=input.nextBoolean();
		double r = input.nextDouble();
		double w=input.nextDouble();
		double l=input.nextDouble();
		double s=input.nextDouble();
		Circle ob1= new Circle(r,c,f);
		System.out.println("Area of Circle is "+ob1.getArea()+" Perimeter is "+ob1.getPerimeter());//+" Color is "ob1.toString());
		Rectangle ob2= new Rectangle(w,l,c,f);
		System.out.println("Area of Rectangle is "+ob2.getArea()+" Perimeter is "+ob2.getPerimeter());//+" Color is "ob2.toString());
		Square ob3= new Square(s,c,f);
		System.out.println("Area of Square is "+ob3.getArea()+" Perimeter is "+ob3.getPerimeter());//+" Color is "ob3.toString());
	}
}