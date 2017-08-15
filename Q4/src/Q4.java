import java.util.Scanner;
class Q4 {

	public static double getValue()
	{
		Scanner in=new Scanner(System.in);
		return in.nextDouble();
	}
	
	public double root(double n, double m)
	{
	double r=n+m;
	r=Math.sqrt(r);
	return r;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q4 radacina = new Q4();
		double x= getValue();
		double y = getValue();
		double n = radacina.root(x,y);
		System.out.print(n);
	}

}
