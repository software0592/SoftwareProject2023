package cleaningCarpet;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class login_steps {
	
	public Admin admin;
	public String pass;
	
	public login_steps(Admin a){
		admin=a;
	}
	
	@Given("that the admin is not logged in")
	public void thatTheAdminIsNotLoggedIn() {
		admin.setLogState(false);
	}
	
	@Given("the password is {string}")
	public void thePasswordIs(String string) {
		pass=string;
	}
	
	@Then("the admin login succeeds")
	public void theAdminLoginSucceeds() {
		assertTrue(admin.login(pass));
	}
	
	@Then("the admin is logged in")
	public void theAdminIsLoggedIn() {
		assertTrue(admin.getLogState()); 
	}
	
	@Then("the admin login fails")
	public void theAdminLoginFails() {
		assertFalse(admin.login(pass));
	    
	}
	
	@Then("the admin is not logged in")
	public void theAdminIsNotLoggedIn() {
		assertFalse(admin.getLogState());
	}


}
