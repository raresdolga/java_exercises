
public class IntArrayStats {
	public Triple<Integer,Integer,String> getStats(int [] a)
	{
		int count=0;
		int maxi=a[0];
		int mini=a[0];
		double avarage=0;
		for(count=1;count<a.length;count++)
		{
			avarage+=a[count];
			if(a[count]>maxi) maxi=a[count];
			if(a[count]<mini)mini=a[count];
		}
		avarage/=a.length;
		return new Triple(mini,maxi,avarage);
	}
}
