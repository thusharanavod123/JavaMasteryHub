spring-boot-branch/
│── README.md
│── src/main/java/com/javamastery/Application.java
│── src/main/java/com/javamastery/controller/HelloController.java
│── src/main/resources/application.properties
│── src/main/resources/static/index.html




# Spring Boot - JavaMastery

Welcome to the **Spring Boot branch** of the JavaMastery repository! 🚀  
This branch contains essential Spring Boot files to get started with a simple web application.

## 📂 Project Structure:
- `Application.java` → Main Spring Boot application entry point.
- `HelloController.java` → A simple REST controller.
- `application.properties` → Configuration settings for the app.
- `index.html` → A static page served by Spring Boot.

## 🔥 How to Run
1. Clone this repo:
git clone https://github.com/yourusername/javamastery.git cd javamastery
2. Navigate to the Spring Boot branch:
 Run the application 
 mvn spring-boot:run 
 4. Open in browser:  
- REST API: [http://localhost:8080/hello](http://localhost:8080/hello)  
- Static Page: [http://localhost:8080/](http://localhost:8080/)

---

### 2️⃣ **Application.java** (Main Spring Boot App)
```java
package com.javamastery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
 public static void main(String[] args) {
     SpringApplication.run(Application.class, args);
 }
}

