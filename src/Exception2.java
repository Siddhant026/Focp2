class exception extends Exception
{
	//String s1;

	exception(String s)
	{
		super(s);
		//throw new Exception("Error");
	}
}

class Exception2
{
	static public void main(String args[])throws exception
	{
		try
		{
			exception ob1 = new exception("hello");
			throw new exception("Error");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("I am here");
		}
	}
}