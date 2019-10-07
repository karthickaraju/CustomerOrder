package CustomerOrder;

import java.util.ArrayList;
import java.util.List;

public class OrderRegister {
	
	
	
	    private List<OrderLine> orderLineList = new ArrayList<>();
	    //Utility method to store orderline(s) / order in an arrayList
	    public void addToOrder(Article article, int quantity) {
	        orderLineList.add(new OrderLine(quantity, article));
	    }
	    public  void removeFromOrder(Article article) {
	        System.out.println("Article to be removed: "+article.getarticleName());
	        System.out.println("Before Removal: "+orderLineList.size());
	        for(int i=0; i<orderLineList.size(); i++) {
	            if(orderLineList.get(i).getArticle().getarticleName().equals(article.getarticleName())) {
	                orderLineList.remove(i);
	            }
	        }
	        System.out.println("After Removal: "+orderLineList.size());
	    }
	    public List<OrderLine> getOrderLineList() {
	        return orderLineList;
	    }
	}


