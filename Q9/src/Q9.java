import java.util.Scanner;
public class Q9 {

	private static long getInput()
	{
		Scanner in = new Scanner(System.in);
		return in.nextLong();
	}
	
	private long reverse(long n)
	{
		long r=0;
		while(n>0)
		{
			r=r*10+n%10;
			n/=10;
		}
		return r;
	}
	
	private  boolean check(long n)
	{
		if(n==reverse(n)) return true;
		else
			return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q9 number=new Q9();
		System.out.println(number.check(getInput()));
	}

}
