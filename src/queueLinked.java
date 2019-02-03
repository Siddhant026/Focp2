import java.util.*;

class Stack
{
	private LinkedList<Integer> arr;

	public Stack()
	{
		arr = new LinkedList<Integer>(); 
	}

	public void push(int a)
	{
		arr.add(a);
	}

	public int pop()
	{
		return arr.removeFirst();
	}

	public boolean hasP()
	{
		ListIterator<Integer> itr = arr.listIterator(arr.size());
		return itr.hasPrevious();
	}

	public void Display()
	{
		System.out.println(arr);
	}
}

class queueLinked
{
	static public void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		Stack ob= new Stack();
		//String c;
		//boolean b=false;
		/*do
		{
			//System.out.println("error3");
			System.out.println("enter element");
			ob.push(input.nextInt());
			System.out.println("do you want to enter another element? (Answer with yes or no)");
			//System.out.println("Error1");
			c=input.next();
			if(c=="yes")
				b=true;
			//System.out.println("error2");
		}while(b);
		*/

		ob.push(1);
		ob.push(2);
		ob.push(3);
		ob.push(4);

		ob.Display();

		System.out.println("time to pop elements");
		/*do 
		{
			ob.pop();
			System.out.println("do you want to pop another element? (Answer with yes or no)");
			c=input.next();
		}while((c=="yes")&&(ob.hasP()));
		*/

		ob.pop();
		ob.pop();

		ob.Display();
	}
}