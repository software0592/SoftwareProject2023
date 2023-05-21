Feature: Register user
Description:Only admin can register a user 

Background: The system has registered users
	Given that the admin is logged in 
	And these usere are registered in the system 
		| 1234567 | ahmad | 0594650868 |jenin|
		| 1478523 | zain | 0599112233 |nablus|
		| 1236547 | yahya | 0599123456 |tulkarem|
		
	And the admin logs out 

Scenario: Admin is not logged in
Given that the admin is not logged in
And there is a user with ID "2984754" , name "Ahmad" , phone "0592335160" , address "Nablus"
When admin tries to register a user
Then an error massage "Admin login is required" should display

Scenario: user is already registered
Given that the admin is logged in
And there is a user with ID "1234567" , name "ahmad" , phone "0594650868" , address "jenin"
When admin tries to register a user 
Then an error massage "user is alreay registered" should display

Scenario: user not registered before
Given that the admin is logged in
And there is a user with ID "2984754" , name "Ahmad" , phone "0599730797" , address "Nablus"
When admin tries to register a user
Then an information message "user registered succefully" should displayed