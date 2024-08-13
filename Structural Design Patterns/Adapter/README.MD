# Adapter Design Pattern

## Overview

The Adapter design pattern is a structural design pattern that allows objects with incompatible interfaces to collaborate. This pattern works by creating an adapter that acts as a bridge between the objects, converting the interface of one object into another that the client expects.

This example demonstrates the Adapter design pattern in the context of an e-commerce platform that integrates multiple payment gateways with different interfaces.

## Problem Statement

Imagine an e-commerce platform that needs to support multiple payment gateways such as PayPal and Stripe. These gateways have different interfaces, and the platform requires a unified interface to interact with all payment processors. Additionally, the platform wants to integrate a new third-party payment gateway, `AdvancedPay`, which has its own unique interface that is not compatible with the existing system.

## Solution

To solve this problem, we can use the Adapter design pattern. The `AdvancedPayAdapter` class acts as a bridge between the `AdvancedPay` third-party gateway and the existing `PaymentProcessor` interface, allowing the platform to interact with `AdvancedPay` as if it were a native payment processor.

### Explanation of the Folder Structure

- **`adapters/AdvancedPayAdapter.java`**: Contains the adapter class that adapts the `AdvancedPay` gateway to the `PaymentProcessor` interface.

- **`gateways/`**: Contains all the payment processor-related classes:
  - `PaymentProcessor.java`: The common interface for all payment processors.
  - `PayPalProcessor.java`: Implementation of the `PaymentProcessor` interface for PayPal.
  - `StripeProcessor.java`: Implementation of the `PaymentProcessor` interface for Stripe.
  - `AdvancedPay.java`: The third-party payment gateway with its own unique interface.

- **`platform/ECommercePlatform.java`**: Contains the main class that simulates the e-commerce platform's payment processing.

# Conclusion
The Adapter pattern is a powerful tool when you need to integrate classes with incompatible interfaces. In this example, the AdvancedPayAdapter enables the AdvancedPay third-party payment gateway to work seamlessly with the existing payment processing system. This approach enhances the flexibility and maintainability of the system, allowing new integrations without major code changes.
