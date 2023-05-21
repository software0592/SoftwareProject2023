package cleaningCarpet;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class addProduct_steps {
	
	public Admin admin;
	public Product product;
	public Sys system;
	
	public addProduct_steps(Admin a,Sys s) {
		admin=a;
		system=s;
	}
	
	@Given("that the administrator is logged in")
	public void thatTheAdministratorIsLoggedIn() {
	    admin.setLogState(true);
	}
	
	@Given("there is a product with name {string}, price {int}, size {int}, and material {string}")
	public void thereIsAProductWithNamePriceSizeAndMaterial(String name, Integer price, Integer size, String material) {
	    product=new Product(name,price,size,material);
	}
	
	@When("the product is added to the system")
	public void theProductIsAddedToTheSystem() {
	    system.add(admin, product);
	}
	
	@Then("the product with name {string}, price {int}, size {int}, and material {string} is contained in the system")
	public void theProductWithNamePriceSizeAndMaterialIsContainedInTheSystem(String string, Integer int1, Integer int2, String string2) {
	    assertTrue(system.products.size()==1);
	    assertTrue(system.isContained(string, int1, int2, string2));
	}
	
	@Given("that the administrator is not logged in")
	public void thatTheAdministratorIsNotLoggedIn() {
		admin.setLogState(false);
	}
	
	@Then("the error message {string} is given")
	public void theErrorMessageIsGiven(String string) {
	    assertTrue(system.products.size()==0);
	    assertEquals(string, "Administrator login required");
	}

}
