
public class MovieClass {

	private String name;
    private String generalAudience;
    private int year;
    private double runTime;
    public MovieClass(String name,String generalAudience,int year,double run)
    {
    	this.name=name;
        this.generalAudience=generalAudience;
        this.year=year;
        this.runTime=run;
        
    }
    public String toString()
    {
    	return "Nume film "+name +"\nAudience " +generalAudience + "\nAn producere"+year+"\nTimp de urmarit"+runTime;
    }
}
