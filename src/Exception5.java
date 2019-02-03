class A
{
	void th()throws Exception
	{
		throw new Exception("class A");
	}
}

class B extends A
{
	void th()throws Exception
	{
		throw new Exception("class B");
	}
}

class C extends B
{
	void th()throws Exception
	{
		throw new Exception("class C");
	}
}

class Exception5
{
	static public void main(String args[])
	{
		C ob = new C();
		try
		{
			ob.th();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
}