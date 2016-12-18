package nl.devon.cucumber.sample_apps.banking.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class AccountSteps {

	@Given("^a creditor account$")
	public void aCreditorAccount() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Given("^a debtor account$")
	public void aDebtorAccount() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^the creditor account is credited with EUR (\\d+)\\.(\\d+)$")
	public void theCreditorAccountIsCreditedWithEUR(int arg1, int arg2) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^the debtor account is debited with EUR (\\d+)\\.(\\d+)$")
	public void theDebtorAccountIsDebitedWithEUR(int arg1, int arg2) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}
}
