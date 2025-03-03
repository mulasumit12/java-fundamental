# Java Basics

## Introduction to Java

Java is a programming language used for developing applications that can run on different platforms. It is widely used for web, mobile, and enterprise applications. Java follows the principle of "Write Once, Run Anywhere" because of its platform independence.

## History of Java

Java was developed by James Gosling and his team at Sun Microsystems in the mid-1990s. It was initially called "Oak" but later renamed to Java. The first version of Java was released in 1995. Over the years, Java has evolved with multiple versions, adding new features and improvements.

## Object-Oriented Programming (OOP)

Java is an object-oriented programming language, which means it is based on objects and classes. The main concepts of OOP in Java include:

- **Class**: A blueprint for creating objects.
- **Object**: An instance of a class.
- **Encapsulation**: Hiding the internal details of an object.
- **Inheritance**: Allowing a class to inherit properties from another class.
- **Polymorphism**: Ability of a function or method to work in different ways.
- **Abstraction**: Hiding complex implementation details from the user.

### Example:

```java
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.makeSound();
    }
}
```

## High-Level and Low-Level Languages

- **High-Level Languages**: These are programming languages that are easier to read and write for humans. Java is a high-level language because its syntax is user-friendly and abstracted from machine code.
- **Low-Level Languages**: These include machine language and assembly language, which are closer to the hardware and harder to read for humans.

## Compiler and Interpreter

- **Compiler**: Translates the entire source code into machine code before execution. Java uses a compiler to convert source code into bytecode.
- **Interpreter**: Translates and executes the code line by line. Java uses an interpreter within the JVM to run bytecode.

### Compilation and Execution

```sh
javac Main.java  # Compile Java code
java Main        # Run the compiled program
```

## Java Development Kit (JDK) and Java Virtual Machine (JVM)

- **JDK (Java Development Kit)**: A set of tools required for developing Java applications, including the compiler, libraries, and documentation.
- **JVM (Java Virtual Machine)**: A runtime environment that executes Java bytecode, making Java platform-independent.

## Useful Links

- [Java Documentation](https://docs.oracle.com/en/java/)
- [Java Tutorials](https://www.javatpoint.com/java-tutorial)

This covers the basic concepts of Java. Understanding these fundamentals is essential for learning and developing Java applications.