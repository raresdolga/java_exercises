
public class CompareQuad {
 public String toString(AddQuadPoly g)
 {
	 return "x^2" + "*" +g.a+"+"+"x"+"*"+g.b+"+"+g.c; 
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompareQuad f = new CompareQuad();
		AddQuadPoly g = new AddQuadPoly(1,2,3);
		System.out.println(f.toString(g));

	}

}
