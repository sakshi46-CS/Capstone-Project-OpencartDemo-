# Capstone-Project-OpencartDemo-
This repository contains the Capstone Project for automating OpenCart eCommerce website using Selenium WebDriver + TestNG in Java. It follows the Page Object Model (POM) design pattern for maintainability and scalability.
.

 Tech Stack

Java 17

Selenium 4.x

TestNG 7.x (test execution & assertions)

Cucumber 7.x (BDD scenarios with Gherkin)

Maven (build tool & dependency management)

Page Object Model (POM)

Extent Reports / SLF4J for reporting & logging



OpenCart-Capstone/
│── src/
│   ├── main/java/pageobjects/       # Page Object classes
│   ├── test/java/testcases/         # TestNG test cases
│   ├── test/java/stepdefinitions/   # Step definitions for Cucumber
│   ├── test/java/runners/           # TestNG + Cucumber runner classes
│   └── resources/features/          # Cucumber feature files (Gherkin)
│── pom.xml                          # Maven dependencies
│── testng.xml                       # TestNG suite runner
│── README.md                        # Project documentation
