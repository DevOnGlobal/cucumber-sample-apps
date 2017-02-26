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
		Then after 2:00 hr billing information is generated (dvChecksum=2868952975241737215720939363873128833439714268696194750262056888, dvId=2, dvFeatureUri=features/SimpleBankingScenario.feature)

	Scenario: Transfer money with delay (dvId=1)
		Given Test Execution Context is loaded for dvId=1
		Then billing information is generated
		Then reporting information is generated
		Then the status is updated