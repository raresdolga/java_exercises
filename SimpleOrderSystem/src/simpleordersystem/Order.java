package simpleordersystem;

import java.util.ArrayList;

public class Order
{
  private ArrayList<LineItem> lineItems;

  public Order()
  {
    lineItems = new ArrayList<LineItem>();
  }

  public int getLineItemCount()
  {
    return lineItems.size();
  }
  public boolean searchProduct(Product product) //q6
  {
	  for(LineItem item:lineItems)
	  {
		  if((item.getProduct()).getCode()==product.getCode())//one and the same object
			  return true;
	  }
	  return false;
  }
  public void add(LineItem item)
  {
    lineItems.add(item);
  }

  public int getTotal()
  {
    int total = 0;
    for (LineItem item : lineItems)
    {
      total += item.getSubTotal();
    }
    return total;
  }
  public ArrayList<LineItem> getLineItem()
  {
	  return new ArrayList<LineItem>(lineItems);
  }
}
