package CustomerOrder;

import java.util.ArrayList;

public class Supplier {
	
	private String supplierid;
	private String suppliername;
	private String supplierphonenumber;
	public ArrayList<Article> article = new ArrayList<Article>();

	
	public Supplier(String supplierid, String suppliername, String supplierphonenumber) {
		
		this.supplierid=supplierid;
		this.suppliername=suppliername;
		this.supplierphonenumber=supplierphonenumber;	
		
	}
    
	public ArrayList<Article> getArticle() {
		return article;}

	public void setArticle(ArrayList<Article> article) {
		this.article = article;}

	public String getSupplierid() {
		return supplierid;}

	public void setSupplierid(String supplierid) {
		this.supplierid = supplierid;}

	public String getSuppliername() {
		return suppliername;}

	public void setSuppliername(String suppliername) {
		this.suppliername = suppliername;}

	public String getSupplierphonenumber() {
		return supplierphonenumber;}

	public void setSupplierphonenumber(String supplierphonenumber) {
		this.supplierphonenumber = supplierphonenumber;}	

}
