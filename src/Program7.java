import java.util.*;

class Program7
{
	public static void main (String args[])
	{
		Scanner in = new Scanner(System.in);
		boolean ch=true,cj=true;
		String e,f;
		double a,b;
		int c,d;
		System.out.println("Enter 2 floating point Numbers with 3 decimal places");
		//a=in.nextDouble();
		//b=in.nextDouble();
		//e=in.nextLine();
		//f=in.nextLine();
		String regex = "[+-]?[0-9]+(\\.[0-9]+)?([Ee][+-]?[0-9]+)?";
		Pattern p = Pattern.compile(regex);
		do//while (i==1)
		{
		e=in.nextLine();
		Matcher m = p.matcher(e);
		if(m.find() && m.group().equals(e))
		{
		a=Float.parseFloat(e);
		a=a*1000;
		c = (int) a;
		ch=false;
        }
        else
        	System.out.println("Data is not a Number\nEnter again");
        }while(ch);
        do//while (j==1)
        {
        f=in.nextLine();
        m = p.matcher(f);
		if(m.find() && m.group().equals(f))
	    {
		b=Float.parseFloat(f);
		b=b*1000;
		d = (int) b;
		cj=false;
	    }
	    else 
	    	System.out.println("Data is not a Number\nEnter again");
        }while(cj)
		if (c==d)
		{
			System.out.println("Equal");
		}
		else 
		{
		System.out.println("Not Equal");	
		}
	}
}