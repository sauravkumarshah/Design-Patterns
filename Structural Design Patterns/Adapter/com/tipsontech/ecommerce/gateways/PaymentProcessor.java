package com.tipsontech.ecommerce.gateways;

public interface PaymentProcessor {
	void processPayment(double amount);
}
