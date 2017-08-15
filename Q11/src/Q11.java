import java.util.Scanner;
public class Q11 {

	private static int [] frequncy= new int[1001];
	public String getFileName()
	{
		Input in= new Input();
		return in.nextLine();
	}

	public void openFile(String fileName)
	{

		FileInput in= new FileInput(fileName);
		char c;

		for(int i='A';i<='z';i++)
			frequncy[i]=0;

		while(in.hasNextChar())
		{
			c=in.nextChar();
			System.out.print(c);
			frequncy[c]++;

		}
	in.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q11 text = new Q11();
		String name= new String(text.getFileName());// String name = new String // name=text.getFileName();

		text.openFile(name);
System.out.println(" ");
		for(int i='A';i<='z';i++)
			if(frequncy[i]!=0)
			System.out.println((char)(i)+":"+frequncy[i]);
	}

}
