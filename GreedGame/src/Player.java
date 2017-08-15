import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class Player {
	private final String name;
	private int score;

	public Player(String name)
	{
		this.name=name;
	}

	public void playTurn()
	{
		//System.out.println(score);
		int score_perRound=0;
		int score_perThrow;
		Scanner in =new Scanner(System.in);
		boolean choice=true;//player wants to play
		int nrDices=5;//first turn has to be with 5 dices 
		while(nrDices>0&&choice==true)//am modificat aicscore per round
		{
			Scorer calculate=new Scorer(nrDices);
			
			score_perRound+=calculate.findScore();
			nrDices=calculate.return_dice();
			System.out.println(nrDices);
			
			if(nrDices!=0) // if you got busted
			{
				//depending on what is on the screen palyer choose to play or not
				choice=in.nextBoolean();
			}
			else
				score_perRound=0; // eliminates the points before
			
		}
		score+=score_perRound;
	}

	public int getScore()
	{
		return score;
	}
	public String getName()
	{
		return name;
	}
}
