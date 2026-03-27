# CodeAlpha_Student-Grade-Tracker 🎓

A professional Java application designed to manage student grades using Object-Oriented Programming (OOP) principles. The program allows users to input multiple students, validate their grades, and generate a comprehensive performance report.

---

## 🌟 Key Features
* **Multi-Student Management:** Add as many students as needed using a dynamic `ArrayList`.
* **Input Validation:** Robust error handling using `try-catch` to ensure grades are numeric and within the range (0-100).
* **Statistical Analysis:**
    * Calculates the **Average Grade** of the class.
    * Identifies the **Highest Performing** student.
    * Identifies the **Lowest Performing** student.
* **OOP Architecture:** Clean separation of concerns between data (`Student`), logic (`GradeTracker`), and user interface (`Student_grade`).

---

## 🛠️ Project Structure
The project is organized into three main classes within the `student_grade` package:
1.  **Student.java:** A model class representing a student with `name` and `grade` attributes.
2.  **GradeTracker.java:** The core engine that stores student objects and performs calculations (average, max, min).
3.  **Student_grade.java:** The entry point (Main) that handles user interaction and displays the report.

---

## 📋 How to Run
1. **Requirements:** Make sure you have JDK installed.
2. **Compile:**
   ```bash
   javac student_grade/*.java
