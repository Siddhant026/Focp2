import java.util.*;
import java.lang.*;

class Pts
{
	static private double x1,x2,y1,y2;

	/*public Pts()
	{
		x=0;
		y=0;
	}
	public Pts(double a)
	{
		x=a;
		y=a;
	}
	public Pts(double a, double b)
	{
		x=a;
		y=b;
	}*/
	static void set()
	{
		System.out.println("Enter value of x1, y1, x2, y2");
		Scanner input = new Scanner(System.in);
		x1=input.nextDouble();
		y1=input.nextDouble();
		x2=input.nextDouble();
		y2=input.nextDouble();
	}
	/*public void Display()
	{
		System.out.println("x= "+x+"\ny= "+y);
	}*/
	static public void Distance()
	{
		double dist;
		dist=Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2));
		System.out.println(dist);	
	}
	/*public double getx()
	{
		return x;
	}
	public double gety()
	{
		return y;
	}*/
}

class StaticDistBtPts
{
	/*static void Distance(Pts ob1, Pts ob2)
	{
		double dist;
		dist=Math.sqrt(Math.pow(ob1.getx()-ob2.getx(),2)+Math.pow(ob1.gety()-ob2.gety(),2));
		System.out.println(dist);	
	}*/

	public static void main(String args[])
	{
		Pts.set();
		Pts.Distance();
	}
}