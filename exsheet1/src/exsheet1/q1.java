package exsheet1;

public class q1 {

	public String getInput()
	{ 
		Input in = new Input();
		return in.nextLine();

	}

	public boolean compare(final String s)
	{
		if(s.compareTo("stop")==0)
			return true;
		else
			return false;
	}
	public  void run()
	{
	String s=getInput();
	while(compare(s)==false)
	{
	System.out.println(s);
	s=getInput();
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new q1().run();
	}

}
