import java.util.*;

class CheckArgumentException extends Exception
{
	CheckArgumentException(String s)
	{
		super(s);
	}
}

class CheckException
{
	static void check(int a, int b, int c, int d, int e)throws CheckArgumentException
	{
		if ((a==0)||(b==0)||(c==0)||(d==0)||(e==0))
		{
			throw new CheckArgumentException("CheckArgumentException called");
		}
		else 
		{
			System.out.println("Sum is "+(a+b+c+d+e));
		}
	}
}

class Exception4
{
	static public void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		int a =input.nextInt();
		int b =input.nextInt();
		int c =input.nextInt();
		int d =input.nextInt();
		int e =input.nextInt();

		try
		{
			CheckException.check(a,b,c,d,e);
		}
		catch(Exception z)
		{
			System.out.println(z);
		}
	}
}