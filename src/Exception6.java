class BaseException extends Exception 
{
	BaseException(String s)
	{
		super(s);
	}
}

class Base 
{
	Base()throws BaseException 
	{
		throw new BaseException("base Exception");
	}
}

class Derived extends Base 
{
	
	Derived() throws BaseException 
	{
		super();
	}
}

public class Exception6
{
	public static void main(String[] args) 
	{
		try 
		{
			Derived d = new Derived();
	    } 
	    catch(BaseException e) 
	    {
			System.out.println("BaseException caught in main()");
		}
			
	}
}