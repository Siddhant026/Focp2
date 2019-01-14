import java.util.*;
import java.lang.*;

class Program5
{
	public static void main(String args[])
	{
		Scanner consoleInput = new Scanner (System.in);
		double a,b,c,root,root1,root2;
		System.out.println("Type a,b,c of a Quadratic equation");
		a = consoleInput.nextDouble();
		b = consoleInput.nextDouble();
		c = consoleInput.nextDouble();
		System.out.println("Quadratic Equation is " + a +"x^2" + b + "x" + c + "=0");
		double d = b * b - 4 * a * c;
		if (d>0)
		{
			System.out.println("roots are unequal");
			root1 = (-b+Math.sqrt(d))/(2*a);
			root2 = (-b-Math.sqrt(d))/(2*a);
			System.out.println("root1 = " + root1);
			System.out.println("root2 = " + root2);
		}
		else if (d==0)
		{
			System.out.println("roots are equal");
			root = (-b+Math.sqrt(d))/(2*a);
			System.out.println("root = " + root);
		}
		else 
		{
			System.out.println("roots are not real");
		}
	}
}