package simpleordersystem;

import java.util.Iterator;

public interface SimpleOrderSystemModel
{
  void addCustomer(String firstName, String lastName,
                   String address, String phone, String email,String mobilePhone);

  Customer getCustomer(String firstName, String lastName);

  Iterator<Customer> getCustomerIterator();

  Product getProduct(int code);

  void addProduct(int code, String description, int price);
  void removeProduct(Product product);
  boolean isAvailableProductCode(int code);
  
  int overallTotal();
  
  void deletCustomer(Customer customer);
  Customer getCustomerByIndex(int i);
  void saveOnFile(String file);
}