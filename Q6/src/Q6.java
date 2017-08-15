import java.util.Scanner;
public class Q6 {
	private  double n;
	private  double m;

	public void getValue()
	{
	Scanner in= new Scanner(System.in);
	this.m=in.nextDouble(); // this refers to instance variables not to the paramethers. Use this!
	this.n=in.nextDouble();
	}
	private double calculate()
	{
		getValue();
		double r=n+m;
		r=Math.sqrt(r);
		return r;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q6 odd= new Q6(); // create new instance of that class
		System.out.println(odd.calculate()); //aplly a method
	}

}
