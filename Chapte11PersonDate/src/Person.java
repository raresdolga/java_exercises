
public class Person {
	private final String name;
	private final Date birthDate;
	private static String NL= System.getProperty("line.separator");
	public Person(Date birthDate, String name)
	{
		this.name=name;
		this.birthDate=birthDate;
	}
	public void setLineSeparator(String requieredSeparator)
	{
		NL=requieredSeparator;
	}
	
	public String ageHistory()
	{
		Date presentDate=Date.getPresentDate();
		//cases where the person has just been born 
		if(presentDate.equals(birthDate))
		return "will be born today";
		else
			if(presentDate.lessThan(birthDate))
				return "will pe born on"+birthDate;
			else
			{
				String result = "was born on" +birthDate;
				int count=1;
				Date someBirthDate=birthDate.addYear();
				while(someBirthDate.lessThan(presentDate))
				{
					result+=NL+"was "+ count;
					count++;
					someBirthDate=someBirthDate.addYear();
				}
				if(someBirthDate.equals(presentDate))
					result+=NL+ "la multi ani!";
				return result;
			}
	}

}
