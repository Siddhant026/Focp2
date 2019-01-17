import java.util.*;

class Pair
{
	public int x,y;

    public void set()
	{
		x=0;
		y=0;
	}
	public void set(int a, int b)
	{
		x=a;
		y=b;
	}
	public void set(int a)
	{
		x=a;
		y=a;
	}
	public int getx()
	{
		return x;
	}
	public int gety()
	{
		return y;
	}

	public void sort(Pair p[])
	{
	    int i,j;
	    Pair temp = new Pair();	
		for (i = 0; i < 4; i++) 
        {
            for (j = i + 1; j < 4; j++) 
            {
                if (p[i].gety() > p[j].gety()) 
                {
                    temp.x = p[i].x;
                    temp.y = p[i].y;
                    p[i].x = p[j].x;
                    p[i].y = p[j].y;
                    p[j].x = temp.x;
                    p[j].y = temp.y;
                }
            }
        }
        System.out.print("[");
		for (i=0;i<4;i++)
		{
			System.out.print("("+p[i].getx()+", "+p[i].gety()+"), ");
		}
		System.out.println("]");
	}
}

class SortClass
{
	/*static void sort(Pair p)
	{
	    int i,j;
	    Pair temp = new Pair();	
		for (i = 0; i < 4; i++) 
        {
            for (j = i + 1; j < 4; j++) 
            {
                if (p[i].gety() > p[j].gety()) 
                {
                    temp = p[i];
                    p[i] = p[j];
                    p[j] = temp;
                }
            }
        }
        System.out.print("[");
		for (i=0;i<4;i++)
		{
			System.out.print("("+p[i].getx()+", "+p[i].gety()+"), ");
		}
		System.out.print("]");
	}*/

	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		Pair[] p = new Pair[4];
		int a,b,i;
		for (i=0;i<4;i++)
		{
			System.out.println("Enter x and y of element "+(i+1));
			a=input.nextInt();
		    b=input.nextInt();
		    p[i] = new Pair();
		    p[i].set(a,b);
		}
		System.out.print("[");
		for (i=0;i<4;i++)
		{
			System.out.print("("+p[i].getx()+", "+p[i].gety()+"), ");
		}
		System.out.println("]\nAnswer is");
		Pair t = new Pair();
		t.sort(p);
	}
}