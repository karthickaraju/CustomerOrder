package CustomerOrder;

import java.util.Date;

public class TestClassCustomer {
	
	public static void main(String [] args) {
		
		CustomerReg custReg = new CustomerReg();
		ArticleReg artReg = new ArticleReg();
		OrderLine orderln1 = new OrderLine();
		OrderLine orderln2 = new OrderLine();
		OrderLine orderln3 = new OrderLine();
		OrderLine orderln4 = new OrderLine();
		OrderLine orderln5 = new OrderLine();

		
		PrivateCustomer privatecustomer1 = new PrivateCustomer("Prem", "kamnarsvagen lund", "765432923", "123456");
		PrivateCustomer privatecustomer2 = new PrivateCustomer("Karthicka", "37k lund", "756723553", "879653");
		PrivateCustomer privatecustomer3 = new PrivateCustomer("Lavanya", "lund", "979352354", "867436");
		PrivateCustomer privatecustomer4 = new PrivateCustomer("Saranya", "India", "674657347", "542487");
		PrivateCustomer privatecustomer5 = new PrivateCustomer("Lavanya", "lund", "979352354", "867436");


		
		Article art1 = new Article("01", "Spinach", 15);
		Article art2 = new Article("02", "Broccolli", 20);
		Article art3 = new Article("03", "Chicken", 25);
		Article art4 = new Article("04", "Bread", 30);
		Article art5 = new Article("05", "Icecream",35);

		custReg.addcustomer(privatecustomer1);
		custReg.addcustomer(privatecustomer2);
		custReg.addcustomer(privatecustomer3);
		custReg.addcustomer(privatecustomer4);
		custReg.addcustomer(privatecustomer5);

        artReg.add(art1);
        artReg.add(art2);
        artReg.add(art3);
        artReg.add(art4);
        artReg.add(art5);

        Order order1 = new Order("10", new Date());
        Order order2 = new Order("20", new Date());
        Order order3 = new Order("30", new Date());
        
        
        orderln1.setArticle(art1);
        orderln2.setArticle(art2);
        orderln3.setArticle(art3);
        orderln4.setArticle(art4);
        orderln5.setArticle(art5);
        
        orderln1.setOrderquantity(1);
        orderln2.setOrderquantity(2);

        order1.addOrderlines(orderln1);
        order1.addOrderlines(orderln2);
           
        
        order1.setCustomer(privatecustomer1);
        order2.setCustomer(privatecustomer2);
        order3.setCustomer(privatecustomer3);

        System.out.println(orderln1.articlePrice(art1));
        System.out.println(orderln1);
        System.out.println(order1);

	}

}
