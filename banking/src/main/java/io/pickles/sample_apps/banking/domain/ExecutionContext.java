package io.pickles.sample_apps.banking.domain;

import org.joda.time.DateTime;

import io.pickles.steps.DelayedVerification;
import io.pickles.steps.TestExecutionContext;

public class ExecutionContext implements TestExecutionContext {

	private DelayedVerification verification;

	public void set(DelayedVerification verification) {
		this.verification = verification;
	}

	public DelayedVerification get() {
		return verification;
	}

	public DateTime firstBusinessDayOnOrAfter(DateTime reference) {
		return reference;
	}

	public DateTime verifyTimeFor(String eventName, DateTime startingFrom) {
		return DateTime.now().plusMinutes(15);
	}
}
