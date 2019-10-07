package CustomerOrder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import javax.swing.JFrame;

public class Controller {
    
    //Order order = new Order();
    Customer tmpCust;
    OrderLine ol = new OrderLine();
    CustomerReg custReg;
    ArticleReg artReg = new ArticleReg();
    JFrame customerFrame;
    
    private List<Article> articleInventory;
    private OrderRegister orderRegister = new OrderRegister();
    
    public Controller() {}
    /*public Controller(Order order, CustomerRegister custreg, ArticleRegister artReg, JFrame customerFrame) {
        this.order = order;
        this.custReg = custreg;
        this.artReg = artReg;
        this.customerFrame = customerFrame;
        this.articleInventory = articleInventory;
    }*/
    
    //Pre initialized array list used instead of a DB
    public List<Article> getArticleInventory(){
        return articleInventory;
    }
    public Customer findCustomer(String id) {
        return findCustomer(id);
    }
//  public void createOrder(Customer customer, String reportDate, OrderLine orderLine) {
//
//      Customer privateCustomer = new PrivateCustomer(custName, custAddress, custPhone);
//      tmpCust = privateCustomer;
//      Article article = new Article(articleId, articleName, articlePrice);
//      article.setArticleId(articleId);
//      article.setName(articleName);
//      article.setPrice(articlePrice);
//      tmpCust.setName(custName);
//      ol.setQuantity(qty);
//      order.totalPriceOrder();
//      System.out.println("Order");
//      System.out.println("***********************");
//      System.out.println("Customer Name:      " + tmpCust.getName());
//      System.out.println("***********************");
//      System.out
//              .println(articleId + "\t\t" + articleName + "\t\t" + "Qty: " + qty + "\t\t" + ol.articlePrice(article));
////        System.out.println("Total Price: \t\t"+ order.totalPriceOrder());
//      tmpCust = new Customer(custName, custAddress, custPhone) {
//      };
////        Customer tmpCust = null;
////
////        article.setArticleId(articleId);
////        article.setName(articleName);
////        article.setPrice(articlePrice);
//
//  }
    
    public void addArticle(Article article) {
        artReg.add(article);
    }
    public List<Article> listArticles() {
        return artReg.getArticleList();
    }
    
    /*public void addOrderLines(Article article, int quantity) {
        ol.setArticle(article);
        ol.setQuantity(quantity);
        order.addOrderlines(ol);
    }
    
    public List<OrderLine> listOrderLines(){
        return order.getOrderlines();
    }*/
    
    public void addCustomer(Customer customer) {
        custReg.addcustomer(customer);
    }
    
    public Customer getCustomer(String customerName) {
        return custReg.searchCustomer(customerName);
    }
    
    //Creating an order!!
    public Order createOrder(Customer customer, String reportDate, List<OrderLine> orderLineList) {
        //String testON = "ON"+Math.random();
        String orderNumber = UUID.randomUUID().toString();
        Order order = new Order(orderNumber, reportDate, customer, orderLineList);
        return order;
    }
    //Add to Customer Shopping List
    public void addArticleToShoppingList(Article article, int quantity) {
        orderRegister.addToOrder(article, quantity);
    }
    //Remove from Customer Shopping List
    public void removeArticleFromShoppingList(Article article) {
        orderRegister.removeFromOrder(article);
    }
    //Retrieve Customer Shopping List
    public List<OrderLine> getArticlesForShoppingList(){ return orderRegister.getOrderLineList();
    
    }
    
}