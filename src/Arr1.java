import java.util.*;

class Arr1
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		int[][] a = new int[2][2];
		int i,j;
		boolean ch=false;
		System.out.println("Enter Array");
		for (i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				do
				{
					a[i][j]=input.nextInt();
					if ((a[i][j]<=10)&&(a[i][j]>=100))
					{
						ch=true;
						System.out.println("Error\nEnter again");
					}
				}while(ch);
			}
		}
		System.out.println("Printing the Array");
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				if (a[i][j]%2==0)
				{
					System.out.print(a[i][j]+"\t\t\t\t\t");
					continue;
				}
				else 
					System.out.print(2*a[i][j]+"\t\t\t\t\t");
			}
			System.out.print("\n");
		}
	}
}