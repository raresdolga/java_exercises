
public class TestCatalogue extends StockItem {
 
	public TestCatalogue(int price, int quantity)
	{
		super(price,quantity);
	}
	
	public String getStockDescription()
	{
		return " lists all Items and prices";
	}
	
	public String getStockType()
	{
		return "Catalogue";
	}
	
	public double getVatRate()
	{
		return 0;
	}

}
