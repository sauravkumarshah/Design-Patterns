package com.tipsontech.example.logistics;

import com.tipsontech.example.transport.Ship;
import com.tipsontech.example.transport.Transport;

public class SeaLogistics extends Logistics{

	@Override
	public Transport createTransport() {
		return new Ship();
	}

}
