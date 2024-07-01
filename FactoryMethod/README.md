### Explanation

1.  **Transport Interface**: Declares the deliver method which will be implemented by all concrete products.
    
2.  **Concrete Products (Truck and Ship)**: Implement the Transport interface and provide their own implementations of the deliver method.
    
3.  **Creator (Logistics)**: Declares the factory method createTransport. This method is abstract and must be implemented by subclasses. The planDelivery method uses the factory method to get a Transport object and then calls its deliver method.
    
4.  **Concrete Creators (RoadLogistics and SeaLogistics)**: Implement the factory method to return instances of Truck and Ship respectively.
    
5.  **Client Code**: Demonstrates how to use the Logistics class and its subclasses to plan deliveries. The client code is not concerned with the specific type of Transport being used.
    

By using this pattern, you can easily extend the system to handle new types of transport without modifying the existing client code.