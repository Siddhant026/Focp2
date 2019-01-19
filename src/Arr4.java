import java.util.*;

class Arr4
{
	static public void main(String args[])
	{
		int[] rsum = new int[10];
		//int[] csum = new int[5];
		int[][] a = new int[10][];
		int i,j,n;
		Scanner input = new Scanner(System.in);
		for (i=0;i<(a.length);i++)
		{
			System.out.println("enter number of subjects for student "+(i+1));
			n=input.nextInt();
			++n;
			a[i]=new int[n];
			for (j=0;j<(a[i].length-1);j++)
			{
				System.out.println("Enter marks of subject "+(j+1));
				a[i][j]=input.nextInt();
			}
		}
		//i=a.length;
		//a[i]=new int[5];
		System.out.println("out data");
		for (i=0;i<(a.length);i++)
		{
			for (j=0;j<(a[i].length-1);j++)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.print("\n");
		}
		System.out.println("out data done");
		for (i=0;i<a.length;i++)
		{
			for (j=0;j<a[i].length;j++)
			{
				rsum[i]+=a[i][j];
			}
		}
		System.out.println("rsum done");
		for (i=0;i<a.length;i++)
		{
			a[i][a[i].length-1]=rsum[i];
		}
		System.out.println("final out data");
		for (i=0;i<(a.length);i++)
		{
			for (j=0;j<(a[i].length);j++)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.print("\n");
		}
	}
}