package com.prajesh.patterns.adapter.assignment;

public class PaymentApp {

	public void pay(double rupees) {
		PaymentAdapter pa=new PaymentAdapter();
		System.out.println(pa.pay(rupees));
	}
	
	public static void main(String[] args) {
		PaymentApp paymentApp=new PaymentApp();
		paymentApp.pay(500);
	}
}
