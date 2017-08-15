package simpleordersystem;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.FileSystemNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;

public class SimpleOrderSystemTerminalUI implements SimpleOrderSystemView
{
	public static final int ADD_CUSTOMER = 1;
	public static final int ADD_ORDER = 2;
	public static final int ADD_PRODUCT = 3;
	public static final int LIST_CUSTOMERS = 4;
	public static final int TOTAL_OVERALL=5;
	public static final int CHANGE_DETAILS=6;
	public static final int SHOW_ORDER_FOR_CUSTOMER=7;
	public static final int SHOW_ORDER_CUSTOMER_BY_PROD=8;
	public static final int SAVE_ONFILE=9;
	public static final int QUIT = 10;
	private Input in;
	private SimpleOrderSystemModel model;
	private OrderEntryController orderEntryController;


	public SimpleOrderSystemTerminalUI(Input in, SimpleOrderSystemModel model)
	{
		this.in = in;
		this.model = model;
	}

	public void addOrderEntryController(OrderEntryController orderEntryController)
	{
		this.orderEntryController = orderEntryController;
	}

	public void run()
	{
		while(true)
		{
			displayMenu();
			int option = getMenuInput();
			if (option == QUIT)
			{
				break;
			}
			doOption(option);
		}
	}

	private void displayMenu()
	{
		System.out.println("Simple Order System Menu");
		System.out.println(ADD_CUSTOMER + ". Add Customer");
		System.out.println(ADD_ORDER + ". Add Order");
		System.out.println(ADD_PRODUCT + ". Add Product");
		System.out.println(LIST_CUSTOMERS + ". List Customers");
		System.out.println(TOTAL_OVERALL+".Display Total_Order");
		System.out.println(CHANGE_DETAILS+".Change Customer Details");
		System.out.println(SHOW_ORDER_FOR_CUSTOMER+".Change Customer Details");
		System.out.println(SHOW_ORDER_CUSTOMER_BY_PROD+ ".Show customer Name And and the order that has a poduct");
		System.out.println(SAVE_ONFILE+".Save on File:");
		System.out.println(QUIT + ". Quit");
		System.out.println();
	}

	private void doOption(int option)
	{
		switch (option)
		{
		case ADD_CUSTOMER:
			addCustomer();
			break;
		case ADD_ORDER:
			addOrder();
			break;
		case ADD_PRODUCT:
			addProduct();
			break;
		case LIST_CUSTOMERS:
			listCustomers();
			break;
		case TOTAL_OVERALL:
			total_Overall();
			break;
		case CHANGE_DETAILS:
			changeCustomer_Details();
			break;
		case SHOW_ORDER_FOR_CUSTOMER:
			show_Order_for_customer();
			break;
		case SHOW_ORDER_CUSTOMER_BY_PROD:
			displayOrder_ClientByProduct();
			break;
		case SAVE_ONFILE:
			writeOnFile();
			break;
		default:
			System.out.println("Invalid option - try again");
		}
	}
	private void displayByName()
	{
		Iterator<Customer> customers=model.getCustomerIterator();
		int i=0;
		Customer customer;
		while(customers.hasNext())
		{
			i++;
			customer =customers.next();
			System.out.println(i+"."+customer.getFirstName()+ " "+ customer.getLastName());
		}
	}
	private int getMenuInput()
	{
		System.out.print("Enter menu selection: ");
		int option = in.nextInt();
		in.nextLine();
		return option;
	}

	private void addCustomer()
	{
		System.out.println("Add new customer");
		System.out.println("Enter first name:");
		String firstName = in.nextLine();
		System.out.println("Enter last name:");
		String lastName = in.nextLine();
		System.out.println("Enter address:");
		String address = in.nextLine();
		System.out.println("Enter phone number:");
		String phone = in.nextLine();
		System.out.println("Enter email address:");
		String email = in.nextLine();
		System.out.println("Enter phone number:");
		String mobilePhone=in.nextLine();
		model.addCustomer(firstName,lastName,address,phone,email,mobilePhone);
	}
	private void changeCustomer_Details()
	{
		boolean error=true;
		String state;
		while(error==true)
		{
			System.out.println("Change customer details");
			System.out.println("Enter name :");
			String firstName=in.nextLine();
			System.out.println("Enter first name:");
			String lastName = in.nextLine();

			try{
				Customer copy=model.getCustomer(firstName, lastName);
				String address=copy.getAddress();
				String phone=copy.getPhone();
				String email=copy.getEmail();
				String mobilePhone=copy.getmobilePhone();
				System.out.println("Switch adress?");
				state=in.nextLine();
				if(state.compareTo("yes")==0)
				{
					System.out.println("Enter adress:");
					address = in.nextLine();
				}
				System.out.println("Switch phone?");
				state=in.nextLine();
				if(state.compareTo("yes")==0)
				{
					System.out.println("Enter phone:");
					phone = in.nextLine();
				}
				System.out.println("Switch email?");
				state=in.nextLine();
				if(state=="yes")
				{
					System.out.println("Enter email address:");
					email = in.nextLine();
				}

				System.out.println("Switch mobilePhone?");
				state=in.nextLine();
				if(state.compareTo("yes")==0)
				{
					System.out.println("Enter email address:");
					mobilePhone= in.nextLine();
				}
				ArrayList<Order> orders=new ArrayList<Order>(copy.getOrders());
				model.deletCustomer(copy); //delete the old one from the dataBase

				model.addCustomer(firstName, lastName, address, phone, email,mobilePhone);//add the new one

				Customer newOne = model.getCustomer(firstName, lastName);

				for(Order order:orders)
					newOne.addOrder(order);
				error=false;//has been on this branch
			}
			catch (Exception e)
			{
				System.out.println("The customer is not in the data base, enter Onother name:");

			}
		}
	}

