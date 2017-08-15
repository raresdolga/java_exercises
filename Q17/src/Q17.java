
public class Q17 {
	long []c= new long[10000000];
	public static int get()
	{
		Input in = new Input();
		int prm = in.nextInt();
		return prm;
	}
	public boolean trsPrime(long  n)
	{

		int i=1,j=1;
		c[0]=2;
		System.out.println(2);
		int Nc=0;
		for(i=3;i<=n;i+=2)
			for(j=0;j<=Nc&&(i%c[j]!=0);j+=1)
				{
				if(j>=Nc){c[++Nc]=i;System.out.println(i);}// de ce nu creste j? >= in loc de >
				}

		if(c[Nc]==n)return true;
		else
			return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Q17	q17 = new Q17();
		System.out.println(q17.trsPrime(922337203));
		
	}

}
