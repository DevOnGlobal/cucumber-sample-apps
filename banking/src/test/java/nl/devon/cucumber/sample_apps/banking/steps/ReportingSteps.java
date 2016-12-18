package nl.devon.cucumber.sample_apps.banking.steps;

import cucumber.api.java.en.Then;
import nl.devon.cucumber.sample_apps.banking.domain.DomainModel;

public class ReportingSteps {

	private DomainModel model;

	public ReportingSteps(DomainModel model) {
		this.model = model;
	}

	@Then("^reporting information is generated$")
	public void reportingInformationIsGenerated() throws Throwable {
		model.addLog("reporting information generated");
		model.setStatus("reporting info");
	}
}
