# Selenium Cucumber Automation Framework

This project is a **Test Automation Framework** built using **Selenium WebDriver, Cucumber (BDD), Java, and TestNG**.  
It follows the **Page Object Model (POM)** design pattern for better maintainability and readability.

---

## Tech Stack

- Java
- Selenium WebDriver
- Cucumber (BDD)
- TestNG
- Maven
- Page Object Model (POM)
- Git & GitHub

---

## Project Structure

```
cucumberframework
│
├── src
│   ├── main
│   │
│   └── test
│       ├── java
│       │   ├── MyRunner
│       │   │   └── TestRunner.java
│       │   │
│       │   ├── Pageobject
│       │   │   └── LoginPage.java
│       │   │
│       │   └── Stepdefinition
│       │       └── Steps.java
│       │
│       └── resources
│           └── features
│               └── login.feature
│
└── pom.xml
```

---

## Features Implemented

- Login Automation Test
- BDD Feature File using Cucumber
- Page Object Model design pattern
- Selenium WebDriver integration
- Test execution using TestNG Runner
- Cucumber HTML Reports generation

---

## Sample Feature File

```gherkin
Feature: login

Scenario: Verify login with valid data
Given Launch chrome Browser
When Open url "http://admin-demo.nopcommerce.com/login"
Then Enter Email as "admin@yourstore.com" and Password "admin"
And Click on Login button
And Click on Logout button
And Close Browser
```

---

## How to Run the Tests

1. Clone the repository

```
git clone https://github.com/yourusername/cucumberframework.git
```

2. Open the project in IDE

Example IDE:
- IntelliJ IDEA
- Eclipse

3. Run the Test Runner file

```
TestRunner.java
```

---

## Reports

After execution, Cucumber generates a report in:

```
target/cucumber-report.html
```

Open the file in the browser to view the test results.

---

## Author

Software Tester with experience in:

- Manual Testing
- Automation Testing
- Selenium WebDriver
- Cucumber BDD
- Java

---

## Future Improvements

- Data Driven Testing
- Cross Browser Testing
- CI/CD Integration
- Screenshot on Test Failure

---
