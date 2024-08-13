package com.tipsontech.ecommerce.adapters;

import com.tipsontech.ecommerce.gateways.AdvancePay;
import com.tipsontech.ecommerce.gateways.PaymentProcessor;

public class AdvancePayAdapter implements PaymentProcessor{
	
	private AdvancePay advancePay;

	public AdvancePayAdapter(AdvancePay advancePay) {
		this.advancePay = advancePay;
	}

	@Override
	public void processPayment(double amount) {
		advancePay.executePayment(amount, "USD");
	}
	
}
