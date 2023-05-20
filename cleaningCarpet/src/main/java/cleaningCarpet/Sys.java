package cleaningCarpet;

import java.util.ArrayList;

public class Sys {
	
	public  ArrayList<Customer>registeredUsers =new ArrayList<Customer>();
	public ArrayList<Product> products =new ArrayList<Product>();
	
	public void add(Admin admin,Product product) {
		if( admin.getLogState()==false) {
			System.out.println("you can't add books");
		}
		else {
			products.add(product);
		}
	}
	public boolean updateCustomerById(String id, String name, String phone, String address) {
	    for (Customer customer : registeredUsers) {
	        if (customer.getId() == id) {
	            customer.setName(name);
	            customer.setPhone(phone);
	            customer.setAddress(address);
	            return true;
	        }
	    }
	    return false;
	}
	 public  boolean deleteCustomerById(String id) {
		    for (int i = 0; i < registeredUsers.size(); i++) {
		        if (registeredUsers.get(i).getId() == id) {
		        	registeredUsers.remove(i);
		            return true;
		        }
		    }
		    return false;
		}
	 public  void listCustomers() {
		    for (Customer customer : registeredUsers) {
		        System.out.println("Name: " + customer.getName());
		        System.out.println("Phone: " + customer.getPhone());
		        System.out.println("Address: " + customer.getAddress());
		        System.out.println("---------------------------");
		    }
		}
	 public boolean updateProductByName(String name,  int price,  String material) {
		    for (Product product : products) {
		        if (product.getName() == name) {
		            product.setPrice(price);
		            product.setMaterial(material);
		            return true;
		        }
		    }
		    return false;
		}
	 public  boolean deleteProductByName(String name) {
		    for (int i = 0; i < products.size(); i++) {
		        if (products.get(i).getName() == name) {
		            products.remove(i);
		            return true;
		        }
		    }
		    return false;
		}
	 public  void listProducts() {
		    for (Product product : products) {
		        System.out.println("Name: " + product.getName());
		        System.out.println("Price " + product.getPrice());
		        System.out.println("Material " + product.getMaterial());
		        System.out.println("---------------------------");
		    }
		}
	public boolean isContained(String string,Integer integer,Integer integer1,String string1) {
		boolean found =false;
		for (int i=0;i<products.size();i++) {
			if(products.get(i).Name.equals(string)&&products.get(i).Material.equals(string1)&&products.get(i).Price==integer&&products.get(i).Size==integer1)
				found= true;
			else
				found=false;
		}
		return found;
	}

	
	
	
	
	
}
