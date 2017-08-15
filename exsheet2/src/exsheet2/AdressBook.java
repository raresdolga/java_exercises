package exsheet2;
import java.util.ArrayList;
public class AdressBook{

	private ArrayList<AdressEntryBook> myArray=new ArrayList<AdressEntryBook>();
	public void addElement(AdressEntryBook book)
	{
		myArray.add(book);
	}
	
	public void removeElement(AdressEntryBook book)
	{
		myArray.remove(book);

	}

	public boolean search(String s)
	{
		for(AdressEntryBook n:myArray)
			if((n.getName()).equals(s)==true)
				return true;
		return false;
	}
	public ArrayList<AdressEntryBook> getArray()
	{
		return new ArrayList<AdressEntryBook>(myArray);
	}
}