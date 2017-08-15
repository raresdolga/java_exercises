
public class Q14 {
	public String getFileName()//get fileName and your name as input
	{
		Input in = new Input();
		return in.nextLine();
	}
	public String FileName(String s)// return new result 
	{
		FileInput in = new FileInput(getFileName());
		String result = new String();
		
		int i=0;
		while(i<40)
		{
		result +=new Character(in.nextChar()).toString();
		i++;
		}
		result+=s;
		while(i<=80)
		{
			result+=new Character(in.nextChar()).toString();
			i++;
		}
		in.close();
		return result;
	}
	public void run()
	{
		String name = new String();
		name=getFileName();
		System.out.println(FileName(name));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q14 q14 = new Q14();
		q14.run();
	}

}
