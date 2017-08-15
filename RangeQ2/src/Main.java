import java.util.Scanner;
import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner in = new Scanner(System.in);
	int l=in.nextInt();
	int r=in.nextInt();
	
	try{
		Range range= new Range(l,r);
		ArrayList<Integer> myArray;
		myArray=range.getValues();
		for(int i:myArray)
			System.out.println(i);
	}
	catch(Exception e)
	{
		System.err.println(e.getMessage());
	}
	
	}

}
