package simpleordersystem;

import java.util.ArrayList;
import java.util.Iterator;
import java.io.*;
public class DataManager implements SimpleOrderSystemModel, Serializable 
{
  private ArrayList<Customer> customers;
  private ArrayList<Product> products;

  public DataManager()
  {
    customers = new ArrayList<Customer>();
    products = new ArrayList<Product>();
   // File save=new File("D:\\Users\\Rares\\Documents\\java.selfexercise\\SimpleOrderSystem\\src\\simpleordersystem\\data.txt");
  
  }

  public void addCustomer(String firstName, String lastName,
                          String address, String phone, String email, String mobilePhone)
  {
    Customer customer = new Customer(firstName, lastName,
                                     address, phone, email,mobilePhone);
    customers.add(customer);
  }
 
  public void deletCustomer(Customer customer)
  {
	  customers.remove(customer);
  }
  public Customer getCustomerByIndex(int i)
  {
	 return customers.get(i);
  }
  public Customer getCustomer(String firstName, String lastName)
  {
    for (Customer customer : customers)
    {
      if (customer.getFirstName().equals(firstName)
          && customer.getLastName().equals(lastName))
      {
        return customer;
      }
    }
    return null;
  }

  public Iterator<Customer> getCustomerIterator()
  {
    return customers.iterator();
  }

  public Product getProduct(int code)
  {
    for (Product product : products)
    {
      if (product.getCode() == code)
      {
        return product;
      }
    }
    return null;
  }

  public void addProduct(int code, String description, int price)
  {
    Product product = new Product(code,description,price);
    products.add(product);
  }
  public void removeProduct(Product product)
  {
	  products.remove(product);
  }
  public boolean isAvailableProductCode(int code)
  {
    if (code < 1)
    {
      return false;
    }
    for (Product product : products)
    {
      if (product.getCode() == code) // true apoi fasle
      {
        return false;
      }
    }
    return true;
  }

  public int overallTotal()
  {
    int total = 0;
    for (Customer customer : customers)
    {
      total += customer.getTotalForAllOrders();
    }
    return total;
  }
  
public void saveOnFile(String file)
{
	OutputStream saveOn;
	  ObjectOutputStream save;
	  SimpleOrderSystemModel data =new DataManager();
	 
	  try {
		   saveOn= new FileOutputStream(file);
		   save=new ObjectOutputStream(saveOn); // Open an object stream
	  		
		   save.writeObject(data);
	  		//System.out.println(mode.getCustomerByIndex(1)); not working
	  		save.close();
	  		saveOn.close();	
	readFile(file);
	  }
	  catch (FileNotFoundException e)
	  {
		  System.err.println(e.getMessage());
	  }
	 catch(Exception e)
	  {
	e.printStackTrace();
		  //System.out.println(e.getMessage());
	  }
}

public void readFile(String file)
{
	FileInputStream saveOn;
	  ObjectInputStream save;
	  SimpleOrderSystemModel data =new DataManager();
	 
	  try {
		  saveOn= new FileInputStream(file);
		   save=new ObjectInputStream(saveOn); // Open an object stream
	  		
		   SimpleOrderSystemModel mode=(DataManager)(save.readObject());
	  		//System.out.println(mode.getProduct(1).getDescription());
	  		save.close();
	  		saveOn.close();	
	
	  }
	  catch (FileNotFoundException e)
	  {
		  System.err.println(e.getMessage());
	  }
	 catch(Exception e)
	  {
	e.printStackTrace();
		  //System.out.println(e.getMessage());
	  }
}
}
