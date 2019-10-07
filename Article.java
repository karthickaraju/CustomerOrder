package CustomerOrder;

public class Article {
	
	private String articleid;
	private String articlename;
	private double articleprice;
	private Supplier supplier;
	
	public Article(String articleid, String articlename, double articleprice) {
		this.articleid=articleid;
		this.articlename=articlename;
		this.articleprice=articleprice;
	}

	public String getarticleId() {
		return articleid;}

	public void setId(String articleid) {
		this.articleid = articleid;}

	public Supplier getSupplier() {
		return supplier;}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;}

	public String getarticleName() {
		return articlename;}

	public void setarticleName(String articlename) {
		this.articlename = articlename;}

	public double getarticlePrice() {
		return articleprice;}

	public void setarticlePrice(double articleprice) {
		this.articleprice = articleprice;}	
	
    public String toString() {
    	
    	return  "Article Id: " + this.getarticleId() + " " + "Article Name: " + this.getarticleName() + " " + "Article Price: " + this.getarticlePrice();
    	
    }
		
}

