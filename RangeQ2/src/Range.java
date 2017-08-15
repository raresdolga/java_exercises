import java.util.ArrayList;
public class Range {

	private int low;
	private int high;
	public Range(int low, int high) throws Exception
	{
		if(low>high) throw new Exception("low>high limit");
		this.low=low;
		this.high=high;
	}
	public int getLow()
	{
		return low;
	}
	public int getHigh()
	{
		return high;
	}
	public boolean contains(int n)
	{
		if(n>=low && n<=high) return true;
		else
			return false;
	}
	public ArrayList<Integer> getValues()
	{
		ArrayList<Integer> interval=new ArrayList<Integer>();
		for(int i=low;i<=high;i++)
		{
			interval.add(i);
		}
		return interval;
	}

}
