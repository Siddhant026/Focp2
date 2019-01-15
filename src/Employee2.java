import java.util.*;

class Employee
{
	String name, address;
	double year, salary;
	Employee()
	{
		name="Ram";
		address="64C Vasant Kunj 110070";
		year=1994;
		salary=1000000;
	}
	Employee(String n, String a, double y, double s)
	{
		name=n;
		address=a;
		year=y;
		salary=s;
	}
	void Display()
	{
		System.out.println(name+"\t"+year+"\t"+address);
	}
}
class Employee2
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		String n,a;
		double y,s;
		int c,i;
		System.out.println("Enter the number of employees");
		c=in.nextInt();
		Employee e[] = new Employee[c];
		for (i=0;i<c;i++)
		{
			System.out.println("Enter name, year of joining, address and salary");
		    n=in.nextLine();
		    System.out.println("name entered");
		    y=in.nextDouble();
		    a=in.nextLine();
		    s=in.nextDouble();
		    e[i]= new Employee(n,a,y,s);
		}
		System.out.println("Name\tYear of joining\tAddress");
		for (i=0;i<c;i++)
		{
			e[i].Display();
		}
	}
}