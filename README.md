# **Shape Calculator - Java Program**  
*A Menu-Driven Program to Calculate Area, Perimeter, and Volume of Various Shapes*  

---

## **Table of Contents**
- [Introduction](#introduction)  
- [Features](#features)  
- [Technologies Used](#technologies-used)  
- [Getting Started](#getting-started)  
  - [Prerequisites](#prerequisites)  
  - [Installation Steps](#installation-steps)  
- [Usage](#usage)  
- [Class Structure](#class-structure)  
  - [Abstract Class: Shape](#1-abstract-class-shape)  
  - [Interface: Volume](#2-interface-volume)  
  - [Shape Implementations](#3-classes-implementing-shape)  
  - [Shape & Volume Implementations](#4-classes-implementing-shape--volume)  
- [Methods & Functions](#methods--functions)  
- [Code Structure](#code-structure)  
- [Example Run](#example-run)  
- [Contribution](#contribution)
- [Author](#Author)
- [License](#license)  

---

## **Introduction**
This Java program allows users to calculate the **area, perimeter, and volume** of various geometric shapes using **Object-Oriented Programming (OOP) principles**.  
It implements **abstract classes and interfaces** for efficient shape calculations.  

---

## **Features**
✔️ Menu-driven program for easy navigation  
✔️ Supports both **2D and 3D shapes**  
✔️ Implements **abstract classes & interfaces** for extensibility  
✔️ Includes **Triangle, Circle, Square, Rectangle, Sphere, Cylinder, and Equilateral Pyramid**  
✔️ Calculates **Area, Perimeter, and Volume (where applicable)**  
✔️ **Error handling** for incorrect user inputs  

---

## **Technologies Used**
- **Java** (JDK 11 or later)  
- **Object-Oriented Programming (OOP)**  
- **Abstract Classes & Interfaces**  
- **Scanner Class for User Input**  

---

## **Getting Started**
### **Prerequisites**
Ensure you have the following installed on your system:
- Java Development Kit (**JDK 11 or later**)  
- Any Java IDE (Eclipse, IntelliJ, VS Code)  

### **Installation Steps**
1. Clone the repository:  
   ```bash
   git clone https://github.com/your-username/Shape-Calculator.git
   ```
2. Open the project in your favorite **Java IDE**  
3. Compile and run the `Main.java` file:  
   ```bash
   javac Main.java  
   java Main  
   ```

---

## **Usage**
### **Run the Program**
When you execute `Main.java`, you will see a menu:  
```
Select a shape:
1. Circle
2. Rectangle
3. Square
4. Sphere
5. Cylinder
6. Equilateral Pyramid
7. Triangle
8. Exit
Enter your choice:
```
1. Enter the number corresponding to the shape you want to calculate.  
2. Provide the necessary measurements when prompted.  
3. The program will display the **area, perimeter, and volume** (if applicable).  

---

## **Class Structure**
### **1. Abstract Class: `Shape`**
- **`calculateArea()`** → Abstract method for area calculation  
- **`calculatePerimeter()`** → Abstract method for perimeter calculation  
- `Shape(String shapeName)` → Non-abstract constructor  

### **2. Interface: `Volume`**
- **`calculateVolume()`** → Abstract method for volume calculation  

### **3. Classes Implementing `Shape`**
| Class Name      | Description |
|----------------|-------------|
| `Circle`       | Represents a circle |
| `Rectangle`    | Represents a rectangle |
| `Square`       | Represents a square |
| `Triangle`     | Represents a triangle |

### **4. Classes Implementing `Shape` & `Volume`**
| Class Name          | Description |
|--------------------|-------------|
| `Sphere`          | Represents a sphere |
| `Cylinder`        | Represents a cylinder |
| `EquilateralPyramid` | Represents a square-based equilateral pyramid |

---

## **Methods & Functions**
### **Shape.java (Abstract Class)**
```java
public abstract class Shape {
    protected String shapeName;
    public Shape(String shapeName) { this.shapeName = shapeName; }
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
}
```

### **Volume.java (Interface)**
```java
public interface Volume {
    double calculateVolume();
}
```

### **Circle.java**
```java
public class Circle extends Shape {
    private double radius;
    public Circle(double radius) { super("Circle"); this.radius = radius; }
    public double calculateArea() { return Math.PI * radius * radius; }
    public double calculatePerimeter() { return 2 * Math.PI * radius; }
}
```
_(Similar methods exist for `Rectangle`, `Square`, `Triangle`.)_

### **Sphere.java**
```java
public class Sphere extends Shape implements Volume {
    private double radius;
    public Sphere(double radius) { super("Sphere"); this.radius = radius; }
    public double calculateArea() { return 4 * Math.PI * radius * radius; }
    public double calculateVolume() { return (4.0 / 3.0) * Math.PI * radius * radius * radius; }
    public double calculatePerimeter() { return 0; } // Not applicable
}
```
_(Similar methods exist for `Cylinder`, `EquilateralPyramid`.)_

### **Main.java (Menu-Driven Program)**
```java
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Select a shape:");
            int choice = scanner.nextInt();
            if (choice == 8) break;
            
            Shape shape = null;
            switch (choice) {
                case 1: shape = new Circle(scanner.nextDouble()); break;
                case 2: shape = new Rectangle(scanner.nextDouble(), scanner.nextDouble()); break;
                case 3: shape = new Square(scanner.nextDouble()); break;
                case 4: shape = new Sphere(scanner.nextDouble()); break;
                case 5: shape = new Cylinder(scanner.nextDouble(), scanner.nextDouble()); break;
                case 6: shape = new EquilateralPyramid(scanner.nextDouble(), scanner.nextDouble()); break;
                case 7: shape = new Triangle(scanner.nextDouble(), scanner.nextDouble()); break;
                default: System.out.println("Invalid choice!");
            }
            
            System.out.println("Area: " + shape.calculateArea());
            System.out.println("Perimeter: " + shape.calculatePerimeter());
            
            if (shape instanceof Volume) {
                System.out.println("Volume: " + ((Volume) shape).calculateVolume());
            }
        }
        scanner.close();
    }
}
```

---

## **Example Run**
```
Select a shape:
1. Circle
2. Rectangle
3. Square
4. Sphere
5. Cylinder
6. Equilateral Pyramid
7. Triangle
8. Exit
Enter your choice: 1
Enter radius: 5
Area: 78.54
Perimeter: 31.42
```

---

## **Contribution**
Want to improve this project?  
1. Fork the repository  
2. Create a feature branch (`git checkout -b feature-name`)  
3. Commit your changes (`git commit -m "Added feature"`)  
4. Push to the branch (`git push origin feature-name`)  
5. Open a **Pull Request**  

---

## Author
**Vedant Singh Thakur**  
[Batch: B3]  
[PRN: 23070126144]

---

## **License**
This project is licensed under the **MIT License** – feel free to modify and distribute.  

---
