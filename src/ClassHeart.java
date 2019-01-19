import java.util.*;

class Date
{
	private int day, month, year;

	/*Date(int d, int m, int y)
	{
		this.day=d;
		this.month=m;
		this.year=y;
	}*/

	public void set(int d, int m, int y)
	{
		//Scanner input = new Scanner(System.in);
		//System.out.println("Enter date");
		this.day=d;
		this.month=m;
		this.year=y;
	}

	public int getday()
	{
		return day;
	}
	public int getmonth()
	{
		return month;
	}
	public int getyear()
	{
		return year;
	}
}

class HeartRate
{
	int age, mhr,thr;
	String fname, lname;
	Date date;

	HeartRate(String f, String l, int d, int m, int y)
	{
		fname=f;
		lname=l;
		date = new Date();
		date.set(d,m,y);
	}

	int age()
	{

		age= 2019-date.getyear();
		if (1-date.getmonth()<0)
			--age;
		else if (18-date.getday()<0)
			--age;
		//System.out.print(age);
		return age;
	}
	int maxhr()
	{
		mhr = 220-age;
		return mhr;
		//System.out.print(mhr);
	}
	int tarhr()
	{
		thr = mhr/2;
		return thr;
		//System.out.print(thr);
	}
	public int getday()
	{
		return date.getday();
	}
	public int getmonth()
	{
		return date.getmonth();
	}
	public int getyear()
	{
		return date.getyear();
	}
	void Display()
	{
		System.out.println("Name is "+fname+" "+lname+"\nDob is "+getday()+"/"+getmonth()+"/"+getyear()+"\nAge is "+age()+"\nMaximum hear rate is "+maxhr()+"\nTarget heart rate is "+tarhr());
	}
}

class ClassHeart
{
	static public void main(String args[])
	{
		int i;
		int[] d = new int[2];
		int[] m = new int[2];
		int[] y = new int[2];
		String f,l;
		HeartRate[] ob = new HeartRate[2];
		Scanner input = new Scanner(System.in);
		for (i=0;i<2;i++)
		{
			System.out.println("Enter Name and DOB");
		    f=input.nextLine();
		    l=input.nextLine();
		    System.out.println("name entered now enter dob");
		    d[i]=input.nextInt();
		    System.out.println("date entered");
		    m[i]=input.nextInt();
		    System.out.println("month entered");
		    y[i]=input.nextInt();
		    System.out.println("year entered");
		    ob[i]=new HeartRate(f,l,d[i],m[i],y[i]);
		    //ob[i].tarhr(ob[i].maxhr(ob[i].age()));
		    //ob[i].Display(ob[i].age(),ob[i].maxhr(ob[i].age()),ob[i].tarhr(ob[i].maxhr(ob[i].age())));
		    ob[i].Display();
		}
	}
}