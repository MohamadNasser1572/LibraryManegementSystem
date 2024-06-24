# Library Management System

This repository contains a Library Management System built using Java. The application allows users to manage a collection of books and DVDs, facilitating borrowing and returning items while handling various exceptions.

## Features:
- **Item Management**: Add, view, borrow, and return items (books and DVDs) in the library.
- **Exception Handling**: Custom exceptions for handling scenarios like items already borrowed or not available.
- **OOP Principles**: Utilizes object-oriented programming concepts for robust design and maintainability.

## Project Structure:
- **src**: Contains all the source code files.
  - **Book**: Represents book items in the library.
  - **Borrowable**: Interface for items that can be borrowed.
  - **DVD**: Represents DVD items in the library.
  - **Item**: Base class for library items.
  - **ItemAlreadyBorrowedException**: Custom exception for already borrowed items.
  - **ItemNotAvailableException**: Custom exception for items not available.
  - **Library**: Main class for managing library operations.
  - **Main**: Entry point for the application.



#### Step 1: Define the Base Class and Interface
1. Create an abstract class called `Item`.
2. Define the following fields in the `Item` class:
  - `id` (String)
  - `title` (String)
  - `year` (int)
1. Add a constructor to initialize these fields.
2. Create getter and setter methods for each field.
3. Override the `toString` method to display item details.
4. Add an abstract method `getType()` that returns a String.

5. Create an interface called `Borrowable`.
6. Add methods `borrowItem()` and `returnItem()`. These methods should throw custom exceptions.

#### Step 2: Create Custom Exceptions
1. Create a custom exception called `ItemNotAvailableException`.
2. Create a custom exception called `ItemAlreadyBorrowedException`.

#### Step 3: Create Derived Classes
1. Create a class called `Book` that extends `Item` and implements `Borrowable`.
2. Add a field `author` (String) to the `Book` class.
3. Add a field `isBorrowed` (boolean) to track the borrowing status.
4. Add a constructor that initializes all fields, including the inherited ones.
5. Override the `toString` method to include the `author` field.
6. Implement the `getType` method to return "Book".
7. Implement the `borrowItem()` and `returnItem()` methods, including exception handling.

8. Similarly, create a class called `DVD` that extends `Item` and implements `Borrowable`.
9. Add a field `director` (String) to the `DVD` class.
10. Add a field `isBorrowed` (boolean) to track the borrowing status.
11. Add a constructor that initializes all fields, including the inherited ones.
12. Override the `toString` method to include the `director` field.
13. Implement the `getType` method to return "DVD".
14. Implement the `borrowItem()` and `returnItem()` methods, including exception handling.

#### Step 4: Create a Library Class
1. Create a class called `Library`.
2. Add a field `items` which is a list of `Item` objects.
3. Add methods to add and remove items from the library.
4. Add a method to display all items in the library.
5. Add methods to borrow and return items, handling the exceptions appropriately.

#### Step 5: Create the Main Class
1. Create a `Main` class with the `main` method.
2. Create instances of `Book` and `DVD`.
3. Add these items to the `Library`.
4. Borrow and return items, handling exceptions as needed.
5. Display all items in the library.

Use these steps to implement the enhanced Library Management System using OOP principles in Java.



-----------------------------------------------

I understand, I'll guide you step by step without providing the full implementation. Here's a breakdown of what needs to be done at each step, ensuring all necessary concepts are covered, including abstract classes, interfaces, and custom exceptions.

### Step-by-Step Instructions

#### Step 1: Create the Base Abstract Class `Item`

1. **Define the `Item` Class:**
  - Declare it as an abstract class.
  - Add private fields for `id`, `title`, and `year`.
  - Provide a constructor to initialize these fields.
  - Implement getter and setter methods for each field.
  - Override the `toString` method to display item details.
  - Add an abstract method `getType()` which returns a String.

#### Step 2: Create the Interface `Borrowable`

1. **Define the `Borrowable` Interface:**
  - Declare methods `borrowItem()` and `returnItem()`.
  - Both methods should throw `ItemNotAvailableException`.
  - `borrowItem()` should also throw `ItemAlreadyBorrowedException`.

#### Step 3: Create Custom Exceptions

1. **Define `ItemNotAvailableException`:**
  - Create a class extending `Exception`.
  - Add a constructor that accepts a message and passes it to the superclass constructor.

1. **Define `ItemAlreadyBorrowedException`:**
  - Create a class extending `Exception`.
  - Add a constructor that accepts a message and passes it to the superclass constructor.

#### Step 4: Implement the `Book` Class

1. **Define the `Book` Class:**
  - Extend `Item`.
  - Implement `Borrowable`.
  - Add a private field `author`.
  - Add a private boolean field `isBorrowed` to track borrowing status.
  - Provide a constructor to initialize all fields.
  - Implement the `getType()` method to return `"Book"`.
  - Implement `borrowItem()` to set `isBorrowed` to `true` and throw `ItemAlreadyBorrowedException` if already borrowed.
  - Implement `returnItem()` to set `isBorrowed` to `false` and throw `ItemNotAvailableException` if not currently borrowed.

#### Step 5: Implement the `DVD` Class

1. **Define the `DVD` Class:**
  - Extend `Item`.
  - Implement `Borrowable`.
  - Add a private field `director`.
  - Add a private boolean field `isBorrowed` to track borrowing status.
  - Provide a constructor to initialize all fields.
  - Implement the `getType()` method to return `"DVD"`.
  - Implement `borrowItem()` to set `isBorrowed` to `true` and throw `ItemAlreadyBorrowedException` if already borrowed.
  - Implement `returnItem()` to set `isBorrowed` to `false` and throw `ItemNotAvailableException` if not currently borrowed.

#### Step 6: Create the `Library` Class

1. **Define the `Library` Class:**
  - Add a list of `Item` objects.
  - Provide methods to add and remove items from the library.
  - Implement a method to display all items in the library.
  - Implement methods to borrow and return items, handling exceptions and using appropriate logic.

#### Step 7: Create the `Main` Class

1. **Define the `Main` Class:**
  - Create instances of `Book` and `DVD`.
  - Add these items to the `Library`.
  - Borrow and return items, demonstrating exception handling.
  - Display all items in the library before and after borrowing/returning items.

### Implementation Hints

1. **Abstract Class `Item`:**
  - Ensure all common attributes and methods are properly encapsulated.
  - Abstract methods force subclasses to provide specific implementations.

1. **Interface `Borrowable`:**
  - Focus on enforcing the borrowing contract on any item that can be borrowed.

1. **Exception Handling:**
  - Use exceptions to handle illegal operations and provide informative error messages.

1. **Class Relationships:**
  - Ensure that `Book` and `DVD` properly extend `Item` and implement `Borrowable`.
