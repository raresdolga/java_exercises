package exsheet2;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	private static String InputFile()
	{
		Scanner inp = new Scanner(System.in);
		return inp.nextLine();
	}
	public static void main(String [] args)
	{
		AdressBook adressbook=new AdressBook();
		File input=new File(InputFile());
		try{
			Scanner in=new Scanner(System.in);
			String [] person;
			
				person=in.next().split(" ");
				if(person[3]==null||person[0]==null||person[1]==null)
					System.out.println("invalid input");
				AdressEntryBook book=new AdressEntryBook(person[0],person[1],person[2]);
				if(person[3]=="search")
					System.out.println(adressbook.search(book.getName()));
				else
					if(person[3]=="remove")
						adressbook.removeElement(book);
					else
						if(person[3]=="add")
							adressbook.addElement(book);
				ArrayList<AdressEntryBook> array=adressbook.getArray();
			
		}
		catch(Exception e) {
			System.out.println("there is no file or input is not good ");

		}

		ArrayList<AdressEntryBook> array=adressbook.getArray();

	}

}
