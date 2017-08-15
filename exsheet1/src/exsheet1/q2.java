package exsheet1;
import java.util.ArrayList;
class Q2 {
	private ArrayList<Double> number= new ArrayList<Double>();
	double [] myArray= new double[11];
	public void getValue() 
	{
		Input in = new Input();
		int i=0;
		double n;
		while(i<10)
		{
			n=in.nextDouble();
			myArray[i]=n;
			//number.add(n);
			i++;
		}
			in.close();
		}
		public double avarage()
		{
			getValue();
			int sum =0;
			for(int i=0;i<=9;i++)
				sum+=myArray[i];
			return sum/10.0;
		}
		public static void main(String[] args)
		{
			Q2 medie= new Q2();
			System.out.print(medie.avarage());
		}

	}
