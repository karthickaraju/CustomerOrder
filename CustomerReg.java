package CustomerOrder;

import java.util.ArrayList;

public class CustomerReg {
	
	public ArrayList<Customer> customers = new ArrayList<>();

	public ArrayList<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(ArrayList<Customer> customers) {
		this.customers = customers;
	}	
	
	public void addcustomer(Customer customer) {
	
	customers.add(customer);
	}
		
	public Customer searchCustomer(String id) {
		
		CompanyCustomer cc;
		PrivateCustomer pc;
		
	 for(Customer customer : customers) {
		 if(customer.getClass().getName().equals("PrivateCustomer"));
		 pc = (PrivateCustomer) customer;
		 if (pc.getSsn().contentEquals(id)) {
			 return(pc);
		 }
		 
		 for(Customer customer1 : customers) {
			 if(customer.getClass().getName().equals("CompanyCustomer"));
			 cc = (CompanyCustomer) customer1;
			 if (cc.getCorporateid().contentEquals(id)) {
				 return(cc); 
	    }
	  }
	 }
	return null;
   }
	
	public void deletecustomer(String id) {
		Customer tmpCust;
		tmpCust = this.searchCustomer(id);
		customers.remove(tmpCust);
	}
	
	public void printall() {
		
		for(Customer customer : customers) {
		if(customer.getClass().getName().equals("PrivateCustomer"));
		System.out.println(customer);
		}	
		
		for(Customer customer : customers) {
			if(customer.getClass().getName().equals("CompanyCustomer"));
			System.out.println(customer);
	 }
	
  }
		
}


