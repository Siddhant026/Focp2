package com.ncu.assignment;
import java.util.*;

public class Date
{
	public int day, month, year;

	public Date(int d, int m, int y)
	{
		this.day=d;
	    this.month=m;
	    this.year=y;
	}

	public void DisplayDate()
	{
		System.out.print(day+" "+month+" "+year+" ");
	}
}

public class Address
{
	public String line1, line2, city, state;
	public int pinCode;

	public Address(String l1, String l2, String c, String s, int p)
	{
		this.line1=l1;
		this.line2=l2;
		this.city=c;
		this.state=s;
		this.pinCode=p;
	}

	public void DisplayAddress()
	{
		System.out.print(line1+" "+line2+" "+city+" "+state+" "+pinCode+" ");
	}
}

public class Qualification
{
	public String qualName, university, institute;
	public double cgpa;

	public Qualification(String q, String u, String i, double cgpa)
	{
		this.qualName=q;
		this.university=u;
		this.institute=i;
		this.cgpa=cgpa;
	}

	public void DisplayQualification()
	{
		System.out.print(qualName+" "+university+" "+institute+" "+cgpa+" ");
	}
}

public class Project
{
	public String name, role;
	public String[] responsibilities;
	public Date startDate,endDate;
	public int z;

	public Project(String n,String r, int ds, int ms, int ys, int dl, int ml, int yl, int z)
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

	public void DisplayProject(int z)
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

	public int getz()
	{
		return z;
	}
}

public class Student 
{
	public String firstName, lastName, eMail, contactNo;
	public Address addr;
	public Date dob;
	public String[] skills;
	public Qualification[] qual;
	public Project[] projects;

	public Student(String fn, String ln, String em, String cn, String l1, String l2, String c, String s, int p, int d, int m, int y, int x, int v, int b)
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

	public void DisplayStudent(int x, int v, int b)
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