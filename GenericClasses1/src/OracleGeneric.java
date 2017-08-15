public class OracleGeneric
{
public <T1 extends Collection>int count(T1[] myArray)
{
	int count =0;
	for(T1 col : myArray)
		count++;
	retun count ;
}
}