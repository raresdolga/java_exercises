import java.util.ArrayList;
import java.util.*;
public class Game {
 
	
	public static void main(String[] args) {
		ArrayList<Player> players=new ArrayList<Player>(); 
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		int nrPlayers=in.nextInt();
		int count=0;
		while(count<=nrPlayers)
		{
		String name=new String();
		name=in.nextLine();
		count++;
		players.add(new Player(name));
		}
		//System.out.println(players.size());

		Player maxi_score =players.get(0);//every variable must be initialised
		// I start with the first element in the list 
		while(maxi_score.getScore()<5000)//I memorise the player with max score
			for(Player x:players)
			{
				x.playTurn();
				int player_score = x.getScore();
				if(maxi_score.getScore()<x.getScore())
					maxi_score=x;//make a new refernce to th object x
				//System.out.println(x.getScore());
			}
		System.out.println(maxi_score.getName());
	}

}
