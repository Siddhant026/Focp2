import java.io.*;
import java.util.*;

class FileInputOutput
{
	static public void main(String args[])
	{
		try
		{
			File f = new File("file1.txt");
			FileWriter fout = new FileWriter(f);
			BufferedWriter bout = new BufferedWriter(fout);
			Scanner input = new Scanner(System.in);
			System.out.println("Enter Data");
			//while(input.hasNext())
			//{
				bout.write(input.nextInt());
				bout.write(input.next());
				bout.write(input.nextDouble());
				bout.write(input.next());
				//bout.newLine();
			//}
			bout.close();
			FileReader fin = new FileReader(f);
			BufferedReader bin= new BufferedReader(fin);
			int serialNo=bin.readInt();
			String name=bin.readLine();
			double cgpa=bin.readDouble();
			char grade=bin.readNext(); 
			//while((sr=bin.readLine())!=null)
			//{
				System.out.println(serialNo);
				System.out.println(name);
				System.out.println(cgpa);
				System.out.println(grade);
			//}
			bin.close();	
		}
		catch(Exception e)
			{
				System.out.println(e);
			}
	}
}