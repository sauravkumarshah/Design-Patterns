# Factory Method Pattern

The Factory Method pattern suggests replacing direct object construction calls (using the `new` operator) with calls to a special factory method. Don’t worry: the objects are still created via the `new` operator, but it’s called from within the factory method. Objects returned by a factory method are often referred to as products.

## Key Concepts

### Customizable Creation
Subclasses can alter the class of objects being returned by the factory method. At first glance, this change may look pointless: we just moved the constructor call from one part of the program to another. However, consider this: now you can override the factory method in a subclass and change the class of products being created by the method. There’s a slight limitation though: subclasses may return different types of products only if these products have a common base class or interface. Also, the factory method in the base class should have its return type declared as this interface.

### Common Interface for Products
All products must follow the same interface. For example, both `Truck` and `Ship` classes should implement the `Transport` interface, which declares a method called `deliver`.

Each class implements this method differently: trucks deliver cargo by land, ships deliver cargo by sea.

The factory method in the `RoadLogistics` class returns truck objects, whereas the factory method in the `SeaLogistics` class returns ships. As long as all product classes implement a common interface, you can pass their objects to the client code without breaking it. 

### Client Code Independence
The code that uses the factory method (often called the client code) doesn’t see a difference between the actual products returned by various subclasses. The client treats all the products as abstract `Transport`. The client knows that all transport objects are supposed to have the `deliver` method, but exactly how it works isn’t important to the client.

## Structure

### Product Interface
The `Product` declares the interface, which is common to all objects that can be produced by the creator and its subclasses.

### Concrete Products
Concrete Products are different implementations of the product interface.

### Creator Class
The `Creator` class declares the factory method that returns new product objects. It’s important that the return type of this method matches the product interface. You can declare the factory method as abstract to force all subclasses to implement their own versions of the method. As an alternative, the base factory method can return some default product type.

Note, despite its name, product creation is not the primary responsibility of the creator. Usually, the creator class already has some core business logic related to products. The factory method helps to decouple this logic from the concrete product classes.

Here is an analogy: a large software development company can have a training department for programmers. However, the primary function of the company as a whole is still writing code, not producing programmers.

### Concrete Creators
Concrete Creators override the base factory method so it returns a different type of product.

Note that the factory method doesn’t have to create new instances all the time. It can also return existing objects from a cache, an object pool, or another source.

## Explanation

1. **Transport Interface**: Declares the `deliver` method which will be implemented by all concrete products.
2. **Concrete Products (Truck and Ship)**: Implement the `Transport` interface and provide their own implementations of the `deliver` method.
3. **Creator (Logistics)**: Declares the factory method `createTransport`. This method is abstract and must be implemented by subclasses. The `planDelivery` method uses the factory method to get a `Transport` object and then calls its `deliver` method.
4. **Concrete Creators (RoadLogistics and SeaLogistics)**: Implement the factory method to return instances of `Truck` and `Ship` respectively.
5. **Client Code**: Demonstrates how to use the `Logistics` class and its subclasses to plan deliveries. The client code is not concerned with the specific type of `Transport` being used.

By using this pattern, you can easily extend the system to handle new types of transport without modifying the existing client code.
