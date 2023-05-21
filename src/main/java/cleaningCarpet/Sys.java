package cleaningCarpet;

import java.util.ArrayList;

public class Sys {
	
	public  ArrayList<Customer>registeredUsers =new ArrayList<Customer>();
	public ArrayList<Product> products =new ArrayList<Product>();
	
	public void add(Admin admin,Product product) {
		if( admin.getLogState()==false) {
			System.out.println("you can't add products");
		}
		else {
			products.add(product);
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
