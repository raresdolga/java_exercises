import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class Graph {
	private int[][] capacity;
	private boolean [] visited;
	private TreeMap<Integer,Integer> postnum;
	
	private int num=0;
	boolean [] marked;
	public Graph(int n,int [][] adjance)
	{
		visited= new boolean[n];
		marked=new boolean[n];
		postnum=new TreeMap<Integer,Integer>();
		capacity=new int[n][n];
		int i,j;
		for(i=0;i<adjance.length;i++)
			{
			for(j=0;j<adjance[0].length;j++)
				capacity[i][j]=adjance[i][j];
		
			visited[i]=false; //initialse the visited as well
			marked[i]=false;
			}
		
	}
	
	protected void search()
	{
		 
		for(int node=0;node<capacity.length;node++)
		{
			if(visited[node]==false)
			DFS(node);
		}
	}
	private  void DFS(int node)
	{
		visited[node]=true;
	for(int v=0;v<capacity.length;v++) // matrix is square
		if(capacity[node][v]!=0&&visited[v]==false)
			DFS(v);
	num+=1;
	postnum.put(num,node);
	}
	private ArrayList<Integer> simpleDFS(int node,int [][] r,ArrayList<Integer> component)
	{
		
		marked[node]=true;
		component.add(node);
		for(int v=0;v<r.length;v++) // matrix is square
			if(r[node][v]!=0&&marked[v]==false)
				{
				simpleDFS(v,r,component);
				}
		//for(int i=0;i<component.size();i++)
			//System.out.print(component.get(i));
		return component;
	}
	protected int [][] reverseEdge()
	{
		int [][] reversed=new int [capacity.length][capacity[0].length];
	int i,j;
		for(i=0;i<capacity.length;i++)
			for(j=0;j<capacity[0].length;j++)
				reversed[i][j]=capacity[i][j]-1;//reverse the edges
	return reversed;
	}
	
	public ArrayList<Integer> getReverseSort()
	{
		ArrayList<Integer> node =new ArrayList<Integer>();
		
		for(Integer i:postnum.values())//iterate and get sorted values 
			{
			node.add(i);	// put nodes in he new order
			}
			Collections.reverse(node);
			return node;
	}
	public ArrayList<ArrayList<Integer>> components()
	{
		int [][] r= reverseEdge();
		ArrayList<Integer> newNode=getReverseSort();
		ArrayList<ArrayList<Integer>> total = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> component=new ArrayList<Integer>(); 
		ArrayList<Integer> localcomp=new ArrayList<Integer>();
		for(int n:newNode)
			{
			
			if(marked[n]==false)
			localcomp=simpleDFS(n,r,component);
		//	System.out.println(component.get(0));
			if(localcomp.size()!=0)
				total.add(localcomp);
			component=new ArrayList<Integer>();
			}
		return total;
	}
	public void print(ArrayList<ArrayList<Integer>> component)
	{
		int j;
		for(ArrayList<Integer> p:component)
			{
			for(j=0;j<p.size();j++)
				System.out.print(p.get(j)+" ");
			System.out.println();
			}		
		System.out.println("am fost"); 
	}
}