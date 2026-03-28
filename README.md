# 💼 EMS Fullstack - Employee Management System

<p align="center">
  <b>A production-ready Full Stack Employee Management System built with Spring Boot & React</b><br/>
  Clean architecture • Scalable design • Industry-standard practices
</p>

---

## 🚀 Overview

**EMS Fullstack** is a complete **CRUD-based Employee Management System** designed to demonstrate real-world full stack development skills.  
It follows **industry best practices**, including layered architecture, RESTful APIs, and proper exception handling.

This project is ideal for showcasing **backend + frontend integration skills** to recruiters and senior developers.

---

## ✨ Features

- ➕ Add Employee  
- 📄 View All Employees  
- 🔍 View Employee Details  
- ✏️ Update Employee  
- ❌ Delete Employee  
- ⚠️ Global & Custom Exception Handling  
- 📦 RESTful API with proper HTTP status codes  
- ⚡ Fast and responsive UI  

---

## 🛠️ Tech Stack

### 🔙 Backend
- Java  
- Spring Boot  
- Spring Data JPA  
- MySQL  
- REST API (`@RestController`, `ResponseEntity`)  

### 🔜 Frontend
- React  
- HTML5  
- CSS3  
- Bootstrap  

---

## 🧱 Architecture

ems-fullstack/<br>
│<br>
├── backend/<br>
│   ├── controller/<br>
│   ├── service/<br>
│   ├── repository/<br>
│   ├── model/<br>
│   └── exception/<br>
│<br>
├── frontend/<br>
│   ├── components/<br>
│   ├── pages/<br>
│   ├── services/<br>
│   └── styles/<br>

## All API Endpoints (One View)
**Create Employee**
POST   http://localhost:8080/api/v1/employees

**Get All Employees**
GET    http://localhost:8080/api/v1/employees

**Get Employee By ID**
GET    http://localhost:8080/api/v1/employees/{id}

**Update Employee**
PUT    http://localhost:8080/api/v1/employees/{id}

**Delete Employee**
DELETE http://localhost:8080/api/v1/employees/{id}
