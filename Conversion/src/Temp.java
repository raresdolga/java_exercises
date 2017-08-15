import java.util.ArrayList;
public class Temp {
	private int mini;
	private int maxi;
	private int colums;
	private int nrSpaces;
	private ArrayList<String> myArray =new ArrayList<String>();
	public Temp(int mini,int maxi)
	{
		this.mini=mini;
		this.maxi=maxi;
	}
	public void setNumberOfCols(int n)
	{
		colums=n;
	}
	public void  nrSpaces(int n)
	{
		nrSpaces=n;
	}
	public void title()
	{
		String line=new String("Table Conversion");
		String result=new String();
		for(int i=0;i<line.length();i++)
			result+="-";
		/*
		 * 3 spaces between C and F
		 * colums per line
		 * nrSpaces between colums
		 * =>(3*colums+(colums-1)*nrSpaces)/2 
		 * tre sa fie la jumate
		 */
		int  spacesBefore=(3*colums+(colums-1)*nrSpaces)/2 ;
		line =String.format("%"+spacesBefore+"s",line);//half of total spaces
		
		myArray.add(line);
		result=String.format("%"+spacesBefore+"s",result);
		myArray.add(result);
	}
	public void headers()
	{
		String s= new String();
		String result= new String();
		for(int i=0;i<colums;i++)
			{s+="C   F";// 3 spaces between C and F 
			s=String.format("%-"+nrSpaces+"s",s);
			result+=s;
			s="";
			}
		myArray.add(result);
	}
	
	
	private int convert(int n)
	{
		return n*9/5+32;
	}
	
	private int nrdigits(int n)
	{
		int i=0;
		if(n==0)return 1;
		while(n>0)
		{
			i++;
			n/=10;
			
		}
		System.out.println(i);
		return i;
	}
	
	private void model()
	{
		int j=mini;
		int i;
		String line=new String();
		String result=new String();
		//nrSpaces-=2*nrdigits(maxi);
		int nrSpace1;
		while(j<=maxi)
		{
			for(i=0;i<colums&&(j+i<=maxi);i++)
				{
				line=line.format("%-4d",j+i);// j+i to separate per lines
				line+=line.format("%d",convert(i+j));
				line=line.format("%-"+nrSpaces+"s",line);
				result+=line;
				
				}
			j+=i;
			myArray.add(result);
			result="";
		}
	}
	public ArrayList<String> getArray()
	{
		title();
		headers();
		model();
		return new ArrayList<String>(myArray);//make a new coppy of the myArray 
	}
}
