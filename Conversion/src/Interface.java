import java.util.ArrayList;
import java.util.Scanner;
public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new Scanner(System.in);
		try{
		int a=in.nextInt();
		int b=in.nextInt();
		int numCols=in.nextInt();
		int numSpace=in.nextInt();
		if(a>b)throw new NumberFormatException("invalid interval");
		Temp t=new Temp(a,b);
		t.setNumberOfCols(numCols);
		t.nrSpaces(numSpace);
		ArrayList<String>table=t.getArray();
		for(String s :table)
			System.out.println(s);
		}
		catch(NumberFormatException e)
		{
			System.err.println(e.getMessage());
		}
	}

}
