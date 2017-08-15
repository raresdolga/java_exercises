
import java.util.Scanner;
public class Error {
private boolean digit(String measure)
{
	boolean ok=measure.length()!=0;
	int count=0;
	while(count<measure.length()&&ok==true)
	{
		if(Character.isDigit(measure.charAt(count))!=true)ok=false;
		count++;
	}
	return ok;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Error error=new Error();
		Scanner in= new Scanner(System.in);
		while(in.hasNextInt())
		{		
		try{
		String a=in.nextLine();
		String b=in.nextLine();
		String c= in.nextLine();
		/*if((error.digit(a)&&error.digit(b)&&error.digit(c))==false)
			System.out.println("wronng input");
		 */
		
		int width=Integer.parseInt(a);
		int depth=Integer.parseInt(b);
		int volume=Integer.parseInt(c);
		System.out.println("volume= "+ width*depth*volume);
		}
		catch(Exception exception)
		{
			System.out.println("not a good number");
			System.err.println(exception);
		}
		}
	}

}
