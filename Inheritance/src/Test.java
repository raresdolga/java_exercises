
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Book book=new Book(20,20,10000);
	StockItem [] p={
			 new Book(20,30,2342),
			new  Book(56,200,34)
			
	};
	for(StockItem item:p)
		
	System.out.println(item.toString());
	
	try{
	book.increaseStock(3);
	}
	
	catch(Exception e)
	{
		System.err.println(e.getMessage());
	}
	
	}

}
