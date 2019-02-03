package com.ncu.assignment.exception;
import com.ncu.assignment.main.*;

public class MandatoryMissingException extends Exception
{
	public MandatoryMissingException(String s)
	{
		super(s);
	}
}

public class DateFormatException extends Exception
{
	public DateFormatException(String s)
	{
		super(s);
	}
}

public class com_ncu_assignment_validation_StudentValidationMessage
{
	public static String s1="invalid Date format";
	public static String s1="right Date format";
	public static String s1="data missing";
	public static String s1="data not missing";
	public static String s1="Cannot have no Skills and no Qualifications";
	public static String s1="Valid participant";
}

public class com_ncu_assignment_validation_StudentValidation extends com_ncu_assignment_validation_StudentValidation
{
	public static void DateFormat(Date d)throws DateFormatException
	{
		if((d.day<=0)||(d.day>=30)||(d.month<=0)||(d.month>12)||(d.year<=0))
		{
			throw new DateFormatException(s1);
		}
		else 
		{
			System.out.println(s2);
		}
	}

	public static void Missing(String fname, Address add, Date dob, String email, String contactNo)
	{
		if((fname==null)||(add.line1==null)||(add.line2==null)||(add.city==null)||(add.state==null)||(add.pinCode==0)||(dob.day==0)||(dob.month<=0)||(dob.year<=0)||(email==null)||(contactNo==null))
		{
			throw new MandatoryMissingException(s3);
		}
		else 
		{
			System.out.println(s4);
		}
	}

	static void NumberOfSQ(int x, int v)
	{
		if((x<=0)||(v<=0))
		{
			throw new MandatoryMissingException(s5);
		}
		else
		{
			System.out.println(s6);
		}
	}
}