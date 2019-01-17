import java.util.*;

class Sales 
{
	public static void main(String args[])
	{
		int[] rsum = new int[6];
		int[] csum = new int[5];
		Scanner in = new Scanner(System.in);
		int[][] a = new int[6][5];
		int i,j,k;
		System.out.println("Enter product wise");
		//for (k=0;i<7;k++)
		//{
			//System.out.println("for Day "+(k+1)+" enter data");
			System.out.println("enter data");
			for (i=0;i<4;i++)
			{
				for (j=0;j<5;j++)
				{
					a[j][i]=in.nextInt();
				}
			}
		    //System.out.println("for Day "+(k+1)+" out data");
		    System.out.println("out data");
		    for (i=0;i<5;i++)
		    {
			    for (j=0;j<4;j++)
			    {
				    System.out.print(a[i][j]+"\t");
			    }
			    System.out.print("\n");
		    }
		    for (i=0;i<5;i++)
		    {
			    for (j=0;j<4;j++)
			    {
			    	rsum[i]+=a[i][j];
			    }
			}
			for (i=0;i<5;i++)
		    {
			    for (j=0;j<5;j++)
			    {
			    	csum[i]+=a[j][i];
			    }
			}
			for (i=0;i<6;i++)
			{
				a[i][4]=rsum[i];
			}
			for (i=0;i<5;i++)
			{
				a[5][i]=csum[i];
			}
			//System.out.println("for Day "+(k+1)+" final out data");
			System.out.println("final out data");
		    for (i=0;i<6;i++)
		    {
			    for (j=0;j<5;j++)
			    {
				    System.out.print(a[i][j]+"\t");
			    }
			    System.out.print("\n");
		    }
	    //}
	}
}