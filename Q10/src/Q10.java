import java.util.Scanner;
public class Q10 {

	public static String getInput()
	{
		Scanner input = new Scanner(System.in);
		return input.nextLine();

	}

	public static String reverse(final String s)
	{
		int i=0;
		String result=new String();
		while(i<s.length())
		{
			result = new Character(s.charAt(i)).toString() + result; // char ii primitiv si nu poti aplica to string
			// decat daca faci un obiect nou de tipul Character , asta nu ii primitiv
			i++;
		}
		System.out.println(result);
		return result;
	}
	
	private static String correct( final String s)
	{
		String result = new String();
		String array=new String("qwertyuiopasdfghjklzxcvbnm");
		int i=0;
		while(i<s.length())
		{
			if(array.indexOf(s.charAt(i))!=-1)
				result = result + new Character(s.charAt(i)).toString();
			i++;
		}
		return result;
	}
	
	private static String tiny(final String s)
	{
		return s.replaceAll(" ","").toLowerCase();
	}
	
	public void run()
	{
		String m= new String();
		m=tiny(getInput());
		m=correct(m);
		if(m.compareTo(reverse(m))==0)
			System.out.println("true");
		else
			System.out.println("false");

	}
	
	public static void main(String [] args)
	{
		Q10 obj =new Q10();
		obj.run();
	}
}
