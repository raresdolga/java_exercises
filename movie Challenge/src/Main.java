import java.util.Scanner;
public class Main {

	public static void main(String args[])
	{
		Scanner in= new Scanner(System.in);
		String name= new String();
		name=in.next();
		String general=new String ();
		general= in.next();
		int year=in.nextInt();
		double runTime=in.nextDouble();
		
		MovieClass film =new MovieClass(name,general,year,runTime);
		
		System.out.print(film.toString());
		in.close();

	}
}
