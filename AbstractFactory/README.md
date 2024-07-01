# Abstract Factory Design Pattern

The Abstract Factory pattern provides an interface for creating families of related or dependent objects without specifying their concrete classes.

## Overview

The Abstract Factory pattern suggests explicitly declaring interfaces for each distinct product of the product family (e.g., `Chair`, `Sofa`, `CoffeeTable`). All variants of products follow those interfaces. For example, all chair variants can implement the `Chair` interface; all coffee table variants can implement the `CoffeeTable` interface, and so on.

## Structure

### Product Interfaces
The interfaces for the distinct products ensure that all product variants follow the same protocol.

- **Chair Interface**: Declares the `sitOn` method.
- **Sofa Interface**: Declares the `lieOn` method.
- **CoffeeTable Interface**: Declares the `placeItemsOn` method.

### Concrete Products
The concrete product classes implement the product interfaces:

- **VictorianChair**, **ModernChair**, **ArtDecoChair**: Implement the `Chair` interface.
- **VictorianSofa**, **ModernSofa**, **ArtDecoSofa**: Implement the `Sofa` interface.
- **VictorianCoffeeTable**, **ModernCoffeeTable**, **ArtDecoCoffeeTable**: Implement the `CoffeeTable` interface.

### Abstract Factory
The abstract factory interface declares methods for creating each of the abstract products:

- **FurnitureFactory**: Declares methods `createChair`, `createSofa`, and `createCoffeeTable`.

### Concrete Factories
Concrete factories implement the creation methods of the abstract factory. Each factory corresponds to a specific variant of products:

- **VictorianFurnitureFactory**: Creates Victorian-style furniture.
- **ModernFurnitureFactory**: Creates modern-style furniture.
- **ArtDecoFurnitureFactory**: Creates Art Deco-style furniture.

### Client Code
The client code interacts with both factories and products via their respective abstract interfaces. This allows the client to work with any factory/product variant without being coupled to specific implementations.

## Folder Structure

