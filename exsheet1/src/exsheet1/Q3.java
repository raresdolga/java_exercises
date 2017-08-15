package exsheet1;
import java.util.ArrayList;
import java.util.Collections;
public class Q3 {
	 static ArrayList<String> myStr= new ArrayList<String>();
	public void getInput()
	{	
		Input in = new Input();
		int i=0;
		while(i<=9)
		{
			myStr.add(in.next());
			i++;
		}
	}
		public void reverse1()
		{
			getInput();
			Collections.sort(myStr);
			Collections.reverse(myStr);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Q3 vector= new Q3();
	vector.reverse1();
		for(String n:myStr)
			System.out.println(n);

	}

}
