package io.pickles.sample_apps.banking.hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.pickles.jdbc.JdbcDelayedVerificationStore;
import io.pickles.sample_apps.banking.domain.DomainModel;
import io.pickles.sample_apps.banking.domain.ExecutionContext;
import io.pickles.steps.DelayedVerificationSteps;
import io.pickles.steps.DelayedVerificationStore;
import io.pickles.steps.TestExecutionContext;

public class LoggingHook {

	private DomainModel model;
	private TestExecutionContext executionContext;
	private DelayedVerificationSteps steps;
	private DelayedVerificationStore delayedVerificationStore;

	public LoggingHook(DomainModel model, ExecutionContext executionContext, DelayedVerificationSteps steps,
			JdbcDelayedVerificationStore store) {
		this.model = model;
		this.executionContext = executionContext;
		this.steps = steps;
		delayedVerificationStore = store;
	}

	@Before
	public void injectModelInFramework() {
		steps.setPersistableTestData(model);
		steps.setTestExecutionContext(executionContext);
		steps.setDelayedVerificationStore(delayedVerificationStore);
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
