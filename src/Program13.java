import java.util.*;
import java.lang.*;

class Program13
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		int[] a = new int[5];
		int[] b = new int[3];
		int[] c = new int[8];
		int i,j=0,temp;
		System.out.println("Enter the Array1 of 5 elements");
		for(i=0;i<5;i++)
		{
			a[i]=input.nextInt();
		}
		System.out.println("Enter the Array2 of 3 elements");
		for(i=0;i<3;i++)
		{
			b[i]=input.nextInt();
		}
		//System.out.println(j+"Outside loop");
		for(i=0;i<5;i++)
		{
			c[j]=a[i];
			++j;
			//System.out.println(j);
		}
		//++j;
		//System.out.println(j+"Outside 1st loop");
		j=4;
		for(i=0;i<3;i++)
		{
			c[j]=b[i];
			++j;
			//System.out.println(j);
		}
		//System.out.println(j+"Outside 2nd loop");
		for (i=0;i<8;i++) 
        {
            for (j=i+1;j<8;j++) 
            {
                if (c[i] > c[j]) 
                {
                    temp = c[i];
                    c[i] = c[j];
                    c[j] = temp;
                }
            }
        }
        System.out.println("Merged Array is ");
        for(i=0;i<8;i++)
		{
			System.out.println(c[i]);
		}
	}
}