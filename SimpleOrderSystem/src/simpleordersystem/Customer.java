package simpleordersystem;

import java.util.ArrayList;

public class Customer
{
  private String firstName;
  private String lastName;
  private String address;
  private String phone;
  private String email;
  private String mobilePhone;
  private ArrayList<Order> orders;

  public Customer(String firstName, String lastName, String address, String phone, String email,String mobilePhone)
  {
    this.firstName = firstName;
    this.lastName = lastName;
    this.address = address;
    this.phone = phone;
    this.email = email;
    this.mobilePhone=mobilePhone;
    orders = new ArrayList<Order>();
  }

  public String getFirstName()
  {
    return firstName;
  }

  public String getLastName()
  {
    return lastName;
  }

  public String getAddress()
  {
    return address;
  }

  public String getPhone()
  {
    return phone;
  }

  public String getEmail()
  {
    return email;
  }

  public String getmobilePhone()
  {
    return mobilePhone;
  }	
  
  public void addOrder(Order order)
  {
    orders.add(order);
  }

  public ArrayList<Order> getOrders()
  {
    return new ArrayList<Order>(orders);
  }

  public int getTotalForAllOrders()
  {
    int total = 0;
    for (Order order : orders)
    {
      total += order.getTotal();
    }
    return total;
  }
}
