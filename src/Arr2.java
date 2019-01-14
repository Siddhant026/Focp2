import java.util.*;

class Arr2
{
	public static void print(int a[])
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(a[i]);
		}
	}
	public static int sum(int a[])
	{
		int sum=0;
		for(int i=0;i<5;i++)
		{
			sum+=a[i];
		}
		return sum;
	}
	public static int max(int a[])
	{
		int temp;
		for (int i = 0; i < 5; i++) 
        {
            for (int j = i + 1; j < 5; j++) 
            {
                if (a[i] > a[j]) 
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a[4];
	}
	public static int min(int a[])
	{
		int temp;
		for (int i = 0; i < 5; i++) 
        {
            for (int j = i + 1; j < 5; j++) 
            {
                if (a[i] > a[j]) 
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a[0];
	}
	public static int SecMax(int a[])
	{
		int temp;
		for (int i = 0; i < 5; i++) 
        {
            for (int j = i + 1; j < 5; j++) 
            {
                if (a[i] > a[j]) 
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a[3];
	}
	public static int AltSum(int a[])
	{
		int sum;
		for(int i=0;i<5;i+2)
		{
			sum+=a[i];
		}
		return sum;
	}
	public static int evenSum(int a[])
	{
		int sum;
		for(int i=0;i<5;i++)
		{
			if (a[i]%2==0)
				sum+=a[i];
		}
		return sum;
	}
	public static int Occ(int a[])
	{
		int c=0,ch;
		System.out.println("emter the number u want to find");
		Scanner in = new Scanner(System.in);
		ch=in.nextInt();
		for (int i=0;i<5;i++)
		{
			if (ch==a[i])
				c++
		}
		return ch
	}
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int[] a = new int[5];
		boolean ch=false;
		int n;
		
		do
		{
			n=in.nextInt();
			switch(n)
			{
				case 
			}
		}while(ch);
	}
}