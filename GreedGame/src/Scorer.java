import java.util.ArrayList;
import java.util.Scanner;

public class Scorer {
	private final int diceThrown;
	private int nrToThrow=0;//represents possibilities for next throw
	public Scorer(int diceThrown)
	{
		this.diceThrown=diceThrown;
	}
	public int findScore()
	{
		ArrayList<Die> soFar;
		
		int [] frq=new int[]{0,0,0,0,0,0};//starts form 0 to 5 but I need from 1 to 5
		// so I make 1 more space and do not care about 0;
		
		int score1;//score for one throw
			
		Cup arunc=new Cup(diceThrown);
		soFar=arunc.throw1();
		score1=0;
		nrToThrow=0;
			 for(Die object:soFar)
				frq[object.getValue()]++;//I should know how many of 1 ,2 ... are there
			
			for(int i=2;i<5;i++)//1,5 are special cases
			{
				if(frq[i]>=3) 
				{
					score1+=3*100;
					nrToThrow=2; //if player has 3 dies with the same value => he can throw 2 next time
				}
				else
					nrToThrow+=frq[i];
				
				if(frq[i]==5)nrToThrow=5;//if all are the same player could throw 5 next turn
			}
			
			/*
			 * special case 1 and 5
			 */
			
			if(frq[1]>=3)
			{
				score1+=1000;
				score1+=(frq[1]-3)*100;//there are 4 or 5 of 1, if just 3 0*100=0
			}
			else
				score1+=frq[1]*100;
			
			
			if(frq[5]>=3)
			{
				score1+=3*100;
				score1+=(frq[5]-3)*50;
			}
			else
				if(frq[5]<3)score1+=frq[5]*50;
			
			
			if(score1==0){
				System.out.println("goBusted");
				nrToThrow=0;
			}
			//System.out.println(nrToThrow);
			return score1;
		}

	
	public int return_dice()
	{
		return nrToThrow;
	}
}

