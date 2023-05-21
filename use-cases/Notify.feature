Feature: Notify Customer

Scenario: Send reminder email
	Given that the admin is logged in
	And there is a customer has  a completed order 
	When the admin sends a reminder email
	Then then the customer should receive an email with subject "order" and body "Your order is complete"