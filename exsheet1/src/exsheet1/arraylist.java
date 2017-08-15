package exsheet1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
 class ExampleArray {
private ArrayList<Integer> numbers = new ArrayList<Integer>();
	public void displayIntegers()
	{
      for(int i: numbers)
      {
    	  System.out.println(i);
      }
      }
	private void sortIntegers()
	{
		Collections.sort(numbers);
	}
	public void run()
	{
	displayIntegers();
	sortIntegers();
	displayIntegers();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new ExampleArray().run();
	}
	

}
