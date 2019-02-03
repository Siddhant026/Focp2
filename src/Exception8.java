class oneException extends Exception
{
	oneException(String s)
	{
		super(s);
	}
}

class twoException extends Exception
{
	twoException(String s)
	{
		super(s);
	}
}

class TestException
{
	static void g()throws oneException
	{
		throw new oneException("1st Exception");
	}

	static void f()throws oneException
	{
		g();
	}
}

class Exception8
{
	static public void main(String args[])
	{
		try
		{
			TestException.f();
		}
		catch(Exception e)
		{
		    System.out.println(e);	
			try
			{
				throw new twoException("2nd Exception");
			}
			catch(Exception f)
			{
				System.out.println(f);
			}
		}
	}
}