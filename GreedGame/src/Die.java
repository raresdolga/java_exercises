import java.util.Random;
public class Die {

	private int value;
	Random rand=new Random();
	public void throwDie()
	{
		value=1+rand.nextInt(5);
	}
	
	public int getValue()
	{
		return value;
	}
	
}
