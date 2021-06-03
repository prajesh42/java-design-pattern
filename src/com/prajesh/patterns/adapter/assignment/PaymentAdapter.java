package com.prajesh.patterns.adapter.assignment;

public class PaymentAdapter {

	public String pay(double rupees) {
		PaymentProcessor paymentProcessor=new PaymentProcessorImpl();
		return paymentProcessor.pay(rupees/70);
	}
}
