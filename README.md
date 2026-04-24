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