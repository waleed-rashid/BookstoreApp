# Java Bookstore Management System

A full-featured desktop bookstore application built with **Java Swing**, implementing object-oriented design principles, the **State Design Pattern**, and UML-based software architecture.

The application provides separate Owner and Customer interfaces for managing inventory, users, purchases, loyalty rewards, and persistent data storage through a responsive single-window GUI.

---

## Overview

This project demonstrates the design and implementation of a complete desktop application using object-oriented programming and software engineering principles.

The system supports two user roles:

- **Owner** – manages books and customer accounts.
- **Customer** – browses books, purchases items, redeems loyalty points, and automatically transitions between membership levels.

The application was designed using UML Use Case and Class Diagrams before implementation and follows the State Design Pattern to dynamically manage customer membership status.

---

## Features

### Owner

- Secure administrator login
- Add new books
- Delete books
- Register customers
- Remove customers
- View inventory
- View registered users

### Customer

- Secure login
- Browse available books
- Purchase multiple books
- Redeem accumulated loyalty points
- Automatic loyalty point accumulation
- Dynamic Gold/Silver membership updates
- Transaction summary after checkout

### System

- Single-window Java Swing interface
- Persistent file-based database
- Automatic data loading on startup
- Automatic data saving on exit
- Object-oriented architecture
- State Pattern implementation

---

## Application Architecture

```
                  +----------------+
                  |   Login View   |
                  +-------+--------+
                          |
             +------------+------------+
             |                         |
             ▼                         ▼
      Owner Dashboard          Customer Dashboard
             |                         |
      Book Management         Purchase Workflow
      Customer Management     Loyalty System
             |                         |
             +------------+------------+
                          |
                    File Persistence
             books.txt / customers.txt
```

---

## Object-Oriented Design

The application was designed using UML before implementation.

Design artifacts include:

- Use Case Diagram
- Class Diagram
- Object-Oriented Analysis
- Encapsulation
- Inheritance
- Polymorphism
- State Design Pattern

---

## State Design Pattern

Customer membership is managed using the **State Design Pattern**.

Each customer exists in one of two states:

- **Silver**
- **Gold**

Membership transitions occur automatically based on accumulated reward points.

```
           +-------------+
           |   Silver    |
           +-------------+
                 |
      Points >= Threshold
                 |
                 ▼
           +-------------+
           |    Gold     |
           +-------------+
                 |
      Points < Threshold
                 |
                 ▼
           +-------------+
           |   Silver    |
           +-------------+
```

Using the State Pattern eliminates conditional logic throughout the application and encapsulates membership-specific behavior into separate state classes.

---

## Loyalty Rewards System

Customers earn reward points after each purchase.

Features include:

- Automatic point accumulation
- Point redemption during checkout
- Automatic membership upgrades
- Automatic membership downgrades
- Dynamic transaction cost calculation

---

## Persistent Storage

Application data is stored using plain text files.

```
books.txt
customers.txt
```

On startup:

- Book inventory is loaded
- Customer information is restored

On exit:

- Current application state is automatically saved

This allows the bookstore to retain data across sessions without requiring an external database.

---

## Technologies Used

- Java
- Java Swing
- Object-Oriented Programming (OOP)
- Java Collections
- State Design Pattern
- UML
- File I/O
- NetBeans

---

## Project Structure

```
├── src/
│   ├── model/
│   ├── views/
│   ├── controllers/
│   ├── states/
│   ├── customers/
│   ├── books/
│   └── main/
│
├── books.txt
├── customers.txt
├── diagrams/
│   ├── UseCaseDiagram.pdf
│   └── ClassDiagram.pdf
│
└── README.md
```

*(Folder names may differ depending on your implementation.)*

---

## Core Functionality

### Owner Workflow

- Login
- Manage bookstore inventory
- Register customers
- Remove customers
- Logout

---

### Customer Workflow

- Login
- Browse available books
- Select purchases
- Buy books
- Redeem reward points
- View updated membership status
- Logout

---

## Testing

The application was tested by validating:

- User authentication
- Book management operations
- Customer management operations
- Reward point calculations
- Membership state transitions
- Transaction processing
- File persistence
- GUI navigation
- Single-window screen transitions

---

## Learning Outcomes

This project strengthened my understanding of:

- Object-Oriented Software Design
- Java Swing GUI development
- Design Patterns
- UML Modeling
- Desktop Application Architecture
- MVC-inspired organization
- File-based persistence
- Event-driven programming

---

## Future Improvements

Potential enhancements include:

- SQL database integration
- User password hashing
- Search and filtering
- Shopping cart
- Inventory quantities
- ISBN support
- Sales analytics dashboard
- JavaFX migration
- REST API backend
- Multi-user authentication

---

## Demo

Example workflow:

1. Owner logs in
2. Adds books to inventory
3. Registers new customer
4. Customer logs in
5. Purchases books
6. Earns loyalty points
7. Membership status updates automatically
8. Customer redeems points on future purchases
9. Application saves all changes automatically on exi
