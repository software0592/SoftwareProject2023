package cleaningCarpet;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class logOut_steps {
	
	public Admin admin;
	public logOut_steps(Admin ad) {
		admin=ad;
	}
	
	@Given("that the admin is logged in")
	public void thatTheAdminIsLoggedIn() {
		admin.setLogState(true);
	}
	@When("the admin logs out")
	public void theAdminLogsOut() {
		admin.logout();
	}

}
