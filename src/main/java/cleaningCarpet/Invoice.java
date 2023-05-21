package cleaningCarpet;

import java.util.ArrayList;

public class Invoice {
    private Customer customer;
    private ArrayList<Product> products;
    private String deliveryAddress;
    private Order order;


    public Invoice(Customer customer, ArrayList<Product> products, String deliveryAddress,Order order) {
        this.customer = customer;
        this.products = products;
        this.deliveryAddress = deliveryAddress; 
        this.order=order;
    }

    public void printInvoice() {
        System.out.println("=======================================");
        System.out.println("            INVOICE");
        System.out.println("=======================================");
        System.out.println("Customer Details:");
        System.out.println("Name: " + customer.getName());
        System.out.println("Phone: " + customer.getPhone());
        System.out.println("Address: " + customer.getAddress());
        System.out.println("Delivery Address: " + deliveryAddress);
        System.out.println("---------------------------------------");
        System.out.println("Products:");
        for (Product product : products) {
            System.out.println("Name: " + product.getName());
            System.out.println("Price: " + product.getPrice());
            System.out.println("---------------------------------------");
        }
        System.out.println("Total Price: " + order.getTotalPrice());
        System.out.println("=======================================");
    }
}