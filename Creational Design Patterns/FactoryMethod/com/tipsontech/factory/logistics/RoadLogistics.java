package com.tipsontech.factory.logistics;

import com.tipsontech.factory.transport.Transport;
import com.tipsontech.factory.transport.Truck;

public class RoadLogistics extends Logistics {
    @Override
    public Transport createTransport() {
        return new Truck();
    }
}
