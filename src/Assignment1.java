import java.util.*;

class Date
{
	int day, month, year;

	Date(int d, int m, int y)
	{
		this.day=d;
	    this.month=m;
	    this.year=y;
	}

	void DisplayDate()
	{
		System.out.print(day+" "+month+" "+year+" ");
	}
}

class Address
{
	String line1, line2, city, state;
	int pinCode;

	Address(String l1, String l2, String c, String s, int p)
	{
		this.line1=l1;
		this.line2=l2;
		this.city=c;
		this.state=s;
		this.pinCode=p;
	}

	void DisplayAddress()
	{
		System.out.print(line1+" "+line2+" "+city+" "+state+" "+pinCode+" ");
	}
}

class Qualification
{
	String qualName, university, institute;
	double cgpa;

	Qualification(String q, String u, String i, double cgpa)
	{
		this.qualName=q;
		this.university=u;
		this.institute=i;
		this.cgpa=cgpa;
	}

	void DisplayQualification()
	{
		System.out.print(qualName+" "+university+" "+institute+" "+cgpa+" ");
	}
}

class Project
{
	String name, role;
	String[] responsibilities;
	Date startDate,endDate;
	int z;

	Project(String n,String r, int ds, int ms, int ys, int dl, int ml, int yl, int z)
	{
		int i;
		Scanner input = new Scanner(System.in);
	this.name=n;
	this.role=r;
	startDate= new Date(ds,ms,ys);
	endDate= new Date(dl,ml,yl);
	this.z=z;	
	this.responsibilities=new String[z];
	System.out.println("enter responsibilities");
	for(i=0;i<z;i++)
	{
		this.responsibilities[i]=input.next();
	}
	}

	void DisplayProject(int z)
	{
		int i;
		System.out.print(name+" "+role+" ");
		startDate.DisplayDate();
		System.out.print(" ");
		endDate.DisplayDate();
		System.out.print(" ");
		for (i=0;i<z;i++)
		{
			System.out.print(responsibilities[i]+" ");
		}
	}

	int getz()
	{
		return z;
	}
}

class Student 
{
	String firstName, lastName, eMail, contactNo;
	Address addr;
	Date dob;
	String[] skills;
	Qualification[] qual;
	Project[] projects;

	Student(String fn, String ln, String em, String cn, String l1, String l2, String c, String s, int p, int d, int m, int y, int x, int v, int b)
	{
		Scanner input = new Scanner(System.in);
		int j;
		firstName=fn;
		lastName=ln;
		eMail=em;
		contactNo=cn;
		addr=new Address(l1,l2,c,s,p);
	    dob=new Date(d,m,y);
	    skills=new String[x];
	    System.out.println("enter skills");
	    for(j=0;j<x;j++)
	    {
	    	skills[j]=input.next();
	    }
	    qual=new Qualification[v];
	    String q, u, i;
	    double cgpa;
	    for(j=0;j<x;j++)
	    {
	    	System.out.println("enter Qualification Name, university, institute, cgpa of number "+(j+1)+" Qualification");
	    	q=input.next();
	    	u=input.next();
	    	i=input.next();
	    	cgpa=input.nextDouble();
	    	qual[j]=new Qualification(q,u,i,cgpa);
	    }
	    projects= new Project[b];
	    String n, r;
	    String resp[];
	    int ds, ms, ys, dl, ml, yl, z;
	    for(j=0;j<b;j++)
	    {
	    	System.out.println("enter Project name, role, no. of responsibilities, startday, startmonth, startyear, finishday, finishmonth, finishyear of project number "+(j+1));
	    	n=input.next();
	    	r=input.next();
	    	z=input.nextInt();
	    	//h=z;
	    	ds=input.nextInt();
	    	ms=input.nextInt();
	    	ys=input.nextInt();
	    	dl=input.nextInt();
	    	ml=input.nextInt();
	    	yl=input.nextInt();
	    	projects[j] = new Project(n,r,ds,ms,ys,dl,ml,yl,z);
	    }
	}

	void DisplayStudent(int x, int v, int b)
	{
		int j;
		System.out.print(firstName+" "+lastName+" "+eMail+" "+contactNo+" ");
		for (j=0;j<x;j++)
		{
			System.out.print(skills[j]+" ");
		}
		addr.DisplayAddress();
		dob.DisplayDate();
		for (j=0;j<v;j++)
		{
			qual[j].DisplayQualification();
		}
		for (j=0;j<b;j++)
		{
			projects[j].DisplayProject(projects[j].getz());
		}
	}
}

class Assignment1
{
	static public void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		String fn, ln, em, cn, l1, l2, c, s;
		int p, d, m, y, x, v, b, n, i;	
		System.out.println("Enter the number of students");
		n=input.nextInt();
		Student[] student = new Student[n];
		for (i=0;i<n;i++)
		{
			System.out.println("Enter first name");
			fn=input.next();
			System.out.println("Enter last name");
			ln=input.next();
			System.out.println("Enter email");
			em=input.next();
			System.out.println("Enter contact number");
			cn=input.next();
			System.out.println("Enter Address\nEnter line 1");
			l1=input.next();
			System.out.println("Enter line 2");
			l2=input.next();
			System.out.println("Enter city");
			c=input.next();
			System.out.println("Enter state");
			s=input.next();
			System.out.println("Enter pincode");
			p=input.nextInt();
			System.out.println("Enter DOB");
			d=input.nextInt();
			m=input.nextInt();
			y=input.nextInt();
			System.out.println("Enter number of Skills");
			x=input.nextInt();
			System.out.println("Enter number of Qualifications");
			v=input.nextInt();
			System.out.println("Enter number of Projects");
			b=input.nextInt();
			student[i]=new Student(fn,ln,em,cn,l1,l2,c,s,p,d,m,y,x,v,b);
			student[i].DisplayStudent(x,v,b);
		}
	}
}