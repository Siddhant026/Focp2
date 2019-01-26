import java.util.*;

class Point2D
{
	private double x,y;

	public Point2D()
	{
		this.x=0;
		this.y=0;
	}

	public Point2D(double x, double y)
	{
		this.x=x;
		this.y=y;
	}

	public double getx()
	{
		return this.x;
	}

	public double gety()
	{
		return this.y;
	}

	public void setx(double x)
	{
		this.x=x;
	}

	public void sety(double y)
	{
		this.y=y;
	}

	public double[] xy()
	{
		double[] arr = new double[2];
		arr[0]=getx();
		arr[1]=gety();
		return arr;
	}
}

class Point3D extends Point2D
{
	private double z;

	public Point3D()
	{
		super();
		this.z=0;
	}

	public Point3D(double x, double y, double z)
	{
		super(x,y);
		this.z=z;
	}

	public double getz()
	{
		return this.z;
	}

	public void setz(double z)
	{
		this.z=z;
	}

	public double[] xyz()
	{
		double[] arr = new double[3];
		arr[0]=getx();
		arr[1]=gety();
		arr[2]=getz();
		return arr;
	}
}

class Point 
{
	static public void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		double x=input.nextDouble();
		double y=input.nextDouble();
		double z=input.nextDouble();
		Point3D ob = new Point3D(x,y,z);
		double[] b= new double[3];
		b=ob.xyz();
		for (int i=0;i<3;i++)
		{
			System.out.println(b[i]);
		}
	}
}