import java.util.*;

abstract class Figure
{
	double dim1;
    double dim2;
    Figure(double a, double b) 
    {
       dim1 = a;
       dim2 = b;
    }
    // area is now an abstract method
    abstract double area();
}

class Rectangle extends Figure 
{
   Rectangle(double a, double b) 
   {
   super(a, b);
   }
   // override area for rectangle
   double area() 
   {
    System.out.println("Inside Area for Rectangle.");
    return dim1 * dim2;
   }
}

class AbstractEx
{
	static public void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		double a,b;
		a=input.nextDouble();
		b=input.nextDouble();
		Rectangle ob = new Rectangle(a,b);
		System.out.println("area is "+ob.area());
	}
}