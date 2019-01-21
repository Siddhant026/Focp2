import java.util.*;

class Vehicle
{
	void display()
	{
		System.out.println("this is vehicle");
	}
}

class Car extends Vehicle
{
	void display()
	{
		System.out.println("this is car");
	}
}

class Bike extends Vehicle
{
	void display()
	{
		System.out.println("this is bike");
	}
}

class VehicleTest
{
	static public void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		int n;
		System.out.println("enter n");
		n=input.nextInt();
		switch(n)
		{
			case 2:
			Bike b = new Bike();
			b.display();
			break;
			case 4:
			Car c = new Car();
			c.display();
			break;
			default :
			Vehicle v= new Vehicle();
			v.display();
			break;
		}
	}
}