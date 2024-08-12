# Builder Design Pattern

The Builder design pattern is a creational pattern that allows for the step-by-step construction of complex objects. It provides a way to create different types and representations of an object using the same construction code.

## Problem

When dealing with complex objects that require a step-by-step initialization of many fields and nested objects, the initialization code can become difficult to manage. This can lead to:

- **Monstrous Constructors:** Large constructors with many parameters that are difficult to understand and maintain.
- **Too Many Subclasses:** Creating subclasses for every possible configuration of an object, which can make the codebase overly complex.

### Example Scenario: House Construction

Imagine the process of building a `House` object. To create a simple house, you need to construct walls, a roof, a door, windows, and a floor. For a more elaborate house, you may also need to add features like a swimming pool, garage, and garden.

If you try to handle all possible configurations through subclassing or a single large constructor, you end up with code that is hard to maintain and extend.

## Solution

The Builder pattern suggests moving the object construction code into separate builder objects. This allows:

- **Step-by-Step Construction:** Builders construct objects step by step, where each step can be customized.
- **Flexible Object Creation:** Different builder implementations can create different representations of an object.
- **Simplified Client Code:** The client code can use the same builder interface to create different configurations of the product without needing to know the details of the construction process.

### How It Works

1. **Product (House Class):**
   - Represents the complex object that is to be built.
   - Contains fields like `walls`, `roof`, `windows`, etc.

2. **Builder (HouseBuilder Class):**
   - A nested static class within `House` that provides methods to build different parts of the `House`.
   - Implements a fluent interface, allowing method chaining.

3. **Director (HouseDirector Class):**
   - Directs the construction process using the builder.
   - Contains methods for creating different configurations, like `constructSimpleHouse` and `constructLuxuryHouse`.

4. **Client Code (BuilderPatternDemo Class):**
   - Demonstrates how to use the builder pattern to create different `House` objects.

## Example Usage

```java
House.HouseBuilder builder = new House.HouseBuilder();
HouseDirector director = new HouseDirector(builder);

House simpleHouse = director.constructSimpleHouse();
System.out.println("Simple House: " + simpleHouse);

House luxuryHouse = director.constructLuxuryHouse();
System.out.println("Luxury House: " + luxuryHouse);
