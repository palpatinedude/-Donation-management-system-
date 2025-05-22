# 🤝 Donation Management System

## 📌 Overview

This Java-based **Donation Management System** is designed to help organizations manage donations and beneficiaries efficiently. It simulates real-world interactions among admins, donors, and beneficiaries, facilitating the donation of both materials and services. The system tracks requests, offers, and allocations to ensure transparent and organized handling of contributions.

---

## 💼 Key Features

### 👤 User Roles
- **Admin**: Manages the overall system, approves donations, and monitors requests.
- **Donor**: Offers materials or services for donation.
- **Beneficiary**: Requests materials or services needed.

### 📦 Donation Management
- Manage donation offers of both physical materials and services.
- Track and match donation requests with suitable offers.
- Maintain history of donations and requests.

### 📋 Request Handling
- Beneficiaries submit requests for needed items or services.
- Donors respond with offers for available resources.
- Admins review and approve matches between requests and donations.

### 🗂️ Data Organization
- Classes representing key entities: `Organization`, `Admin`, `Beneficiary`, `Donator`, `Entity`, `Material`, `Service`, `Request`, `RequestDonation`, and `Offers`.
- Centralized lists to manage offers and requests efficiently.

### 📊 Interactive Menu
- User-friendly text-based menu for navigating system features.
- Options to create users, submit requests, make offers, and view records.

---

## ⚙️ Technologies Used

- **Java**: Object-oriented programming language for building the system.
- Core Java features such as classes, inheritance, collections (Lists, Maps), and user input handling.
- Console-based interface to demonstrate system capabilities without GUI.

---

## 🏗️ System Architecture

| Class Name           | Purpose                                            |
|----------------------|----------------------------------------------------|
| `Organization`       | Main class holding collections of users and offers|
| `Admin`              | Administrative operations and approval workflows   |
| `Beneficiary`        | Represents users requesting donations              |
| `Donator`            | Represents users offering donations                 |
| `Entity`             | Base class for donation items (Materials/Services) |
| `Material`           | Physical items that can be donated                   |
| `Service`            | Non-material services available for donation        |
| `Request`            | Requests made by beneficiaries                       |
| `RequestDonation`    | Matches between requests and donations              |
| `Offers`             | Manages the list of donation offers                  |
| `RequestDonationList`| Manages all active requests and donations           |
| `User`               | Base user class for Admin, Donator, and Beneficiary |
| `Menu`               | Console menu interface to interact with the system  |
| `Main`               | Entry point of the application                        |

---

