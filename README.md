# 💰 Pricing Engine Lab

![Java](https://img.shields.io/badge/Java-21-blue)
![Gradle](https://img.shields.io/badge/Gradle-Build-green)
![JUnit](https://img.shields.io/badge/Tests-JUnit5-orange)
![CI](https://github.com/bicho-dr/PricingEngineLab/actions/workflows/ci.yml/badge.svg)

---
# 💰 Pricing Engine Lab


![Java](https://img.shields.io/badge/Java-21-blue)
![Gradle](https://img.shields.io/badge/Gradle-Build-green)
![JUnit](https://img.shields.io/badge/Tests-JUnit5-orange)
![Status](https://img.shields.io/badge/Status-Completed-brightgreen)

A simple Java project demonstrating a **Pricing & Discount Engine** built with Gradle, JUnit testing, and clean code refactoring principles.

---

## 📌 Project Overview

This project calculates the final price of an order based on:

- Item prices
- Quantities
- Customer type (REGULAR / VIP)
- Discount codes (SAVE10, SAVE20, VIP discount)
- Tax calculation

It demonstrates software engineering concepts such as:
- Refactoring bad design
- Separation of concerns
- Strategy Design Pattern
- Unit Testing with JUnit
- Gradle build system
- Git workflow

---

## 🏗️ Architecture

The system is refactored into clean components:
org.example
│
├── App.java → Main application
├── DiscountService → Handles discount logic
├── DiscountStrategy → Interface for strategies
├── Save10Discount → 10% discount strategy
├── Save20Discount → 20% discount strategy
├── VipDiscount → VIP discount strategy
└── TaxService → Tax calculation logic

---

## ⚙️ Features

✔ Calculate subtotal  
✔ Apply different discount strategies  
✔ Apply VIP discount  
✔ Calculate tax (19%)  
✔ Compute final price  

---

## 🧪 Testing

Unit tests are written using **JUnit Jupiter**.

To run tests:

```bash
gradle test
=======
# Lab: Pricing & Discount Engine (Refactoring + Gradle + Testing)

## Objective
This lab combines:
- Git/GitHub workflow
- Refactoring of poor-quality code
- Gradle build system
- Java unit testing (JUnit)
- Python-based integration testing

Students start from a badly designed Java class and progressively improve it.

## Project Overview

Build a **pricing engine** that calculates the final price of an order.

### Inputs
- List of item prices
- Quantities
- Customer type (`REGULAR`, `VIP`)
- Discount code (`SAVE10`, `SAVE20`, etc.)

### Outputs
- Subtotal
- Discount amount
- Tax
- Final price

## Lab Workflow

1. Create a Gradle-based Java project  
2. Initialize a Git repository and push to GitHub  
3. Add the provided “bad design” starter code  
4. Write initial unit tests (JUnit)  
5. Refactor the code (improve structure, separation of concerns, readability)  
6. Continue committing at each logical step with clear messages
>>>>>>> upstream/main
