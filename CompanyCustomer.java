package CustomerOrder;

public class CompanyCustomer extends Customer {
	
	private String corporateid;

	public CompanyCustomer(String name, String address, String phonenumber, String corporateid) {
		
		super(name, address, phonenumber);
		this.corporateid = corporateid;
	}
	
	public String getCorporateid() {
		return corporateid;}

	public void setCorporateid(String corporateid) {
		this.corporateid = corporateid;}
	
	 public String toString() {
	    	
	    	return  "Customer Name: " + this.getName() + " " +  "Address: " + this.getAddress() + " " + "phonenumber: " + this.getPhonenumber() + " " + "corporateid: " + this.getCorporateid();
	    	
	    }

}
