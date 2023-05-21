package cleaningCarpet;

import java.util.ArrayList;
import java.util.List;

import cleaningCarpet.Order.OrderStatus;

public class Statistics {
	
private List<Order> orders;
    
    public Statistics() {
        this.orders = new ArrayList<Order>();
    }
    
    public void addOrder(Order order) {
        this.orders.add(order);
    }
    
    public int getTotalDeliveredItems() {
        int totalItems = 0;
        for (Order order : this.orders) {
            totalItems += order.getItems().size();
        }
        return totalItems;
    }
    
    public double getTotalCash() {
        double totalCash = 0.0;
        for (Order order : this.orders) {
            totalCash += order.getTotalPrice();
        }
        return totalCash;
    }
    
    public double getTotalPaid() {
        double totalPaid = 0.0;
        for (Order order : this.orders) {
            if (order.getStatus() == OrderStatus.PAID) {
                totalPaid += order.getTotalPrice();
            }
        }
        return totalPaid;
    }
    
    public double getTotalDebts() {
        double totalDebts = 0.0;
        for (Order order : this.orders) {
            if (order.getStatus() == OrderStatus.UNPAID) {
                totalDebts += order.getTotalPrice();
            }
        }
        return totalDebts;
    }

}
