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
				bout.write(Integer.toString(input.nextInt()));
				bout.write(' ');
				bout.write(input.next());
				bout.write(' ');
				bout.write(Double.toString(input.nextDouble()));
				bout.write(' ');
				bout.write(input.next().charAt(0));
				//bout.newLine();
			//}
			bout.close();
			FileReader fin = new FileReader(f);
			BufferedReader bin= new BufferedReader(fin);
			//int serialNo=bin.readInt();
			String sr;
			//double cgpa=bin.readDouble();
			//char grade=bin.readNext(); 
			while((sr=bin.readLine())!=null)
			{
				/*System.out.println(serialNo);
				System.out.println(name);
				System.out.println(cgpa);
				System.out.println(grade);*/
				String[] strs = sr.split(" ");
				System.out.println(strs[0]+" "+strs[1]+" "+strs[2]+" "+strs[3]);
			}
			bin.close();	
		}
		catch(Exception e)
			{
				System.out.println(e);
			}
	}
}