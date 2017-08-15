package exsheet2;

public class AdressEntryBook {

		private final String name;
		private final String email;
		private final String phone;
		public AdressEntryBook(String name,String email,String phone)
		{
			this.name=name;
			this.email=email;
			this.phone=phone;
			
		}
		
		public  String getName()
		{
			return name;
		}
		public String getPhone()
		{
			return phone;
		}
		public String getEmail()
		{
			return email;
		}
		
	}


