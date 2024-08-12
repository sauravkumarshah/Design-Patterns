package com.tipsontech.factory;

import com.tipsontech.factory.logistics.Logistics;
import com.tipsontech.factory.logistics.RoadLogistics;
import com.tipsontech.factory.logistics.SeaLogistics;

public class FactoryClient {
    public static void main(String[] args) {
        Logistics roadLogistics = new RoadLogistics();
        roadLogistics.planDelivery();

        Logistics seaLogistics = new SeaLogistics();
        seaLogistics.planDelivery();
    }
}
