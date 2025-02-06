# Composite Design Pattern

## Overview

The Composite Design Pattern is a structural design pattern that lets you compose objects into tree structures to represent part-whole hierarchies. It allows clients to treat individual objects and compositions of objects uniformly.

## Intent

- Treat both individual objects and composite objects the same way.

- Build a tree-like structure where operations can be performed recursively.

- Reduce complexity by making the client interact with a single interface.

## Problem

Using the Composite pattern makes sense when an application's core model can be represented as a tree.

Imagine an e-commerce system that deals with two types of objects:

1. Products: Individual items with a fixed price.

2. Boxes: Containers that can hold multiple Products or even smaller Boxes.

Now, if you need to calculate the total price of an order containing multiple products and nested boxes, a direct approach would be cumbersome. You would have to iterate through different object types, track nesting levels, and handle various conditions manually. This complexity increases as the hierarchy deepens.

## Solution

The Composite pattern simplifies the problem by introducing a common interface (Item.java) for both Products and Boxes.

- Each Product returns its price directly.

- Each Box recursively sums up the prices of its contents (which can be either Products or other Boxes).

- This allows the client to work with a uniform interface without worrying about whether an object is a Product or a Box.


## Use Case Example: Products & Boxes in an E-Commerce System

In this example, we create an ordering system where:

- Products have a fixed price.

- Boxes can contain multiple Products or smaller Boxes.

- The total price of a Box is calculated by adding up the prices of all its contents.

## Class Diagram

```dtd
                [Item] (Interface)
                   |
     ---------------------------
     |                          |
 [Product]                  [Box]
                                  |
                        -----------------
                        |               |
                  [Product]         [Box]
```
## Implementation

1. `Component Interface (Item.java)` : Defines a common interface for both Products and Boxes.
2. `Leaf Class (Product.java)` : Represents individual products with a fixed price.
3. `Composite Class (Box.java)` : Represents a container that can hold multiple Products or smaller Boxes
4. `Client Code` : Creates instances of Products and Boxes, and uses the Item interface to interact with them.

## Key Takeaways

- `Uniformity` : The client can handle both Product and Box through the common Item interface.
- `Recursive Composition` : A Box can contain both Product and other Boxes.
- `Scalability` : Easily extendable to add discounts, taxes, and shipping costs.
- `Decoupling` : The client doesn’t need to know whether an object is a Product or a Box.

## When to Use Composite Pattern?

`✅` Use when dealing with hierarchical structures (e.g., file systems, UI components, organizations, military structures).

`✅` When client code needs to work uniformly with both simple and complex elements.

`✅` When operations on individual objects and compositions of objects should be the same.

## Real-World Analogy

- `File System` : Files & Folders, where a folder can contain files and other folders.

- `Military Organization` : A general gives orders to divisions, brigades, squads, which are further broken down into individual soldiers.

- `Company Hierarchy` : CEO → Department → Teams → Employees.

## Conclusion

The Composite Design Pattern provides a way to compose objects into tree structures and handle them uniformly, making the client code more flexible and easier to maintain.

The Composite Design Pattern is a powerful structural pattern that simplifies working with hierarchical structures. It enables uniform treatment of both individual objects and composite structures through a common interface, making it an excellent choice for applications dealing with nested compositions like file systems, UI components, and organization structures.

By following this pattern:

- Clients do not need to worry about whether they are working with a single object or a complex structure.
- Recursive operations allow for flexible and scalable designs.
- It promotes loose coupling, making the system easier to extend and maintain.
This pattern is ideal for scenarios where tree-like structures are present and operations need to be applied uniformly across both leaves and composite nodes.