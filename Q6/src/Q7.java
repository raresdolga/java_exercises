import java.util.Scanner;
public class Q7 {
	private int getValues()
	{
		Scanner in = new Scanner(System.in);
		
		int m= in.nextInt();//citeste urmatorul int, daca citesti altceva atunci iti da eroare
		
		return m;
	}
	public String Convert()
	{
		int n= getValues();
		int m=getValues();
		
		return Long.toString(n,m);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q7 df= new Q7();
		
		System.out.println(df.Convert());
	}

}
