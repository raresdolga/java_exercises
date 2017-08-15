
public class Q15 {

	public int getInput()
	{
		Input in = new Input();
		int c = in.nextInt();
		return c;
	}
	public int recursive(int n, int m)
	{
		if(n>m) return 1;
		else
		{
			System.out.printf("%d ",n);
			return n*recursive(n+1,m);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q15 q15 =new Q15();
		int m=q15.getInput();
		int n= q15.getInput();
		int value = q15.recursive(m,n);
		System.out.println(value);

	}

}
