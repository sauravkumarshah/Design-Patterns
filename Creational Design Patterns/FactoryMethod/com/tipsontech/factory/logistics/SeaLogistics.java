package com.tipsontech.factory.logistics;

import com.tipsontech.factory.transport.Ship;
import com.tipsontech.factory.transport.Transport;

public class SeaLogistics extends Logistics{

	@Override
	public Transport createTransport() {
		return new Ship();
	}

}
