
import java.util.*;
import java.io.*;
public class Ford_Fulkestron {
 private int maxFlow;
	public int maxFlow(int capacity[][],int source,int sink)
	{
		int[][] residual_capacity=new int [capacity.length][capacity[0].length];
		for(int i=0;i<capacity.length;i++)
			for(int j=0;j<capacity[0].length;j++)
			{
				residual_capacity[i][j]=capacity[i][j];
				
				
			}
		
		//create a HashMap to memorise from which node you reached the sink
		//node and father
		
		HashMap<Integer,Integer> father=new HashMap<>();
		
		//list of all possible paths

		List<List<Integer>> superPaths=new ArrayList<>(); //to memorise all the paths 
	// List is an abstract class so augumentativPaths is a polymorfic variable(super class=List,subclass=ArrayList)
		
		while(BFS(sink,source,residual_capacity,father))
		{
			int flow=9999999;//put an infinite value
			List<Integer> onePath=new ArrayList<Integer>(); 
			int v=sink;

			while(v!=source) //create path 
			{
				int u=father.get(v);//the node which is mapped to key v
				onePath.add(v);

				if(flow>residual_capacity[u][v])flow=residual_capacity[u][v];
				v=u;
				
			}
			
			onePath.add(source);
			
			int predecessor;
			for(int t=sink;t!=source;t=father.get(t))//go backwards and see the normal path 
				{
				
				// modify flow capacity forward and backwards
				predecessor=father.get(t);
				residual_capacity[predecessor][t]-=flow;
				residual_capacity[t][predecessor]+=flow; //add flow for super path
				
				}
			
			superPaths.add(onePath);
			maxFlow+=flow;
		}
		
		return maxFlow;
	}
	private boolean BFS(int sink,int source,int[][] residual_cost,HashMap<Integer,Integer> parent)
	{
		Queue<Integer> queue=new LinkedList<Integer>();
		boolean [] visited=new boolean[residual_cost.length];
		for(boolean b:visited)
			b=false;
		
		queue.add(source);
		
		boolean pathFound=false;
		
		int first=source;
		visited[first]=true;
		
		while(queue.isEmpty()==false)//wile there are elements in the queue;
		{
			first=queue.poll();
			if(first==sink)
			{
				pathFound=true;
				break;
				//no point to continue
			
			}
			
			for(int i=0;i<residual_cost.length;i++)
				if(residual_cost[first][i]>0&&visited[i]==false)//if not visited and there is spare capacity
				{
					visited[i]=true;
					queue.add(i);
					parent.put(i,first);//i is the key 
				}
					
		}
		
		return pathFound;
	}
	public static void main(String[] args) {
		
		Scanner in;
		try {
			
			/*
			 * Reads adjancy matrix 
			 */
			in = new Scanner(new File("D:\\Users\\Rares\\Documents\\java.selfexercise\\Ford_Fulkestron\\src\\input.txt"));//create a new file object than read
			int n=in.nextInt();
			int[][] capacity=new int [n][n];
			int j;
			for(int i=0;i<n;i++)
			{
				for(j=0;j<n;j++)
				{	capacity[i][j]=in.nextInt();
					
				}
			}
		Ford_Fulkestron obj=new Ford_Fulkestron();
		int maxi=obj.maxFlow(capacity,0,n-1);
		System.out.println("Maximum Capacity is: "+maxi);

		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
	}

}
