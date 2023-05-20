package cleaningCarpet;

import javax.swing.JOptionPane;

public class Admin {
	
	boolean logState;
	String password;
	
	public Admin() {
		password="adminadmin";
		logState=false;
	}
	
    public void setLogState(boolean b) {
   		
   		logState=b;
   	}
    
    public boolean login(String pass) {
		
		if(logState) {
			System.out.println("you are already logged in");
			return false;
		}
		else {
			if(this.password.equals(pass)) {
				System.out.println("successfull log in");
				logState=true;
				return true;
		
			}
			else {
				System.out.println("wrong password");
				return false;
			}
		}
	}
    
    public boolean getLogState() {
		if(logState) {
			
		}
		
		return logState;
	}
    
    public void logout() {
		
		if(logState ==false ) {
		
		}
		else {
			logState=false;
			

		}
		
	}
    
    public String register(Customer u,Sys l) {
		//myLibrary l =new myLibrary();
		if(logState==false) {
			
			JOptionPane.showInternalMessageDialog(null, "Admin login is required", "Error", JOptionPane.ERROR_MESSAGE);
			return "Admin login is required";
		}
		else {
			for(int i=0;i<l.registeredUsers.size();i++) {
				if(u.ID.equals(l.registeredUsers.get(i).ID)) {
					JOptionPane.showInternalMessageDialog(null, "user is alreay registered", "Error", JOptionPane.ERROR_MESSAGE);

					return "user is alreay registered";
				}
			}
			l.registeredUsers.add(u);
			JOptionPane.showInternalMessageDialog(null, "user registered succefully", "success", JOptionPane.INFORMATION_MESSAGE);

			return "user registered succefully";
		}
		
	}

   
}
