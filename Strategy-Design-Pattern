# Strategy Design Pattern - Defining a Family of Algorithms

This repository demonstrates the **Strategy Design Pattern**, a behavioral design pattern that enables you to define a family of algorithms, encapsulate each one as a separate class, and make them interchangeable. This allows the algorithm to vary independently from clients that use it.

## The Core Idea

Imagine you have a class that performs a certain operation, but that operation can be implemented in multiple ways. For example, a `Sorter` class might need to sort a list, but there are many sorting algorithms (Bubble Sort, Quick Sort, Merge Sort, etc.).

Instead of hardcoding a specific sorting algorithm into the `Sorter` class, or using complex conditional logic, the Strategy Pattern suggests:

1.  **Define an interface** for the algorithm (the "Strategy" interface).
2.  **Create concrete classes** that implement this interface, each representing a different algorithm (the "Concrete Strategies").
3.  **The client class** (the "Context") holds a reference to a Strategy object and delegates the execution of the algorithm to it. The client doesn't need to know *which* specific algorithm is being used, only that it conforms to the Strategy interface.
4.  **Allow the client to change** the strategy at runtime.

## Benefits

* **Interchangeability:** Easily swap different algorithms without changing the client code.
* **Flexibility:** New algorithms can be added without modifying existing code (Open/Closed Principle).
* **Cleaner Code:** Avoids large conditional statements (`if-else` or `switch`) for selecting algorithms.
* **Improved Testability:** Each algorithm can be tested independently.

## Example: Simple Arithmetic Operations

This example demonstrates the Strategy Pattern using simple arithmetic operations (addition, subtraction, multiplication) as our "family of algorithms."

### Project Structure

```
.
├── README.md
└── StrategyPatternExample.java
```

### How to Run

1.  Save the `StrategyPatternExample.java` file.
2.  Compile the Java code:
    ```bash
    javac StrategyPatternExample.java
    ```
3.  Run the compiled code:
    ```bash
    java StrategyPatternExample
    ```

### Expected Output

```
Executing Addition Strategy: 5 + 3 = 8
Executing Subtraction Strategy: 5 - 3 = 2
Executing Multiplication Strategy: 5 * 3 = 15
```

This simple example clearly illustrates how different arithmetic operations (algorithms) can be encapsulated and swapped at runtime, making the `Calculator` (context) flexible and extensible.
