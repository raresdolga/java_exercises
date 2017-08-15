
public class Book extends StockItem {
	
	private final int pages;
	
	public Book(int price,int quantity,int pages)
	{
		super(price,quantity);
		this.pages=pages;
	}
	
	public String getStockType(){
		return "Computer Science Book"; 
	}
	
	public String getStockDescription()
	{
		return "well expalined and good for stupids like me";
	}
	
}
