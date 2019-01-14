import java.util.*;

class Program11
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		int[] a = new int[5];
		int i,j;
		boolean ch=false,ob=false;
		System.out.println("Input 5 array elements with elements between 10 and 100 included");
		a[0]=input.nextInt();
		if((a[0]>=10)&&(a[0]<=100))
					System.out.println("Element is "+a[0]);
				else
				{
					System.out.println("Input again");
					a[0]=input.nextInt();
				}
		for (i=1;i<5;i++)
		{
			//a[i]=input.nextInt();
			do
			{
				ch=false;
				ob=false;
				a[i]=input.nextInt();
				if((a[i]>=10)&&(a[i]<=100))
				{
			for (j=i-1;j>=0;j--)
			{
				if((a[i]!=a[j]))
				{
					//System.out.println("Element is "+a[i]);
					ob=true;
				}
				else 
				{
					ob=false;
					break;
				}
			}
			if (ob)
				System.out.println("Element is "+a[i]);
		}
		else
		{
			ch=true;
			System.out.println("Input again");
		}
		}while(ch);
		}
	}
}