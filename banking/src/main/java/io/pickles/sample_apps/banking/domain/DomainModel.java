package io.pickles.sample_apps.banking.domain;

import java.util.ArrayList;
import java.util.List;

import io.pickles.steps.DelayedVerification;
import io.pickles.steps.PersistableTestData;

public class DomainModel implements PersistableTestData {

	private String creditor;
	private String debtor;
	private String amount;
	private String status;
	private List<String> logEntries = new ArrayList<String>();

	public String getCreditor() {
		return creditor;
	}

	public void setCreditor(String creditor) {
		this.creditor = creditor;
	}

	public String getDebtor() {
		return debtor;
	}

	public void setDebtor(String debtor) {
		this.debtor = debtor;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<String> getLogEntries() {
		return logEntries;
	}

	public void addLog(String entry) {
		logEntries.add(entry);
	}

	public void save(DelayedVerification delayedVerification) {
		// TODO Auto-generated method stub

	}

	public void load(DelayedVerification delayedVerification) {
		// TODO Auto-generated method stub

	}
}
