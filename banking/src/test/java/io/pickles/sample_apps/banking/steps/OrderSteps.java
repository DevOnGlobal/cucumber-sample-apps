package io.pickles.sample_apps.banking.steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.pickles.sample_apps.banking.domain.DomainModel;

public class OrderSteps {

	private DomainModel model;

	public OrderSteps(DomainModel model) {
		this.model = model;
	}

	@When("^I transfer (.*)$")
	public void iTransferEUR(String amount) {
		model.setAmount(amount);
		model.setStatus("initiated");
		model.addLog("amount transfer of " + amount + " is initiated");
	}

	@Then("^the status is updated$")
	public void theStatusIsUpdated() {
		model.setStatus("completed");
	}
}
