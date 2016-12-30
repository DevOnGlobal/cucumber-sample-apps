package nl.devon.cucumber.sample_apps.banking.domain;

import nl.devon.pickles.steps.DelayedVerification;
import nl.devon.pickles.steps.TestExecutionContext;

public class ExecutionContext implements TestExecutionContext {

	private DelayedVerification verification;

	public void set(DelayedVerification verification) {
		this.verification = verification;
	}

	public DelayedVerification get() {
		return verification;
	}
}
