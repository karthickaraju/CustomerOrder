package CustomerOrder;
import java.util.ArrayList;

public abstract class Customer {
	
	private String name;
	private String address;
	private String phonenumber;
	
	public Customer(String name, String address, String phonenumber) {
		this.name = name;
		this.address = address;
		this.phonenumber = phonenumber;
	}
	private ArrayList<Order> orderList = new ArrayList<Order>();
	
	
	public ArrayList<Order> getOrderList() {
		return orderList;}

	public void setOrderList(ArrayList<Order> orderList) {
		this.orderList = orderList;}

	public String getName() {
		return name;}
	
	public void setName(String name) {
		this.name = name;}
	
	public String getAddress() {
		return address;}
	
	public void setAddress(String address) {
		this.address = address;}
	
	public String getPhonenumber() {
		return phonenumber;}
	
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;}	

}
