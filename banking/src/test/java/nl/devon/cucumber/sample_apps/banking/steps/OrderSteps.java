package nl.devon.cucumber.sample_apps.banking.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OrderSteps {

	@When("^I transfer EUR (\\d+)\\.(\\d+)$")
	public void iTransferEUR(int arg1, int arg2) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^the status is updated$")
	public void theStatusIsUpdated() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}
}
