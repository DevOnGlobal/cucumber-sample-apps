package io.pickles.sample_apps.banking.steps;

import cucumber.api.java.en.Then;
import io.pickles.sample_apps.banking.domain.DomainModel;

public class BillingSteps {

	private DomainModel model;

	public BillingSteps(DomainModel model) {
		this.model = model;
	}

	@Then("^billing information is generated$")
	public void billingInformationIsGenerated() throws Throwable {
		model.addLog("billing information generated");
		model.setStatus("billing info");
	}
}
