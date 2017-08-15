
public class Main {

	public static void main(String[] args)//use command Line to read 
	{
		// TODO Auto-generated method stub
		int []arry= new int [args.length];
		for(int i=0;i<args.length;i++)
			arry[i]=Integer.parseInt(args[i]);
	IntArrayStats obj = new IntArrayStats();
		Triple triple=obj.getStats(arry);
		System.out.println(triple.getFirst()+ " "+ triple.getSecond()+ " "+triple.getThird());
	}

}
