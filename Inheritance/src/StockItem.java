
public abstract class StockItem {

	private  int  priceInitial;
	private  int quantity;
	private int code;
	private int NoOfItem=0;
	public StockItem(int price, int quantity)
	{
		NoOfItem++;
		code=NoOfItem;
		this.priceInitial=price;
		this.quantity=quantity;
	}
	public int getStokCode()
	{
		return code;
	}
	public abstract String getStockType();
	
	public abstract String getStockDescription();

	
	public int getQuantityStock()
	{
		return quantity;
	}
	
	public int getPriceExVat()
	{
		return priceInitial;
	}
	public void increaseStock(int n) throws IllegalArgumentException
	{
		if(n<1) throw new IllegalArgumentException("not a valid amount");
		quantity+=n;//increase quantity by n units
	}
	public boolean sellStock(int n)throws IllegalArgumentException
	{
		if(n<1)throw new IllegalArgumentException("not a valid amount");
		if(n>quantity)return false;
		quantity-=n;
		return true;
	}
	public void setExVat(int rate)
	{
		priceInitial=rate;
	}
	public double getVatRate()
	{
		return 20.0;
	}
	public int getPriceIncVat()
	{
		return priceInitial+(int)20.0;
	}
	public String toString()
	{
		return code+getStockType()+" "+getStockDescription()+" "+getPriceIncVat()+" "+getPriceExVat();
	}
	
}
