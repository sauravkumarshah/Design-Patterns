package com.tipsontech.ecommerce.gateways;

public class PayPalProcessor implements PaymentProcessor{

	@Override
	public void processPayment(double amount) {
		System.out.println("Processing payment of $" + amount + " via PayPal.");
	}

}
