import java.util.Scanner;
public class Verbalise {

	public int getInput()
	{
		Scanner input =new Scanner(System.in);
		return input.nextInt();
	}
	public String unitati(int u)
	{
		switch(u)
		{
		case 0: return "zero";
		case 1: return "one";
		case 2: return "two";
		case 3 : return "three";
		case 4: return "four";
		case 5: return "five";
		case 6: return "six";
		case 7: return "seven";
		case 8: return "eight";
		case 9: return "nine";
		default : return "not a number";		
		}
		
	}
	public String tenToNineteen(int n)
	{
		switch(n)
		{
		case 0: return "ten";
		case 1: return "eleven";
		case 2: return "twelf";
		case 3 : return "thirteen";
		case 4: return "fourteen";
		case 5: return "fifteen";
		case 6: return "sixteen";
		case 7: return "seventeen";
		case 8: return "eighteen";
		case 9: return "nineteen";
		default: return "";
		}
	}
	public String decimals(int d)
	{
		switch(d)
		{
		//case 1: return "ten";
		case 2: return "twenty";
		case 3 : return "thirty";
		case 4: return "fourty";
		case 5: return "fifty";
		case 6: return "sixty";
		case 7: return "seventy";
		case 8: return "eighty";
		case 9: return "ninety";
		default : return "";		
		}
		
	}
	
	
	public int[] inverse(int m)
	{
		int inv=0;
		int p=1;
		int s=0;
		while(m!=0)
		{
			inv=inv*10+m%10;
			s+=1;
			m/=10;
		}
		System.out.println(inv);
		int [] size2= new int[] {inv,s};
		return size2;
	}
	public void run()
	{
		int n= getInput();
		int[] m=inverse(n);
		switch(m[1])
		{
		case 1: { if(m[0]==0)
			System.out.println("zero");
			System.out.println(unitati(m[0]));
		}
		break;
		case 2: 
			if(m[0]%10==1)//elven twelf ... special cases
				System.out.println(tenToNineteen(m[0]/10));
			else
				System.out.println(decimals(m[0]%10)+unitati(m[0]/10));//prints  the number with 2 digits 23 read first and then 3
			break;
		case 3:
			if((m[0]/10)%10==1)
					System.out.println(unitati(m[0]%10)+"hundred"+tenToNineteen(m[0]/100));
				else
					System.out.println(unitati(m[0]%10)+" hundred "+decimals((m[0]/10)%10)+" "+unitati(m[0]/100));
			break;
			default : break;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Verbalise number = new Verbalise();
	number.run();
	}
}