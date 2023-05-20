package cleaningCarpet;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Scanner;
public class Main {
	final static String username = System.getenv("JAVAMAIL_USER");
    final static String password = System.getenv("JAVAMAIL_PASS");
	public static void main(String[] args) throws IOException {
		BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
		Admin admin = new Admin();
		while(true) {
			System.out.print("Please Enter your Password "+"\n");
			Scanner choice = new Scanner(System.in);
			String pass;
			pass=choice.next();
			Statistics stat = new Statistics();
			Sys op = new Sys();
			if(admin.login(pass)) {
				inter:while(true) {
					System.out.print("Please choose a task by entering the number of it"+"\n");
					System.out.print("1- Add Customer "+"\n");
		 	        System.out.print("2- Orders "+"\n");
		 	        System.out.print("3- Reports "+"\n");
		 	        System.out.print("4- Statistics "+"\n");
		 	        System.out.print("5- CRUD "+"\n");
		 	        System.out.print("6- Logout "+"\n");

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
		 	    	  System.out.print("If you want to change the status of an order, enter the Customer ID to inform him that his order is complete!"+"\n");
		 	    	 Email.send( "zainabubaker2002@gmail.com","akurdi202@gmail.com");
		 	    	  
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
		 	    	System.out.print("Enter the CRUD operation number you want to perform "+"\n");
					System.out.print("1- Delete Customer "+"\n");
		 	        System.out.print("2- Update Customer "+"\n");
		 	        System.out.print("3- List Customers "+"\n");
		 	        System.out.print("4- Delete Product "+"\n");
		 	        System.out.print("5- Update Product "+"\n");
		 	        System.out.print("6- List Products"+"\n");
		 	        int c=choice.nextInt();
		 	        if(c==1) {
		 	        	System.out.print("Enter the ID of the customer you want to delete "+"\n");
		 	        	int d=choice.nextInt();
		 	        	op.deleteCustomerById(Integer.toString(d));
		 	        	System.out.print("Deleted! "+"\n");
		 	        }
		 	        else if(c==2) {
		 	        	System.out.print("Enter the ID of the Customer you want to update on, new name, phone and address respectively and seperated by space "+"\n");
		 	        	String m=obj.readLine();
	                    String r[]=m.split(" ");
	                    op.updateCustomerById(r[0], r[1], r[2],r[3]);
	                    System.out.print("Updated! "+"\n");
		 	        }
		 	        else if(c==3) {
		 	        	op.listCustomers();
		 	        }
		 	        else if(c==4) {
		 	        	System.out.print("Enter the name of the product you want to delete "+"\n");
		 	        	String pr=obj.readLine();
		 	        	op.deleteProductByName(pr);	
		 	        	System.out.print("Deleted! "+"\n");
		 	        }
		 	        else if(c==5) {
		 	        	System.out.print("Enter the name of the Product you want to update on, new price and material respectively and seperated by space "+"\n");
		 	        	String m=obj.readLine();
	                    String r[]=m.split(" ");
	                    op.updateProductByName(r[0], Integer.parseInt(r[1]), r[2]);
	                    System.out.print("Updated! "+"\n");
		 	        }
		 	        else if(c==6) {
		 	        	op.listProducts();
		 	        }
		 	    	   break;
		 	       case 6:
		 	    	  java.lang.System.exit(0);
		 	       }
				}
			}
		}

	}

}
