package com.prajesh.patterns.adapter.assignment;

public class PaymentProcessorImpl implements PaymentProcessor {

	@Override
	public String pay(double dollars) {
		return String.format("You have paid %.4f dollars.",dollars);
	}

}
