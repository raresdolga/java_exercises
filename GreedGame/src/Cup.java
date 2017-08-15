import java.util.ArrayList;
public class Cup {

	private ArrayList<Die>cup=new ArrayList<Die>();
	private int n;//nr of dices in cup
	public Cup(int n)
	{
		this.n=n;
		addDice();
	}
	public ArrayList<Die> throw1()
	{
		for(Die n:cup)
		{
			n.throwDie();
		System.out.println(n.getValue());
		}
		return new  ArrayList<Die>(cup);
	
	}
	
	public void addDice() //number of dices to throw
	{
		for(int i=0;i<n;i++)
		{
			Die zar= new Die();
			cup.add(zar);
		}
	}
}
