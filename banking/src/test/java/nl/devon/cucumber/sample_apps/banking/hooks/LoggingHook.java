package nl.devon.cucumber.sample_apps.banking.hooks;

import cucumber.api.java.After;
import nl.devon.cucumber.sample_apps.banking.domain.DomainModel;

public class LoggingHook {

	private DomainModel model;

	public LoggingHook(DomainModel model) {
		this.model = model;
	}

	@After
	public void printLogEntries() {
		System.out.println("");
		for (String entry : model.getLogEntries()) {
			System.out.println(entry);
		}
		System.out.println();
		System.out.println("creditor:\t" + model.getCreditor());
		System.out.println("debtor:\t\t" + model.getDebtor());
		System.out.println("status:\t\t" + model.getStatus());
		System.out.println();
	}
}
