import java.util.*;

class WrongNumber extends Exception
{
	WrongNumber(String s)
	{
		super(s);
	}
}

class CheckException
{
	static void check(int a)throws WrongNumber
	{
		if (a==619)
		{
			System.out.println("correct number");
		}
		else 
		{
			throw new WrongNumber("Wrong number bro");
		}
	}
}

class Exception7
{
	static public void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		try
		{
			CheckException.check(a);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	} 
}