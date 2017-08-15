import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class Connected {
	private int n;
	private int num=0;
	private HashMap<Integer,Integer> postnum=new HashMap<Integer,Integer>();

	public Connected(int n)
	{
		this.n=n;
	}
	private void search(int [][]capacity,boolean []visited)
	{
		int node;
		for(int i=0;i<capacity.length;i++)
			visited[i]=false;
		for(node=0;node<capacity.length;node++)
		{
			if(visited[node]==false)
				DFS(node,visited,capacity);
		}
	}
	private void DFS(int node,boolean []visited,int [][]capacity)
	{
		visited[node]=true;
		for(int v=0;v<capacity.length;v++) // matrix is square
			if(capacity[node][v]!=0&&visited[v]==false)
				DFS(v,visited,capacity);
		num+=1;
		postnum.put(num,node);
	}
	private ArrayList<Integer> DFS2(int node,boolean []visited,int [][]capacity,List<Integer> component)
	{
		visited[node]=true;
		component.add(node);
		for(int v=0;v<capacity.length;v++) // matrix is square
			if(capacity[node][v]!=0&&visited[v]==false)
			{
				component.add(v);
				DFS2(v,visited,capacity,component);
			}
		return new ArrayList<Integer>(component);
	}
	private int [][] reverseEdge(int [][] capacity)
	{
		int [][] reversed=new int [capacity.length][capacity[0].length];
		int i,j;
		for(i=0;i<capacity.length;i++)
			for(j=0;j<capacity[0].length;j++)
				reversed[i][j]=capacity[i][j]-1;//reverse the edges
		return reversed;
	}
	private ArrayList<ArrayList<Integer>> partition(int [][]matrix,boolean[]visited)
	{
		ArrayList<Integer> component = new ArrayList<Integer>();
		ArrayList<Integer> aux = new ArrayList<Integer>();
		ArrayList<ArrayList<Integer>> components=new ArrayList<ArrayList<Integer>>();
		for(int i=matrix.length-1;i>0;i--)
		{
			component.clear();
			aux=DFS2(postnum.get(i),visited,matrix,component);
			if(!aux.isEmpty())components.add(aux);
		}
		return components;
	}
	public void run(int [][]capacity,boolean[] visited)
	{
		search(capacity,visited);
		ArrayList<ArrayList<Integer>> components=new ArrayList<ArrayList<Integer>>();
		boolean []marked=new boolean[capacity.length];
		for(int i=0;i<capacity.length;i++)
			marked[i]=false;
		components=partition(reverseEdge(capacity),marked);
		int line,column;
		for(line=0;line<components.size();line++)
		{
			for(column=0;column<(components.get(line)).size();column++)
				System.out.println((components.get(line)).get(column)+" ");
			System.out.println("\r\n");
		}
	}
	public static void main (String []args)
	{
		int [][]capacity;
		Scanner in;
		try {

			/*
			 * Reads adjancy matrix 
			 */
			in = new Scanner(new File("D:\\Users\\Rares\\Documents\\java.selfexercise\\StrConnected\\src\\input.txt"));//create a new file object than read
			int n=in.nextInt();
			capacity=new int [n][n];
			int j;
			for(int i=0;i<n;i++)
			{
				for(j=0;j<n;j++)
				{	capacity[i][j]=in.nextInt();

				}
			}
	
			Connected g=new Connected(n);
			
			ArrayList<ArrayList<Integer>> component = new ArrayList<ArrayList<Integer>>();
			boolean []visited=new boolean[capacity.length];
			
			for(int i=0;i<capacity.length;i++)
				visited[i]=false;
			
			g.run(capacity,visited);

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
	}

}

