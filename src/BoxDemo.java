import java.util.*;
//Scanner in = new Scanner(System.in);

class Box
{
	double width,height,depth;
	void setDim()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Dimentions");
		width=in.nextDouble();
		height=in.nextDouble();
		depth=in.nextDouble();
	}
	double volume()
	{
		double vol=width*height*depth;
		return vol;
	}
}

class BoxDemo
{
	public static void main(String args[])
	{
		Box b1 = new Box();
		double v;
		b1.setDim();
		v=b1.volume();
		System.out.println("Volume is "+v);
	}
}