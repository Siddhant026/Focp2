import java.util.*;

class Employee
{
	String fname;
	String lname;
	double msal;
	Employee()
	{
		this.fname="Siddhant";
		this.lname="Sharma";
		this.msal=100000;
	}
	Employee(String f,String l,double m)
	{
		this.fname=f;
		this.lname=l;
		this.msal=m;
	}
	void YearSal()
	{
		double y;
		y=msal*12;
		System.out.println("yearly salary is "+y);
	}
	void Raise()
	{
		double r,y;
		y=msal*12;
		r=(y*10)/100+y;
		System.out.println("yearly salary after raise is "+r);
	}
	void Display()
	{
		System.out.println("name is "+fname+" "+lname+"\nmonthly salary is "+msal);
	}
}

class EmployeeTest
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		String f,l;
		double m;
		System.out.println("enter name and monthly salary for e2");
		f=in.nextLine();
		l=in.nextLine();
		m=in.nextDouble();
		Employee e1 = new Employee();
		Employee e2 = new Employee(f,l,m);
		System.out.println("printing e1");
		e1.YearSal();
		e1.Raise();
		e1.Display();
		System.out.println("printing e2");
		e2.YearSal();
		e2.Raise();
		e2.Display();
	}
}