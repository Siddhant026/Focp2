import java.util.*;

class Address
{
	String fline,sline;
	double pin;

	Address(String f, String sl, double p)
	{
		fline=f;
		sline=sl;
		pin=p;
	}

	String getf()
	{
		return fline;
	}
	String gets()
	{
		return sline;
	}
	double getp()
	{
		return pin;
	}
}

class Employee
{
	String name;
	double year, salary;
	Address address;

	Employee()
	{
		name="Ram";
		//address="64C Vasant Kunj 110070";
		address=new Address("64C","Vasant Kunj",110070);
		year=1994;
		salary=1000000;
	}
	Employee(String n, String f, String sl, double p, double y, double s)
	{
		name=n;
		address=new Address(f,sl,p);
		year=y;
		salary=s;
	}
	void Display()
	{
		System.out.println(name+"\t"+year+"\t\t\t"+address.getf()+" "+address.gets()+" "+address.getp());
	}
}
public class CompEmployee2
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		String n,f,sl;
		double y,s,p;
		int c,i;
		System.out.println("Enter the number of employees");
		c=input.nextInt();
		Employee e[] = new Employee[c];
		for (i=0;i<c;i++)
		{
			System.out.println("Enter name, year of joining, address and salary");
		    n=input.next();
		    System.out.println("name entered, enter year");
		    y=input.nextDouble();
		    System.out.println("year entered, enter fline");
		    f=input.next();
		    System.out.println("fline entered, enter sline");
		    sl=input.next();
		    System.out.println("sline entered, enter pin");
		    p=input.nextDouble();
		    System.out.println("pin entered, enter salary");
		    s=input.nextDouble();
		    System.out.println("salary entered");
		    e[i]= new Employee(n,f,sl,p,y,s);
		}
		System.out.println("Name\tYear of joining\t\tAddress");
		for (i=0;i<c;i++)
		{
			e[i].Display();
		}
	}
}