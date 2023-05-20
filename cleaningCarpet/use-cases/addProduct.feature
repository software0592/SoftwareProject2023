Feature: Add product to a system
	Actors: Admin

Scenario: Add a product successfully
 	Given that the administrator is logged in
 	And there is a product with name "carpet", price 200, size 120, and material "coton"
 	When the product is added to the system
 	Then the product with name "carpet", price 200, size 120, and material "coton" is contained in the system
 	
Scenario: Add a product when the adminstrator is not logged in
	Given that the administrator is not logged in
 	And there is a product with name "cover", price 50, size 30, and material "polister"
	When the product is added to the system
	Then the error message "Administrator login required" is given