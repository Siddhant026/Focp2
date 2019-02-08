import java.util.*;
import java.io.*;

class InvalidInput extends Exception
{
	InvalidInput(String s)
	{
		super(s);
	}
}

class TestSecond
{
	static void test(int s)throws InvalidInput
	{
		if ((s<=0)||(s>=60))
		{
			throw new InvalidInput("Invalid Input");
		}
		else
			s=1;
	}
}

class TestMinute
{
	static void test(int m)throws InvalidInput
	{
		if ((m<=0)||(m>=60))
		{
			throw new InvalidInput("Invalid Input");
		}
		else
			m=1;
	}
}

class TestHour
{
	static void test(int h)throws InvalidInput
	{
		if ((h<=0)||(h>=24))
		{
			throw new InvalidInput("Invalid Input");
		}
		else
			h=1;
	}
}

class MyTime
{
	private int second, minute, hour;

	public MyTime()
	{
		this.second=1;
		this.minute=1;
		this.hour=1;
	}

	public MyTime(int s, int m, int h)
	{
		try
		{
			TestSecond.test(s);
		    TestMinute.test(m);
		    TestHour.test(h);
		    this.second=s;
		    this.minute=m;
		    this.hour=h;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	public void setTime(int s, int m, int h)
	{
		try
		{
			TestSecond.test(s);
		    TestMinute.test(m);
		    TestHour.test(h);
		    this.second=s;
		    this.minute=m;
		    this.hour=h;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	public int getSecond()
	{
		return this.second;
	}

	public int getMinute()
	{
		return this.minute;
	}

	public int getHour()
	{
		return this.hour;
	}	

	public void setSecond(int s)
	{
		try
		{
			TestSecond.test(s);
		    this.second=s;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	public void setMinute(int m)
	{
		try
		{
			TestMinute.test(m);
		    this.minute=m;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	public void setHour(int h)
	{
		try
		{
			TestHour.test(h);
		    this.hour=h;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	public void Display()
	{
		//return System.out.println(String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond()));
		System.out.println(String.format("Time is %02d:%02d:%02d", getHour(), getMinute(), getSecond()));
	}

	public MyTime nextSecond()
	{
		MyTime t = new MyTime();
		t.second=this.second+1;
		t.minute=this.minute;
		t.hour=this.hour;
		if(t.second>=60)
		{
			t.minute++;
			if(t.minute>=60)
			{
				t.hour++;
				if(t.hour<=24)
				{
					return t;
				}
				else
				{
					t.second=0;
					t.minute=0;
					t.hour=0;
					return t;
				}
			}
			else 
				return t;
		}
		else
			return t;
	}

	public MyTime nextMinute()
	{
		MyTime t = new MyTime();
		t.second=this.second;
		t.hour=this.hour;
		t.minute=this.minute+1;
		if(t.minute>=60)
		{
			t.hour++;
			if(t.hour<=24)
			{
				return t;
			}
			else
			{
				t.second=0;
				t.minute=0;
				t.hour=0;
				return t;
			}
		}
		else
			return t;
	}

	public MyTime nextHour()
	{
		MyTime t = new MyTime();
		t.second=this.second;
		t.minute=this.minute;
		t.hour=this.hour+1;
		if(t.hour<=24)
		{
			return t;
		}
		else
		{
			t.second=0;
			t.minute=0;
			t.hour=0;
			return t;
		}
	}

	public MyTime previousSecond()
	{
		MyTime t = new MyTime();
		t.minute=this.minute;
		t.hour=this.hour;
		t.second=this.second-1;
		if(t.second<=0)
		{
			t.minute--;
			if(t.minute<=0)
			{
				t.hour--;
				if(t.hour>=0)
				{
					return t;
				}
				else
				{
					t.second=0;
					t.minute=0;
					t.hour=0;
					return t;
				}
			}
			else
				return t;
		}
		else 
			return t;
	}

	public MyTime previousMinute()
	{
		MyTime t = new MyTime();
		t.second=this.second;
		t.hour=this.hour;
		t.minute=this.minute-1;
		if(t.minute<=0)
		{
			t.hour--;
			if(t.hour>=0)
			{
				return t;
			}
			else
			{
				t.second=0;
				t.minute=0;
				t.hour=0;
				return t;
			}
		}
		else 
			return t; 
	}

	public MyTime previousHour()
	{
		MyTime t = new MyTime();
		t.second=this.second;
		t.minute=this.minute;
		t.hour=this.hour-1;
		if(t.hour>=0)
		{
			return t;
		}
		else
		{
			t.second=0;
			t.minute=0;
			t.hour=0;
			return t;
		}
	}
}

class TestMyTime
{
	static public void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("enter second, minute and hour");
		int s=input.nextInt();
		int m=input.nextInt();
		int h=input.nextInt();
		try
		{
			MyTime ob = new MyTime(s,m,h);
			ob.Display();
			System.out.println("after + 1 second of original");
			MyTime ob1= new MyTime();
			ob1=ob.nextSecond();
			ob1.Display();
			System.out.println("after -1 minute of original");
			MyTime ob2= new MyTime();
			ob2=ob.previousMinute();
			ob2.Display();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}