import java.util.*;
public class TryCatch {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		try{
			Scanner in = new Scanner(System.in);
			int age = Integer.parseInt(in.nextLine());
			int ageNext=age+1;
			System.out.println(age);
			}
		catch(ArrayIndexOutOfBoundsException exception)
			{
			System.out.println("not a hole number ");
			System.out.println("Message was` "+exception.getMessage()+"`");//get the message of exception 
			System.err.println(exception);
			}
		catch(NumberFormatException exception)
		{
			System.err.println(exception);
		}
		catch(IllegalArgumentException exception)
		{
			System.err.println(exception);
		}
		catch(NullPointerException exception)
		{
			System.err.println(exception);
			
		}
		catch(Exception exception)
		{
			System.err.println(exception);
		}
	}
}