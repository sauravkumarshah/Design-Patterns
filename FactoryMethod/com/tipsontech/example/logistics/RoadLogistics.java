package com.tipsontech.example.logistics;

import com.tipsontech.example.transport.Transport;
import com.tipsontech.example.transport.Truck;

public class RoadLogistics extends Logistics {
    @Override
    public Transport createTransport() {
        return new Truck();
    }
}
