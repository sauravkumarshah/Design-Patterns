package com.tipsontech.example;

import com.tipsontech.example.logistics.Logistics;
import com.tipsontech.example.logistics.RoadLogistics;
import com.tipsontech.example.logistics.SeaLogistics;

public class FactoryClient {
    public static void main(String[] args) {
        Logistics roadLogistics = new RoadLogistics();
        roadLogistics.planDelivery();

        Logistics seaLogistics = new SeaLogistics();
        seaLogistics.planDelivery();
    }
}
