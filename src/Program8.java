import java.util.*;

class Program8
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		int[] a = new int[5];
		int n,i=1;
		boolean c=true;
		//n=input.nextInt();
		System.out.println("Enter the Number");
		do
		{
			n = input.nextInt();
			if (((n/10000)>=1)&&((n/10000)<=10))
				c=false;
			else 
				System.out.println("Number is not a 5 digit Number\nEnter the number again");
		}while(c);
		for (i=0;i<5;i++)
		{
			a[i]=n%10;
			n=n/10;
		}
		for (i=4;i>=0;i--)
		{
			System.out.println(a[i]);
		}
	}
}