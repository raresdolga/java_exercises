import java.util.ArrayList;

public class Job {
	private final String employer;
	private final int salary;
	public Job(String name, int salary)
	{
	employer=name;
	this.salary=salary;
	}
	public String getname()
	{
		return employer;
	}
	
	public int getSalary()
	{
		return salary;
	}
	/*
	 * if salary is equal then compare names by compareTo method in string
	 * else 
	 * return >0 sau <0  
	 */
	public int compare(Job other) 
	{
		if(salary==other.getSalary())
			return employer.compareTo(other.employer);
		else
			return salary-other.getSalary();
	}
	
}
