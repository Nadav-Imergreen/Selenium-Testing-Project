# Selenium-Testing-Project

Developed collaboratively with my mentor, Ilana Baikal, where she laid the foundational principles of the project, and I contributed additional details and enhancements.

This project consists of automated test scripts designed for web application testing using Selenium WebDriver.

## Table of Contents

* [Introduction](#introduction)
* [Project Structure](#project-structure)
* [Test Scripts](#test-scripts)
* [Dependencies](#dependencies)
* [Getting Started](#getting-started)
* [Run Tests](#run-tests)
* [Adding a New Page-Class](#Adding-a-New-Page-Class)
* [Pages Hierarchy](Pages-Hierarchy)

## Introduction

The Selenium Testing Project aims to demonstrate automated testing of a web application. It includes two sets of test scripts: `OldCodeTest` and `PageObjectCode`. The former represents an older implementation, while the latter adopts a more structured Page Object Model (POM) approach.

## Project Structure

- **tests/basic/OldCodeTest.java:** Contains a test script using an older coding style.
- **tests/basic/PageObjectCode.java:** Contains a test script using the Page Object Model.

## Test Scripts

### OldCodeTest

This test script showcases basic Selenium testing using an older coding style. It performs user registration on the [NOP Commerce](https://demo.nopcommerce.com/) website.

### PageObjectCode

This test script follows the Page Object Model, providing a more modular and maintainable structure for automated testing. It also performs user registration on the [NOP Commerce](https://demo.nopcommerce.com/) website.

## Dependencies

The project relies on various dependencies managed by Maven. Some notable dependencies include:

- Selenium WebDriver
- Maven
- TestNG
- Guava
- Gson
- ...

For a complete list, please refer to the [pom.xml](pom.xml) file.

## Getting Started

1. Clone the repository:

   ```bash
   
   git clone https://github.com/Nadav-Imergreen/Selenium-Testing-Project.git
2. Navigate to the project directory:

   ```bash
     cd Selenium-Testing-Project

## Run Tests
To execute the tests, ensure you have the necessary dependencies and configurations set up.
You can run the tests using your preferred build tool or IDE.

## Adding a New Page-Class

### Overview
Adding a new page-class to the Selenium Testing Project involves several steps to ensure proper integration with the existing structure. Follow the steps below to add a new page-class:

### Steps
1. **Create a New Java Class:**
   - Create a new Java class for the desired page. This class will represent the functionality and interactions with that specific page.

2. **Inherit from Another Page-Class:**
   - Inherit the new class from an existing page-class. This promotes code reuse and ensures a consistent structure.

3. **Add Constructor Method:**
   - Include a constructor method in the new page-class to initialize any necessary components.

4. **Implement ensurePageLoaded Method:**
   - Add an `ensurePageLoaded` method to the new page-class. This method ensures that the page is fully displayed before any user interactions occur.

5. **Add Relevant Fields and Methods:**
   - Include fields and methods in the new page-class that are relevant to the functionality of the page.

6. **Update MainPageManager:**
   - In the `MainPageManager` class, declare and initialize an instance of the new page-class in the class's members list.

     ```java
     // in the class's members list
     public NewPageClass newPage;
     
     // in the constructor
     newPage = initElements(new NewPageClass(this));
     ```

### ensurePageLoaded Method Example
Every page-class should have a method, such as `ensurePageLoaded`, to guarantee that the page is fully displayed before user interactions. Below are examples for `MenusPage` and `HomePage`:

#### MenusPage
```java
public MenusPage ensurePageLoaded() {
   super.ensurePageLoaded();
   waitBig.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("body")));
   return this;
}
```
## Pages Hierarchy

The Selenium Testing Project follows a structured hierarchy for organizing and managing different pages. This hierarchy ensures a modular and maintainable structure for automated testing.

### Page - AnyPage

The `AnyPage` class serves as the base class for all pages in the project. It includes common functionalities and methods that are applicable to all pages.

### MenusPage

The `MenusPage` class extends `AnyPage` and represents the page related to menus. It includes methods and interactions specific to menu-related functionality.




