
public class LongestArg {

	public static Pair<String,Integer> longest(String [] vect) throws IllegalArgumentException
	{
		
		String current=vect[0];//take first element
		int longestLength=current.length();
		for(int i=1;i<vect.length;i++)
		{
			if(vect[i].length()>current.length())
			{
				current=vect[i];
				longestLength=current.length();
			}
				
		}
		return new Pair(current,longestLength);
		
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Pair a=longest(args);
		System.out.println(a.getFirst());
		System.out.println();
		System.out.println(a.getSecond());
		
	}

}
