import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.TreeMap;
import java.util.Scanner;

public class StrConn {

	public static void main(String []args)
	{
		int [][]capacity;
		Scanner in;
		try {

			/*
			 * Reads adjancy matrix 
			 */
			in = new Scanner(new File("D:\\Users\\Rares\\Documents\\java.selfexercise\\FindConexcomponents\\src\\input.txt"));//create a new file object than read
			int n=in.nextInt();
			capacity=new int [n][n];
			int j;
			ArrayList<Integer> node=new ArrayList<Integer>();
			for(int i=0;i<n;i++)
			{
				for(j=0;j<n;j++)
				{	capacity[i][j]=in.nextInt();
				System.out.print(capacity[i][j]);
				}
				node.add((i+1));//List of nodes
				System.out.println();
			}
			Graph g=new Graph(n,capacity);
			g.search();
			ArrayList<ArrayList<Integer>> components = new ArrayList<ArrayList<Integer>>();
			components=g.components();
			g.print(components);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
	}

}
