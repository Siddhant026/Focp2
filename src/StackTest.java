import java.util.*;

class Stack
{
	int[] a =new int[10];
	int top;

	void push(int n)
	{
		top=n-1;
		Scanner input = new Scanner(System.in);
		int i;
		System.out.println("enter elements of stack");
		for (i=0;i<=top;i++)
		{
			a[i]=input.nextInt();
		}
	}
	void pop(int ch)
	{
		int i,j,temp;
		for (i=0;i<=top;i++)
		{
			if (a[i]==ch)
			{
				for (j=i+1;j<=top;j++)
				{
					temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
				--top;
			}
		}
		System.out.println("after poping stack is ");
		for (i=0;i<=top;i++)
		{
		System.out.println(a[i]);	
		}
	}
	void isEmpty()
	{
		if (top==0)
			System.out.println("it is empty");
	}
	void isFull()
	{
		if (top==9)
			System.out.println("it is full");
	}
	void spaceLeft()
	{
		//if (top==0)
			System.out.println("space left is"+(9-top));
	}
}

class StackTest
{
	static public void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		Stack ob = new Stack();
		int n,c;
		System.out.println("enter size of stack");
		n=input.nextInt();
		ob.push(n);
		boolean b=false;
		do
		{
		System.out.println("enter 1 for pop\nenter 2 to check if empty\nenter 3 to check if full\nenter 4 to check if space is left");
		c=input.nextInt();
		switch(c)
		{
			case 1:
			int e;
			System.out.println("enter element to be popped");
			e=input.nextInt();
			ob.pop(e);
			break;
			case 2:
			ob.isEmpty();
			break;
			case 3:
			ob.isFull();
			break;
			case 4:
			ob.spaceLeft();
			break;
			default :
			System.out.println("Wrong choice\nenter again");
			b=true;
			break;
		}
	}while(b);
	}
}