import java.util.ArrayList;
import java.util.Scanner;
public class JobAnalays {
	public int pivot(int i,int j,int [] b)
	{
		int p=i;
		int aux;
		for(int k=1;k<j;k++)
		{
			if(b[k]<b[j])
			{
				aux=b[k];
				b[k]=b[p];
				b[p]=aux;
				p++;
			}
		}
		aux=b[j];
		b[j]=b[p];
		b[j]=aux;
		return p;
	}
	public  void qSort(int i, int j,int [] b)
	{ 
		if(i<j)
		{
			int p=pivot(i,j,b); // referinta b la vectorul b
			qSort(i,p-1,b);
			qSort(p+1,j,b);
		}
		
	}
 public static void main()
 {
	 Scanner in= new Scanner(System.in);
	 int noOfJobs=in.nextInt();
	 in.nextLine();
	 Job []  jobs = new Job[noOfJobs];
	 for(int i=0;i<noOfJobs;i++)
	 {
		 
		 String name = in.nextLine();
		 int salary=in.nextInt();
		 in.nextLine();
		 jobs[i]=new Job(name,salary);
		 
	 }
	 int sumOfSalary=0;
	 
	 for(Job job:jobs)
	 {
		 sumOfSalary+=job.getSalary();
		 
	 }
	 double meanslary=sumOfSalary/noOfJobs;
	 sort(jobs);
	 
 }
}
