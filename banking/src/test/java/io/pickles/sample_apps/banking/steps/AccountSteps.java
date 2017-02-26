package io.pickles.sample_apps.banking.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.pickles.sample_apps.banking.domain.DomainModel;

public class AccountSteps {

	private DomainModel model;

	public AccountSteps(DomainModel model) {
		this.model = model;
	}

	@Given("^a creditor account$")
	public void aCreditorAccount() throws Throwable {
		model.setCreditor("creditor account");
		model.addLog("creditor account is available");
	}

	@Given("^a debtor account$")
	public void aDebtorAccount() throws Throwable {
		model.setDebtor("debtor account");
		model.addLog("debtor account is available");
	}

	@Then("^the creditor account is credited with EUR (\\d+)\\.(\\d+)$")
	public void theCreditorAccountIsCreditedWithEUR(int arg1, int arg2) throws Throwable {
		model.addLog("creditor account is credited with " + model.getAmount());
	}

	@Then("^the debtor account is debited with EUR (\\d+)\\.(\\d+)$")
	public void theDebtorAccountIsDebitedWithEUR(int arg1, int arg2) throws Throwable {
		model.addLog("debtor account is debited with " + model.getAmount());
	}
}
