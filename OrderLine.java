package CustomerOrder;

public class OrderLine {

	private int orderquantity;
	private Article article;

	public OrderLine() {
	} 

	public OrderLine(int orderquantity, Article article) {
		super();
		this.orderquantity = orderquantity;
		this.article = article;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	public int getOrderquantity() {
		return orderquantity;
	}

	public void setOrderquantity(int orderquantity) {
		this.orderquantity = orderquantity;
	}

	public double articlePrice(Article article) {
		double articlePrice = article.getarticlePrice() * getOrderquantity();
		return articlePrice;
	}

	public String toString() {

		return "\n Article is: " + getArticle() + " and quantity is: " + getOrderquantity();
	}

}
