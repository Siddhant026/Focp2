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
	public static void sum(int a[])
	{
		int sum=0;
		for(int i=0;i<5;i++)
		{
			sum+=a[i];
		}
		System.out.println(sum);
	}
	public static void max(int a[])
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
        System.out.println(a[4]);
	}
	public static void min(int a[])
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
        System.out.println(a[0]);
	}
	public static void SecMax(int a[])
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
        System.out.println(a[3]);
	}
	public static void AltSum(int a[])
	{
		int sum=0,i;
		for(i=0;i<5;i+=2)
		{
			sum+=a[i];
		}
		System.out.println(sum);
	}
	public static void evenCount(int a[])
	{
		int count=0;
		for(int i=0;i<5;i++)
		{
			if (a[i]%2==0)
				count++;
		}
		System.out.println(count);
	}
	public static void Occ(int a[])
	{
		int c=0,ch;
		System.out.println("emter the number u want to find");
		Scanner in = new Scanner(System.in);
		ch=in.nextInt();
		for (int i=0;i<5;i++)
		{
			if (ch==a[i])
				c++;
		}
		System.out.println(c);
	}
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int[] a = new int[5];
		boolean ch=false;
		int n,i;
		System.out.println("Enter the array of 5 elements");
		for (i=0;i<5;i++)
		{
			a[i]=in.nextInt();
		}
		System.out.println("Enter 1 for Displaying Elements\nEnter 2 for Sum of elements\nEnter 3 for largest number in array\nEnter 4 for smallest element in array\nEnter 5 for second largest number in the array\nEnter 6 for seconf largest element\nEnter 7 for count of even numbers in array\nEnter 8 for occurrence of a given number and its frequency");
		do
		{
			n=in.nextInt();
			switch(n)
			{
				case 1:
				print(a);
				break;
				case 2:
				sum(a);
				break;
				case 3:
				max(a);
				break;
				case 4:
				min(a);
				break;
				case 5:
				SecMax(a);
				break;
				case 6:
				AltSum(a);
				break;
				case 7:
				evenCount(a);
				break;
				case 8:
				Occ(a);
				break;
				default :
				System.out.println("Wrong Input\nEnter again");
				ch=true;
				break;
			}
		}while(ch);
	}
}