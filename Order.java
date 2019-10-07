package CustomerOrder;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

	    private String orderNr;
	    private Date date;
	    private String stringDate;
	    private Customer customer;
	    private OrderLine orderline;
	    private List<OrderLine> orderlines = new ArrayList<>();
	    public Order(String orderNr, String stringDate, Customer customer, List<OrderLine> orderlines) {
	        super();
	        this.orderNr = orderNr;
	        this.stringDate = stringDate;
	        this.customer = customer;
	        this.orderlines = orderlines;
	    }
	    public Order(String orderNr, Date date) {
	        this.orderNr = orderNr;
	        this.date = date;
	    }
	    public Customer getCustomer() {
	        return customer;
	    }
	    public void setCustomer(Customer customer) {
	        this.customer = customer;
	    }
	    public List<OrderLine> getOrderlines() {
	        return orderlines;
	    }
	    public void setOrderlines(ArrayList<OrderLine> orderlines) {
	        this.orderlines = orderlines;
	    }
	    public String getOrderNr() {
	        return orderNr;
	    }
	    public void setOrderNr(String orderNr) {
	        this.orderNr = orderNr;
	    }
	    public Date getDate() {
	        return date;
	    }
	    public void setDate(Date date) {
	        this.date = date;
	    }
	    public void addOrderlines(OrderLine orderline) {
	        orderlines.add(orderline);
	    }
	    public OrderLine getOrderline() {
	        return orderline;
	    }
	    public void setOrderline(OrderLine orderline) {
	        this.orderline = orderline;
	    }
	    public String getStringDate() {
	        return stringDate;
	    }
	    public void setStringDate(String stringDate) {
	        this.stringDate = stringDate;
	    }
	    public void deleteOrderLines(OrderLine orderLine) {
	        if (orderlines.contains(orderLine)) {
	            orderlines.remove(orderLine);
	        }
	    }
	    /*public double totalPriceOrder() {
	        double totalPrice = 0;
	        for (OrderLine orderLine : orderlines) {
	            totalPrice += orderLine.totalArticlePrice(orderLine.getArticle());
	        }
	        return totalPrice;
	    }*/
	    public String toString() {
	        return getCustomer() + "\nOrder Number: " + getOrderNr() + ", Date: " + getDate() + "\nArticles: \n"
	                + getOrderlines();
	    }
	}
