package cleaningCarpet;

import cleaningCarpet.Order.OrderStatus;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Notify_steps {
	
	Customer customer;
	Order order;
	Email email;
	
	public Notify_steps() {
		customer = new Customer();
		order= new Order();
		email = new Email();
	}
	
	@Given("there is a customer has  a completed order")
	public void thereIsACustomerHasACompletedOrder() {
	    customer = new Customer();
	    order.setStatus(OrderStatus.COMPLETE);
	}
	
	@When("the admin sends a reminder email")
	public void theAdminSendsAReminderEmail() {
	    email.sendEmail(null, null);
	}
	
	@Then("then the customer should receive an email with subject {string} and body {string}")
	public void thenTheCustomerShouldReceiveAnEmailWithSubjectAndBody(String string, String string2) {
	    email = new Email(string,string2);
	}

}
