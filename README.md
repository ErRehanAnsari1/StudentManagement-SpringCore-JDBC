# 🎓 Student Management System (Spring + JDBC + MySQL)

A simple **Student Management System** built using **Spring Core, Spring JDBC, and MySQL**.  
This project demonstrates the use of **Spring Bean configuration, DAO pattern, and Service layer architecture** with CRUD operations.

---

## ✨ Features
- ➕ Add a new student
- 📖 Get student details by ID
- 📋 List all students
- 🗑️ Delete student by ID
- ✏️ Update student details
- 🖥️ Console-based interactive menu for operations

---

## 🛠️ Tech Stack
- **Java 8**
- **Spring Core 5**
- **Spring JDBC**
- **MySQL Database**
- **Maven** (for dependency management)

---

## ⚙️ Setup Instructions
1. Clone the repo:
   ```bash
   git clone https://github.com/USERNAME/REPO_NAME.git
Import project into Eclipse/IntelliJ as a Maven project.

Create a database:

CREATE DATABASE studentdb;
USE studentdb;

CREATE TABLE student (
  id INT PRIMARY KEY,
  name VARCHAR(50),
  course VARCHAR(50),
  age INT
);


Update your applicationContext.xml with correct DB credentials.

Run the App.java file to start console-based interaction.

📸 Example Console Flow
--- Student Management Menu ---
1. Add Student
2. Get Student By ID
3. List All Students
4. Delete Student
5. Update Student
6. Exit

Author:Er.Rehan Ansari
