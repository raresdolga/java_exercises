
public class Q13 {

	public String getInput1()
	{
		Input in = new Input();
		return  in.next();
		
	}
	public String getInput2()
	{
		Input in = new Input();
		return in.next();
	}

	public void getFile()
	{
		Q10 q10 = new Q10();
		String m= new String();
		FileInput input= new FileInput(getInput1());
		FileOutput output= new FileOutput(getInput2());
		while(input.hasNext())
		{
			m=input.next();
			if(q10.run(m)==true)
			output.writeString(m+"\r\n");
			output.writeString("\n");
		}
		output.close();
	}
	public static void main(String [] args)
	{
	Q13 q13 = new Q13();
	q13.getFile();
	
	}
}
