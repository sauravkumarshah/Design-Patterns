# Decorator Design Pattern

## 🏆 Intent
The **Decorator** pattern is a structural design pattern that lets you dynamically attach new behaviors to objects by placing them inside special wrapper objects (decorators) that modify their behavior.

## 📌 Problem Statement
Imagine you're developing a **notification system** for a software application. Initially, the system only supports **email notifications**. However, over time, users demand support for additional notification channels such as:
- **SMS Notifications**
- **Facebook Messages**
- **Slack Messages**

A simple approach would be to create multiple subclasses of the **Notifier** class, like `EmailNotifier`, `SMSNotifier`, `FacebookNotifier`, etc. However, if users want to receive multiple types of notifications (e.g., both Email and SMS), you would need to create **combinations of subclasses** like `EmailAndSMSNotifier`, `EmailAndFacebookNotifier`, etc.

This approach leads to a **combinatorial explosion** of subclasses, making it difficult to maintain.

## ✅ Solution
The **Decorator** pattern provides a flexible solution by:
- Keeping the base `Notifier` class simple.
- Using **decorators** to extend the behavior dynamically.
- Allowing **any number of notification types** to be combined at runtime without creating multiple subclasses.

Instead of subclassing, we use **composition**:
1. We define a `Notifier` interface.
2. The `EmailNotifier` class implements this interface.
3. Additional notification behaviors (`SMSDecorator`, `FacebookDecorator`, `SlackDecorator`) are implemented as **decorators**.
4. The **decorators wrap** the base notifier, allowing dynamic composition.

---

## 🏗️ Class Diagram
```dtd
+-----------------+
|   Notifier      |◄---------------------+
|-----------------|                      |
|+send(message)   |                      |
+-----------------+                      |
          ▲                              |
          |                              |
+---------+------------------------------+
|                                        |
|                                        |
+-----------------------+   +------------------------+   
|   BaseNotifier        |   | NotifierDecorator      |
|-----------------------|   |------------------------|
| +send(message)        |   | +send(message)         |
| (Sends email)         |   | (Delegates to notifier)|
+-----------------------+   +------------------------+
                                      ▲
                                      |
       +------------------------------+-----------------------------+
       |                              |                             |       
+-----------------------+   +-----------------------+   +-----------------------+
|   SMSNotifier         |   |  FacebookNotifier     |   |   SlackNotifier       |
|-----------------------|   |-----------------------|   |-----------------------|
| +send(message)        |   | +send(message)        |   | +send(message)        |
| (Sends SMS)           |   | (Sends Facebook msg)  |   | (Sends Slack msg)     |
+-----------------------+   +-----------------------+   +-----------------------+

```

## 🎯 Benefits of Decorator Pattern
`✔` Flexible and Dynamic Behavior - You can add behaviors at runtime without modifying existing code.

`✔` Avoids Subclass Explosion - No need to create multiple subclasses for each combination of behaviors.

`✔` Open-Closed Principle - New behaviors can be added without modifying existing code.

`✔` Single Responsibility Principle - Each decorator has a single, well-defined responsibility.

## 🛑 When Not to Use?
`🚫` If you have only one fixed behavior, there’s no need for decorators—just use simple subclasses.

`🚫` Excessive use of decorators can lead to complicated debugging and overhead in managing objects.

## 🏆 Conclusion
The Decorator pattern is a powerful tool that helps in extending the behavior of objects dynamically without modifying their structure. It is particularly useful in scenarios where multiple combinations of behaviors are needed, such as notification systems, text formatting, or GUI components.

