import java.util.*;
import java.io.*;

class FileSearch
{
	static public void main(String args[])
	{
		try
	    {
		    File f = new File("search.txt");
		    FileWriter fout = new FileWriter(f);
		    BufferedWriter bout = new BufferedWriter(fout);
		    Scanner input = new Scanner(System.in);
		    while(input.hasNext())
		    {
               bout.write(input.nextLine());
               bout.newLine();
            }
            bout.close();
            Scanner inp = new Scanner(System.in);
            System.out.println("Enter the word you want to find");
            //bout.write(input.next());
            String w = inp.next();
            String s;
            boolean flag=true;
            FileReader fin = new FileReader(f);
	        BufferedReader bin= new BufferedReader(fin);
	        while((s=bin.readLine())!=null)
			{
				int i=0;
				String[] strs = s.split(" ");
				//System.out.println(strs[0]+" "+strs[1]+" "+strs[2]+" "+strs[3]);
				for (i=0;i<strs.length;i++)
				{
					if(strs[i].equals(w)){
				 //System.out.print("Present");
				flag=false;
				break;
			       }
				}
				
			}
			if(flag==false)
				System.out.print("Present");
            /*while((s=bin.readLine())!=null && flag){
            	 if(s.equals("me")){
				 System.out.print("Present");
				flag=false;
			}*/
			bin.close();
	    }
	
	catch(Exception e)
	{
		System.out.println(e);
	}
}
}