package braket;
import java.util.ArrayList;
public class Q19 {
ArrayList<String> myArray= new ArrayList<String>();
int ok=0;
int lf=0,rgh=0;
	public void getFile(String s)
	{
	 FileInput input= new FileInput(s);
	 while(input.hasNext())
	 myArray.add(input.next());
	}
	public void check(String s)
	{
		int i;
		for(i=0;i<s.length()-1;i++)
		{
			if(s.charAt(i)=='{')lf++;
			else
				if(s.charAt(i)=='}')rgh++;
			if(s.charAt(i)=='/'&&s.charAt(i+1)=='/')
				break;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(-3*-2);
		Q19 a=new Q19();
		

	}

}
