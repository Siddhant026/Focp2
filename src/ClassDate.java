import java.util.*;

class Date
{
	int month, day, year;
	Date()
	{
		this.month=1;
		this.day=1;
		this.year=2000;
	}
	Date(int m, int d, int y)
	{
		this.month=m;
		this.day=d;
		this.year=y;
	}
	void Display()
	{
		System.out.println("Date is "+month+"/"+day+"/"+year);
	}
}
class ClassDate
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int m,d,y;
		System.out.println("Enter the date");
		m=in.nextInt();
		d=in.nextInt();
		y=in.nextInt();
		Date d1 = new Date(m,d,y);
		d1.Display();
	}
}