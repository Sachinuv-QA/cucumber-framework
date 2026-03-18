# Selenium Cucumber Automation Framework

This project is a Test Automation Framework built using Selenium WebDriver, Cucumber (BDD), Java, and TestNG. It follows the Page Object Model (POM) design pattern to ensure better maintainability, scalability, and readability of test scripts.

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
├── cucumber-report.html
└── pom.xml

---

## Features Implemented

- Login Automation using Selenium WebDriver  
- Behavior Driven Development (BDD) using Cucumber  
- Page Object Model (POM) design pattern  
- Test execution using TestNG Runner  
- Cucumber HTML report generation  
- Clean and maintainable framework structure  

---

## Sample Feature File

Feature: Login Functionality

Scenario: Verify login with valid credentials
Given Launch chrome Browser
When Open url "http://admin-demo.nopcommerce.com/login"
Then Enter Email as "admin@yourstore.com" and Password "admin"
And Click on Login button
And Click on Logout button
And Close Browser

---

## How to Run the Tests

1. Clone the repository:
git clone https://github.com/yourusername/cucumberframework.git

2. Open the project in IDE (IntelliJ IDEA or Eclipse)

3. Run the Test Runner:
TestRunner.java

---

## Reports

After execution, Cucumber generates an HTML report:

target/cucumber-report.html

Download and open the file in any browser to view test execution summary, passed/failed scenarios, and detailed steps.

---

## Author

Sachin Kore

Skills:
- Manual Testing  
- Automation Testing  
- Selenium WebDriver  
- Cucumber BDD  
- Java  

---

## Future Enhancements

- Data Driven Testing  
- Cross Browser Testing  
- CI/CD Integration  
- Screenshot capture on test failure  
- Parallel test execution  

---

## Notes

- This project is developed for learning purposes  
- Follows industry-standard automation framework practices  
