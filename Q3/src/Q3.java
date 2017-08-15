import java.util.Random;
class Q3 {

	public void calc()
	{
		Random rn = new Random();
		double n;
		n=-0.9999999999999+rn.nextDouble()*2*0.999999999999;
		double maxi=n,mini=n;
		double s= n;
		for(int i=1;i<10000;i++)
		{
			n=-0.999999+rn.nextDouble()*2*0.999999;
			if(n>maxi)maxi=n;
			if(n<mini)mini=n;
			s+=n;
		}
		System.out.println("maxi: "+maxi);
		System.out.println("mini: "+mini);
		System.out.print("avarage: "+(s/10000));
	}
	
	public static void main(String [] args)
	{
		Q3 start=new Q3();
		start.calc();
	}

}
