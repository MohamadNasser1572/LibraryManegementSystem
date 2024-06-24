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
