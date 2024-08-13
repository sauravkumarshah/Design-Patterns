package com.tipsontech.ecommerce.gateways;

public class AdvancePay {
	
	public void executePayment(double value, String currency) {
		System.out.println("Payment of " + currency + " " + value + " executed via AdvancePay.");
	}
}
