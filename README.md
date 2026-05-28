# 📝 Todo Application

A secure Todo web application built with Spring Boot, Thymeleaf, and Spring Security.

## 🛠️ Tech Stack
- Java 21
- Spring Boot 3.5.14
- Spring Security
- Spring MVC
- Thymeleaf
- Maven

## ✨ Features
- Secure login system with authentication
- Add new todos
- Mark todos as completed
- Delete todos
- Logout mechanism

## 🚀 How to Run
1. Clone the repo
   git clone https://github.com/mohsabbah7/Todo-app.git
2. Navigate to the project folder
   cd Todo-app
3. Run the application
   ./mvnw spring-boot:run
4. Open your browser and go to
   http://localhost:8080/todos

## 👤 Default User
| Username | Password | Role |
|----------|----------|------|
| user | password | USER |
| admin | password | USER |

## 📁 Project Structure
- model - Todo data class
- controller - TodoController handles HTTP requests
- service - Business logic for todos and authentication
- config - Spring Security configuration
- templates - Thymeleaf HTML pages
