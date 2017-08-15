
public class Date {
	/*
	 * present date is stored in the class it belongs
	 * it is a design choice
	 */
	private final int day;
	private final int month,year;
	private static Date presentDate=null; 
	public Date(int day, int month,int year)
	{
		this.year=year;
		this.day=day;
		this.month=month;
	}
	
	public  static void setPresentDate(Date requiredDate)
	{
		presentDate=requiredDate;
	}
	public static Date getPresentDate()
	{
		return presentDate;
	}
	
	public boolean equals(Date other)
	{
	return day==other.day&&month==other.month&&year==other.year;
	}
	public boolean lessThan(Date other)
	{
		return year<other.year
				|| month<other.month
					|| day<other.day;
	}
	
	public String toString()
	{
		return day + "/"+month+"/"+year;
	}
	public Date addYear()
	{
		return new Date(day,month,year+1);
	}
	
}
