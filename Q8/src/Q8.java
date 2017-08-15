import java.util.Scanner;
public class Q8 {
public double getInput()
	{
		Scanner in = new Scanner(System.in);
		return in.nextDouble();
	}
	
	private void display()
	{
		System.out.print("1.Convert from miles to feet\n");
		System.out.print("2.Convert from meters to inches\n");
		System.out.print("3.Convert from kilometers to yards\n");
		System.out.print("4. Quit\n");
	}
	private double tr1(double n)
	{
		return n*5280;
	}
	private double tr2(double n)
	{
		return n*39.3700787;
	}
	private double tr3(double n)
	{
		return n*1093.6133;
	}
	
	public void interface1()
	{
		display();
		int choice=(int)getInput();
		double value;
		while(choice!=4)
		{
			value=getInput();
			switch(choice){
			case 1: System.out.println(tr1(value));
				break;
			case 2: System.out.println(tr2(value));
				break;
			case 3: System.out.println(tr3(value));
				break;
				default: break;
			}
		 choice=(int)getInput();
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Q8 mult = new Q8();
		mult.interface1();
	}

}
