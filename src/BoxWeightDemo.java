import java.util.*;

class Box
{
	double width, height, depth;

	Box()
	{
		this.width=0;
		this.height=0;
		this.depth=0;
	}

	Box(double w, double h, double d)
	{
		this.width=w;
		this.height=h;
		this.depth=d;
	}

	Box(Box b)
	{
		this.width=b.width;
		this.height=b.height;
		this.depth=b.depth;
	}

	double DisplayVolume()
	{
		double volume;
		volume=width*height*depth;
		return volume;
	}

	double getw()
	{
		return this.width;
	}

	double geth()
	{
		return this.height;
	}

	double getd()
	{
		return this.depth;
	}
}

class BoxWeight extends Box
{
	double weight;

	BoxWeight()
	{
	super();
	this.weight=0;	
	}

	BoxWeight(double w, double h, double d, double wt)
	{
		super(w,h,d);
		this.weight=wt;
	}

	BoxWeight(BoxWeight bw)
	{
		super(bw.weight,bw.height,bw.depth);
		this.weight=bw.weight;
	}

	double DisplayWeight()
	{
		return weight;
	}
}

class BoxWeightDemo
{
	static public void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		double w,h,d,wt;
		w=input.nextDouble();
		h=input.nextDouble();
		d=input.nextDouble();
		wt=input.nextDouble();
		BoxWeight b = new BoxWeight(w,h,d,wt);
		System.out.println(b.DisplayVolume()+" "+b.DisplayWeight());
	}
}