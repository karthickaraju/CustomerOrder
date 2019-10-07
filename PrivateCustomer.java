package CustomerOrder;

public class PrivateCustomer extends Customer {
	
	private String ssn;
	
	public PrivateCustomer(String name, String address, String phoneNumber) {
        super(name, address, phoneNumber);
    }
	
    public PrivateCustomer(String name, String address, String phoneNumber, String ssn) {
        super(name, address, phoneNumber);
        this.ssn = ssn;
    }
	
	public String getSsn() {
		return ssn;}
	
	public void setSsn(String ssn) {
		this.ssn = ssn;}

    public String toString() {
    	
    	return  "Customer Name: " + this.getName() + " " + "Address: " + this.getAddress() + " " +  "phonenumber: " + this.getPhonenumber() + " " + "ssn: " + this.getSsn();
    	
    }
}
