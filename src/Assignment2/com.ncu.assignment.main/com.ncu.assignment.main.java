package com.ncu.assignment.main;
import java.util.*;
import com.ncu.assignment.*;

public class Assignment1
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