package com.tipsontech.example.logistics;

import com.tipsontech.example.transport.Transport;

public abstract class Logistics {
	
	// Factory method
	public abstract Transport createTransport();
	
	public void planDelivery() {
		// Use the factory method to get the transport object
		Transport transport =  createTransport();
		
		// Call the deliver method of the transport object
		transport.deliver();
	}
}
