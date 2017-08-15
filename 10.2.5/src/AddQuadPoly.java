import java.util.Scanner;
public class AddQuadPoly {
	public double a;
	public double b;
	public double c;
	public AddQuadPoly(double a2, double a1, double a0)
	{
		this.a=a2;
		this.b=a1;
		this.c=a0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
Scanner in = new Scanner(System.in); 
		
		double f1,f2,f3,g1,g2,g3;
		
		f1 = in.nextDouble();
		f2=in.nextDouble();
		f3=in.nextDouble();
		in.nextLine();
		AddQuadPoly f = new AddQuadPoly(f1,f2,f3);
		while(in.hasNextInt())// if a character is typed reading is ending 
		{
		g1=in.nextDouble();
		g2=in.nextDouble();
		g3=in.nextDouble();
		
			System.out.println(g1);
			
		AddQuadPoly g= new AddQuadPoly(g1,g2,g3);
		AddQuadPoly x = new AddQuadPoly(f.a+g.a,f.b+g.b,f.c+g.c);
		f=x;// f holds the reference to the object x;
		//in.nextLine();
		}
		
		
		System.out.print("x^2"+"*"+(f.a)+"+"+"x"+"*"+(f.b)+"+"+"x^0"+"*"+(f.c)); // f has the reference to he last object x created 
	}

}
