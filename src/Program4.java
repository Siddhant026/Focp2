import java.util.*;

class Program4
{
	public static void main (String args[])
	{
		Scanner input = new Scanner(System.in);
		double m,y,mon,d;
		System.out.println("Enter minutes");
		m = input.nextDouble();
		y=m/525600;
		m=m%525600;
		mon=m/43800;
		m=m%43800;
		d=m/1440;
		System.out.println("m minutes = " + y + " years and " + mon + " months and " + d + " days");
	}
}