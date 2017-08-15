import java.util.Scanner;
import java.util.ArrayList;
public class Q1 {
 
	public static void main(String [] args)
	{
		ArrayList<String> myArray=new ArrayList<String>();
		Scanner in = new Scanner(System.in);
		int i=0;
		while(i<5)
		{
			myArray.add(in.nextLine());
			i++;
		}
		String n=in.nextLine();
		int ok=0;
		for(String g:myArray)
		{
			if(g.equals(n)&&ok==0)
				{
				System.out.println(g);
				ok=1;
				}
		}
		if(ok==0)myArray.add(n);
	}
	
}
