# Bank-Management-System Java-OOP Hands-On-Project# 🏦 Bank Management System

A simple **Java-based Bank Management System** created as a hands-on project to practice and revise **Object-Oriented Programming (OOP)** concepts.

## Technologies

* Java
* Core Java
* BigDecimal
* Eclipse IDE

##  Features

* Create bank accounts
* Deposit money
* Withdraw money
* Check balance
* Calculate saving account interest
* Different withdrawal rules for Saving and Current Accounts
* Shared bank name using `static`

##  OOP Concepts Practiced

* **Class & Object** — Creating and working with bank account objects
* **Constructor** — Initializing account details
* **Encapsulation** — Using `private` fields and getters
* **Static** — Shared `bankName` at class level
* **Inheritance** — `SavingAccount` and `CurrentAccount` extend `BankAccount`
* **Method Overriding** — Different `withdraw()` behavior for account types
* **`super`** — Calling parent constructor and parent methods
* **Polymorphism** — Parent reference pointing to a child object
* **BigDecimal** — Accurate money calculations and `compareTo()` comparisons

##  Class Structure

```text
BankAccount
    │
    ├── SavingAccount
    │
    └── CurrentAccount
```

### SavingAccount

* Calculates interest
* Maintains minimum ₹1000 balance during withdrawal

### CurrentAccount

* Allows withdrawal as long as sufficient balance is available

##  What I Practiced

This project was developed **hands-on**, focusing on understanding how OOP concepts work together rather than only learning their definitions.

**Learn → Implement → Test → Debug → Understand → Revise**

##  Future Improvements

* Exception handling
* Transaction history
* Money transfer
* Collections for multiple accounts
* JDBC/database integration
* Spring Boot REST API
