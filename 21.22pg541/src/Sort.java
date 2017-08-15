import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Sort {
	
	public static void main(String[] args)
	{
	BufferedReader input=null;
	PrintWriter output=null;
	
	try {
		String fileInName=null;
		String fileOutName=null;
	Scanner in =new Scanner(System.in);
			try
			{
		fileInName=in.nextLine();
		fileOutName=in.nextLine();
		in.close();
			}
		catch(Exception e){System.out.println(e.getMessage());}
			input=new BufferedReader(new FileReader(fileInName));
			output=new PrintWriter(new FileWriter(fileOutName));
			List<String> house= new ArrayList<String>();
			String current = new String();
			while((current=input.readLine())!=null)
				house.add(current);
			int i=0;
			for( i=0;i<house.size();i+=2)
				output.println((i+1)+" "+house.get(i));
			if(house.size()%2!=0)i-=2;//starting pos will be 3 elements further left
			for(int j=i;j>1;j-=2)//start from 0
				output.println(j+" "+house.get(j-1));
		}
		
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
		finally{
			
			try {
				output.close();
				input.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
