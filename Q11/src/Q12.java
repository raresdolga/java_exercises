
public class Q12 {

	public String getName()
	{
		Input in = new Input();
		return in.next();
	}
	public void InOut(String fileIn, String fileOut)
	{
		FileInput in =new FileInput(fileIn);
		FileOutput out= new FileOutput(fileOut);
		
		String result=new String();
		char c;
		int i=0;
		while(in.hasNextChar())
		{
			c=in.nextChar();
			result =  new Character(c).toString()+result;
			
			
		}
		out.writeString(result);
		out.close();
		in.close();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q12 sir = new Q12();
		String nou=new String();
	sir.InOut(sir.getName(),sir.getName());
		


	}

}
