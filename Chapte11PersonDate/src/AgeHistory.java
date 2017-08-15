import java.util.Scanner;

/*
 * this is kind of an interface that prints out 
 * what the other 2 classes construct
 */
public class AgeHistory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int day, month,year;
		day=input.nextInt();
		month= input.nextInt();
		year=input.nextInt();
		
		Date.setPresentDate(new Date(day,month,year)); //util set
		
		int noPeople= input.nextInt();//find the number of people
		//read the blank line 
		input.nextLine();
		//Read person's name and date of birth
		for(int j=0;j<noPeople;j++)
		{
			System.out.println("Enter Person's name " + (j+1) +":");
			String name= input.nextLine();
			//enter birthdayDetails
			System.out.println("Day/month/year "+ ": "); // be careful not to put \ as it is an escape character
			int birthDay=input.nextInt();
			int birthMonth=input.nextInt();
			int birthYear=input.nextInt();
			
			input.nextLine(); //Skip the next line as after nextInt for nextLine(); you put next nextLine(); between to eliminate blank spaces
			
			Date birthDate=new Date(birthDay,birthMonth,birthYear);
			Person individual= new Person(birthDate,name);
			
			System.out.println(individual.ageHistory());
		}
		
	}

}
