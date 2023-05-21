package cleaningCarpet;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class register_steps {
	
	public Admin admin;
	public Customer customer;
	public Sys system;
	
	String s;
	int before;
	int after;
	
	public register_steps(Admin a,Sys s) {
		
		admin = a;
		system=s;
	}
	
	@Given("these usere are registered in the system")
	public void theseUsereAreRegisteredInTheSystem(io.cucumber.datatable.DataTable dataTable) {
	    String id,name,phone,address;
	    
	    for(int i=0;i<3;i++) {
	    	id=dataTable.cell(i,0);
			name=dataTable.cell(i,1);
			phone=dataTable.cell(i,2);
			address=dataTable.cell(i,3);
			
			customer=new Customer(id,name,phone,address);
			system.registeredUsers.add(customer);
	    }
	    before=system.registeredUsers.size();
	}
	
	@Given("there is a user with ID {string} , name {string} , phone {string} , address {string}")
	public void thereIsAUserWithIDNamePhoneAddress(String id, String name, String phone, String address) {
		customer=new Customer(id,name,phone,address);
	}
	
	@When("admin tries to register a user")
	public void adminTriesToRegisterAUser() {
	    s=admin.register(customer, system);
	    after=system.registeredUsers.size();
	}
	
	@Then("an error massage {string} should display")
	public void anErrorMassageShouldDisplay(String string) {
		assertEquals(string,s);
	    assertEquals(before, after);
	}
	
	
	@Then("an information message {string} should displayed")
	public void anInformationMessageShouldDisplayed(String string) {
		assertEquals(string,s);
	    assertEquals(before+1, after);
	}


}
