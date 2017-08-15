import java.io.File;
import java.util.Scanner;
public class MazeSolver {

	public static void main(String[] args)throws Exception
	{
		Scanner in =new Scanner(System.in);
		File input=new File(in.next());
		Scanner go = new Scanner(input);
		MazeSolver prob=new MazeSolver(go);
		prob.solve(1, 1);
		prob.afisare();
		/*
		 * location of file is:
		 * D:\Users\Rares\Documents\java.selfexercise\MazeSolver\src\input.txt
		 * create the input File
		 */

	}//main

	private static final int HEIGHT=2;
	private final static int WIDTH=4;
	//BEGIN WITH THE STEPS
	private static int START=0;
	//Notation for simbols
	private static final int SPACE=-1;
	private static final int HEDGE=-2;
	private static final int PATH=-3;
	private static final int END=-4;
	//the char to represent the mase in the output file
	private static final char SPACE_REP=' ';
	private static final int HEDGE_REP='#';
	private static final int PATH_REP='.';
	private static final char END_REP='!';
	private static final char START_REP='?';
	//declare a matrix and bord it for the neighbours
	private int [][] a=new int[HEIGHT+2][WIDTH+2];
	public MazeSolver(Scanner input)
	{
		//bord the matrix
		for(int i=0;i<HEIGHT+2;i++)
			a[i][0]=a[i][WIDTH+1]=HEDGE;
		for(int i=0;i<WIDTH+2;i++)
			a[0][i]=a[HEIGHT+1][i]=HEDGE;
		//read the maze
		for(int i=1;i<=HEIGHT;i++)
		{
			String line=input.nextLine();
			for(int j=1;j<=WIDTH;j++)
			{
				char char_pos=line.charAt(j-1);// we start from 1 as we bord so -1
				switch(char_pos)
				{
				case SPACE_REP: a[i][j]=SPACE;
				break;
				case HEDGE_REP: a[i][j]=HEDGE;
				break;
				case START_REP: a[i][j]=START;
				break;
				case END_REP: a[i][j]=END;
				break;
				}
			}
		}
	}
	private int [] neighbour={-1,0,1,0};
	private void check(int n)
	{
		if(n==-1);
	}
private void solve(int i,int j)
{
	boolean exit=false;
	int k,row,colm;
	for(int l=0;l<=HEIGHT+1;l++)
		{
		for(j=0;j<=WIDTH+1;j++)
			System.out.print(a[l][j]);
		System.out.println("");	
		}
	while(exit==false)
	{
		for(k=0;k<=3&&exit==false;k++)
			 {
		colm=j+neighbour[k];
		row=i+neighbour[(k+1)%4];//the appropriate column
			if(a[row][colm]==-1){
				a[row][colm]=a[i][j]+1;
				START++;
	solve(row,colm);
			}
			else
				if(a[row][colm]==-4)exit=true;
				else
					if(a[row][colm]==-4)return;
			 }
	}
}
private void afisare()
{
	System.out.println(START);
}
}
