package exemple1;

public class Example_1 {
 	public int sumDigits(int n)
 	{
 		int sum =0;
 		n=Math.abs(n);
 		while(n>0)
 		{
 			sum+=n%10;
 			n/=10;
 		}
 		return sum;
 		}
 	
 	public void getInput()
 	{
 	Input in = new Input();
 	int n= in.nextInt();
 	System.out.print("The sum of the digits of:"+n);
 	System.out.println("\nIs:\n"+sumDigits(n));
 	in.close();
 	}
 	
public static void main(String[] args)
{
	new Example_1().getInput();
}
}