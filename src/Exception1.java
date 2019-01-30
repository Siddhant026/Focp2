import java.util.*;
import java.lang.*;

class Exception1
{
	static public void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		int n=input.nextInt();
		switch(n)
		{
			case 1:
			try
			{
				int data=100/0;
			}
			catch(ArithmeticException e)
			{
				System.out.println(e);
			}
			break;
			case 2:
			try
			{
				String data=null;
				System.out.println(data.length());
			}
			catch(NullPointerException e)
			{
				System.out.println(e+" null pointer");
			}
			break;
			case 3:
			try
			{
				String data ="abc";
				int i = Integer.parseInt(data);
			}
			catch(NumberFormatException e)
			{
				System.out.println(e+" Number format");
			}
			break;
			case 4:
			try
			{
				int[] data=new int[5];
				data[10]=5;
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println(e);
			}
			break;
			case 5:
			try
			{
				int data=input.nextInt();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			break;
			case 6:
			try
			{
				throw new IllegalArgumentException("Invalid code");
			}
			catch(IllegalArgumentException e)
			{
				System.out.println(e);
			}
			break;
		}
	}
}