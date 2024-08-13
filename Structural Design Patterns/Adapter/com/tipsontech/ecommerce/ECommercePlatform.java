package com.tipsontech.ecommerce;

import com.tipsontech.ecommerce.adapters.AdvancePayAdapter;
import com.tipsontech.ecommerce.gateways.AdvancePay;
import com.tipsontech.ecommerce.gateways.PayPalProcessor;
import com.tipsontech.ecommerce.gateways.PaymentProcessor;
import com.tipsontech.ecommerce.gateways.StripeProcessor;

public class ECommercePlatform {
	
	public static void main(String[] args) {
		
		PaymentProcessor payPal = new PayPalProcessor();
		PaymentProcessor stripe = new StripeProcessor();
		
		PaymentProcessor advancedPay = new AdvancePayAdapter(new AdvancePay());
		
		processOrder(payPal, 100.0);
		processOrder(stripe, 200.0);
		processOrder(advancedPay, 300.0);
			
	}
	
	public static void processOrder(PaymentProcessor processor, double amount) {
		processor.processPayment(amount);
	}
	
}
