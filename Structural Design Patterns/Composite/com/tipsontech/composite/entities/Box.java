package com.tipsontech.composite.entities;

import java.util.ArrayList;
import java.util.List;

import com.tipsontech.composite.components.Item;

// Composite class: Box
public class Box implements Item {
    private List<Item> items = new ArrayList<>();
    private double packagingCost;

    public Box(double packagingCost) {
        this.packagingCost = packagingCost;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    @Override
    public double getPrice() {
        double totalPrice = packagingCost;
        for (Item item : items) {
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }

    @Override
    public String toString() {
        return "Box (Packaging Cost: $" + packagingCost + ") - Total: $" + getPrice();
    }
}

