package cleaningCarpet;

import java.util.List;

public class Order {
	
	 private Customer customer;
		private List<Product> items;
		private OrderStatus status; 
		private double totalPrice;
		
		   enum OrderStatus {
		        WAITING,
		        IN_TREATMENT,
		        COMPLETE,
		        PAID,
		        UNPAID,
		    }
		   
	    public Order() {
	    	 this.customer = null;
	         this.items = null;
	         this.status = OrderStatus.WAITING;
	    } 

	    public Order( Customer customer,List<Product> items) {
	        
	        this.customer = customer;
	        this.items = items;
	        this.status = OrderStatus.WAITING;
	    }
	    
	    public List<Product> getItems() {
	        return this.items;
	    }
	    
	    public double getTotalPrice() {
	        totalPrice = 0.0;
	        for (Product item : this.items) {
	            totalPrice += item.getPrice();
	        
	        if(item.getPrice() > 400) {
	        	totalPrice = item.getPrice() * (1 - 0.1);
	        }
	        }
	       return totalPrice;
	    }
	    
	    public OrderStatus getStatus() {
	        return this.status;
	    }
	    
	    public void setStatus(OrderStatus status) {
	        this.status = status;
	    }

}
