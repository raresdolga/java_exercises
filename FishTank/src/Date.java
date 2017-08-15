
public class Date {
	private static int day,month,year;
	public Date(String dateString) throws Exception // if you finally throw an exception not resolve it now
	{
		try{
			String [] dateElement=dateString.split(" ");
			if(dateElement.length>3)
				throw new Exception("incorrect input");
			day=Integer.parseInt(dateElement[0]);
			month=Integer.parseInt(dateElement[1]);
			year=Integer.parseInt(dateElement[2]);
		}
		catch(Exception e)
		{
			throw new Exception(e); // just now throws a new exception that is bounded to the first one
		}
	}
	public Date addDay() //you have to chatch the exception in this method or somewhere at least
	{
		int newday=day+1;
		int newmonth=month;
		int newyear=year;
		if(newday>31)
		{
			newday=1;
			newmonth+=1;
		}
		if(newmonth>12)
		{
			newmonth=1;
			newyear+=1;
		}
		try{
			return new Date(newday+ " "+newmonth+ " "+newyear);
			
		}
		catch(Exception e)
		{
			return null;
		}
	}
	public static void main(String [] args)
	{
		try
		{
			Date date=new Date("12 19 1997 23");
			date.addDay();
			System.out.println(date.toString());
		}
		catch(Exception e)
		{
			System.err.println(e.getMessage());
		}
	}
}
