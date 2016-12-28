Feature: Simple banking scenario

	Scenario: Transfer money
	
	Given a creditor account
	And a debtor account
	When I transfer EUR 2.00
	Then the creditor account is credited with EUR 2.00
	And the debtor account is debited with EUR 2.00
	Then billing information is generated
	Then reporting information is generated
	Then the status is updated



	Scenario: Transfer money with delay

		Given a creditor account
		And a debtor account
		When I transfer EUR 2.00
		Then the creditor account is credited with EUR 2.00
		And the debtor account is debited with EUR 2.00
		Then after 2:00 hr billing information is generated (dv-checksum=ABCDEFGHIJKLMNOPQRSTUVWXYZ789012)

	# (dv-id=1) at Scenario to make scenario title unique in feature file
	# (dv-id=1) at Given to load TestExecutionContext from previous (sub) Scenario
	Scenario: Transfer money with delay (dv-id=1)
		Given Test Execution Context is loaded with dv-id=1
		Then billing information is generated
		Then reporting information is generated
		Then the status is updated