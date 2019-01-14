import java.util.*;
import java.lang.*;

class Program9
{
	public static void main (String args[])
	{
		int[] a = new int[10];
		int i=0,b,c=0;
		Scanner consoleInput = new Scanner(System.in);
		System.out.println("enter the elements");
		for (i=0;i<10;i++)
		{
			a[i]=consoleInput.nextInt();
		}
		System.out.println("The array is ");
		for (i=0;i<10;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("Enter the number you want to find ");
		b=consoleInput.nextInt();	
		for (i=0;i<10;i++)
		{
			if (a[i]==b)
			{
				System.out.println("Index is " + i);
				//System.out.println(i);
				c=1;
			}
		}
		if (c!=1)
		{
			System.out.println("Index is -1");
		}
	}
}