
public class Q16 {
 
	public String getInput()//get input from kyword using class made by them
	{
		Input in = new Input();
		return in.nextLine();

	}
	public void constructArrays()
	{
		String s1=new  String(getInput());//get input in strings char by char cannot because '\n' is not recognised as a new line
		String s2= new String(getInput());
		char [] c1=new char[1001];
		char [] c2=new char[1001];
		int i=0;

		while(i<s1.length())//construct vector 1 of primitive tyoes char
		{
			c1[i]=s1.charAt(i);
			i++;
		}
		i=0;
		while(i<s2.length())//construct vector 2 of primitive types char
		{
			c2[i]=s2.charAt(i);
			i++;
		}
		if(compare(c1,c2)==true) System.out.println(true);
		else
			System.out.println(false);
	}
	public boolean compare(char[] a, char[] b)
	{
		int j,ok=0;
		if(a.length!=b.length)return false;
		for(int i=0;i<a.length;i++)
		{
			ok=0;
			for(j=0;j<b.length&&ok==0;j++)
				if(b[j]==a[i])
				{
					ok =1;
					b[j]='\n';

				}
			if(ok!=1) return false;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q16 q16 = new Q16();
		q16.constructArrays();
	}

}