	private void  show_Order_for_customer()
	{
		displayByName();
		
		Customer customer;
		System.out.println("inset customer number:");
		int number=in.nextInt();
		
		customer=model.getCustomerByIndex(number-1);// has to start from 0 but number starts from 1
		
		ArrayList<Order> orders=new ArrayList<Order>();
		orders=customer.getOrders();
		
		for(Order order: orders)
		{
			ArrayList<LineItem> items=order.getLineItem();
			for(LineItem item: items)
				System.out.print(item.getProduct().getDescription());//get description of the product
			System.out.println(" ");
		}
	}

	private void addOrder()
	{
		Customer customer = findCustomer();
		if (customer == null)
		{
			System.out.println("Unable to add order");
			return;
		}
		Order order = new Order();
		addLineItems(order);
		if (order.getLineItemCount() == 0)
		{
			System.out.println("Cannot have an empty order");
			return;
		}
		customer.addOrder(order);
	}

	public void  total_Overall() //my modification 
	{
		/*int total=0;
	  Iterator<Customer> customers = model.getCustomerIterator();
	  while(customers.hasNext())
	  {
		  total+=customers.next().getTotalForAllOrders();
	  }*/
		System.out.println(model.overallTotal());
	}
	private String getWithPrompt(String prompt)
	{
		System.out.print(prompt);
		return in.nextLine();
	}

	public String getCustomerFirstName()
	{
		return getWithPrompt("Enter customer first name: ");
	}

	public String getCustomerLastName()
	{
		return getWithPrompt("Enter customer last name: ");
	}

	public void reportInvalidCustomer(String firstName, String lastName)
	{
		System.out.println("Cannot find a customer called: "
				+ firstName + " " + lastName);
	}

	private Customer findCustomer()
	{
		System.out.print("Enter customer last name: ");
		String lastName = in.nextLine();
		System.out.print("Enter customer first name: ");
		String firstName = in.nextLine();
		return model.getCustomer(firstName, lastName);
	}

	private void addLineItems(Order order)
	{
		while (true)
		{
			System.out.print("Enter line item (y/n): ");
			String reply = in.nextLine();
			if (reply.startsWith("y"))
			{
				LineItem item = getLineItem();
				if (item != null)
				{
					order.add(item);
				}
			}
			else
			{
				break;
			}
		}
	}

	private LineItem getLineItem()
	{
		return orderEntryController.getLineItemFromView();
	}

	public boolean isNextLineItem()
	{
		System.out.print("Enter line item (y/n): ");
		String reply = in.nextLine();
		if (reply.startsWith("y"))
		{
			return true;
		}
		return false;
	}

	public int getProductCode()
	{
		System.out.print("Enter product code: ");
		int code = in.nextInt();
		in.nextLine();
		return code;
	}

	public void reportInvalidProductCode(int productCode)
	{
		System.out.println("Product code: " + productCode + " is invalid");
	}

	public int getProductQuantity()
	{
		System.out.print("Enter quantity: ");
		int quantity = in.nextInt();
		in.nextLine();
		return quantity;
	}

	private void addProduct()
	{
		System.out.print("Enter product code: ");
		int code = in.nextInt();
		in.nextLine();
		if (!model.isAvailableProductCode(code))
		{
			return;
		}
		System.out.print("Enter product description: ");
		String description = in.nextLine();
		System.out.print("Enter product price: ");
		int price = in.nextInt();
		in.nextLine();
		model.addProduct(code, description, price);
	}
	public void displayOrder_ClientByProduct()
	{
		 Iterator<Customer> customers = model.getCustomerIterator();
		Product product;
		int productCode=in.nextInt();
		product=model.getProduct(productCode);
		 Customer customer; 
		 while(customers.hasNext())
		  {
			 customer=customers.next();
			 ArrayList<Order> orders;
			 orders=customer.getOrders();
			 for(Order order:orders)
			 {
				 if(order.searchProduct(product))
					 System.out.println(customer.getFirstName()+" "+customer.getLastName());
			 }
		  }
	}
	public void listCustomers()
	{
		System.out.println("List of customers");
		Iterator<Customer> customers = model.getCustomerIterator();
		while (customers.hasNext())
		{
			Customer customer = customers.next();
			System.out.println("Name: " + customer.getLastName()
			+ ", "
			+ customer.getFirstName());
			System.out.println("Address: " + customer.getAddress());
			System.out.println("Phone: " + customer.getPhone());
			System.out.println("Email: " + customer.getEmail());
			System.out.println("Orders made: " + customer.getOrders().size());
			System.out.println("Total for all orders: " + customer.getTotalForAllOrders());
		}
	}
	public void writeOnFile()
	{
		String name = in.next();
		model.saveOnFile(name);
	}
	
}
