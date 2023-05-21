package cleaningCarpet;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
		Admin admin = new Admin();
		while(true) {
			System.out.print("Please Enter your Password "+"\n");
			Scanner choice = new Scanner(System.in);
			String pass;
			pass=choice.next();
			Statistics stat = new Statistics();
			if(admin.login(pass)) {
				inter:while(true) {
					System.out.print("Please choose a task by entering the number of it"+"\n");
					System.out.print("1- Add Customer "+"\n");
		 	        System.out.print("2- Orders "+"\n");
		 	        System.out.print("3- Reports "+"\n");
		 	        System.out.print("4- Statistics "+"\n");
		 	        System.out.print("5- logout "+"\n");
		 	       int aa;
		 	        aa=choice.nextInt();
		 	       switch(aa) {
		 	       case 1:
		 	    	  System.out.print("please enter the Cutomer ID, name, phone, address respectively and seperated by space:\n");
		 	        	try {
		 	        	String s=obj.readLine();
		 	        	String ss[]=s.split(" ");
		 	        	Customer customer= new Customer(ss[0],ss[1],ss[2],ss[3]);
		 	        	System.out.print("how many products you want to order? Please enter a number "+"\n");
		 	        	int p=choice.nextInt();
		 	        	ArrayList<Product> products= new ArrayList();
		 	        	for(int i=0;i<p;i++){
		 	        	System.out.println("PLease enter the product name, price, size, material respectively and seperated by space");
	                    String sss=obj.readLine();
	                    String r[]=sss.split(" ");
		 	        	Product prod = new Product(r[0], Integer.parseInt(r[1]), Integer.parseInt(r[2]),r[3]);
		 	        	Sys op = new Sys();
		 	        	op.add(admin, prod);
		 	        	products.add(prod);
		 	        	}
		 	        	System.out.print("Enter 1 if you want to generate an invoice "+"\n");
		 	        	int in = choice.nextInt();
		 	        	if(in==1) {
		 	        		Order order=new Order(customer,products);
		 	        		stat.addOrder(order);
		 	        		Invoice invoice = new Invoice(customer, products,ss[3],order);
		 	        		invoice.printInvoice();
		 	        	}
		 	         }catch(Exception e) {
		 	        	 e.printStackTrace();
		 	         }
		 	        	break;
		 	       case 2:
		 	    	   
		 	    	    break;
		 	       case 3:
		 	    	    break;
		 	       case 4:
		 	    	  System.out.print("Total Delivered Items:"+stat.getTotalDeliveredItems()+"\n");
		 	    	  System.out.print("Total Cash:"+stat.getTotalCash()+"\n");
		 	    	  System.out.print("Total Paid:"+stat.getTotalPaid()+"\n");
		 	    	  System.out.print("Total Debts:"+stat.getTotalDebts()+"\n");
		 	    	   break;
		 	       case 5:
		 	    	  java.lang.System.exit(0);
		 	       }
				}
			}
		}

	}
}
