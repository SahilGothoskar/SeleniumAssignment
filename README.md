# 1. Selenium Test Scenario 1: Download the Latest Transcript

## Overview

This repository contains a Selenium test scenario written in Java for automating the process of downloading the latest transcript from the Northeastern University portal.

## Prerequisites

- **Java JDK:** Ensure that Java JDK is installed.
- **WebDriver:** Install GeckoDriver for Firefox.
- **Browser:** Mozilla Firefox browser.
- **TestNG:** Framework for test execution.
- **Allure:** For test reporting.

## Setup

1. **Clone the repository:**
    ```bash
    git clone https://github.com/your-username/your-repository.git
    ```

2. **Project Setup:**
    - Set up the project in your preferred IDE.
    - Download dependencies using Maven or Gradle.

3. **WebDriver Configuration:**
    - Download and configure GeckoDriver for Firefox.

4. **CSV File:**
    - Ensure you have a CSV file with login credentials at `/Users/xinyihu/Desktop/NEU/info6255/SeleniumProject/login_credentials.csv`.

## Configuration

- The test scenario is configured to download the transcript as a PDF to the specified download directory.

## Usage

1. **Run Tests:**
    - Run the `Test01` class as a TestNG test.

2. **Test Steps:**
    - Log in to the Northeastern University portal.
    - Navigate to the My Transcript section.
    - Select the desired transcript type, submit the form, and download the transcript as a PDF.

## Test Data

- The login credentials are provided through a CSV file located at `/Users/xinyihu/Desktop/NEU/info6255/SeleniumProject/login_credentials.csv`.

## Reporting

- Use Allure for test reporting.
    ```bash
    allure serve allure-results
    ```

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


# 2. Selenium Test Scenario 2: Add Two To-Do Tasks

## Overview

This repository contains a Selenium test scenario written in Java for automating the process of adding two To-Do tasks on Canvas.

## Prerequisites

- **Java JDK:** Ensure that Java JDK is installed.
- **WebDriver:** Make sure the WebDriver (GeckoDriver for Firefox) is installed.
- **Browser:** Mozilla Firefox browser.
- **TestNG:** Framework for test execution.
- **Allure:** For test reporting.

## Setup

1. **Clone the repository:**
    ```bash
    git clone https://github.com/your-username/your-repository.git
    ```

2. **Project Setup:**
    - Set up the project in your preferred IDE.
    - Download dependencies using Maven or Gradle.

3. **WebDriver Configuration:**
    - Download and configure GeckoDriver for Firefox.

4. **CSV File:**
    - Ensure you have a CSV file with To-Do task data at `/Users/xinyihu/Desktop/NEU/info6255/SeleniumProject/to-do.csv`.

## Configuration

- The test scenario is configured to add two To-Do tasks to the Canvas Calendar.

## Usage

1. **Run Tests:**
    - Run the `Test02` class as a TestNG test.

2. **Test Steps:**
    - Opens a new tab and navigates to the Canvas website.
    - Opens the Calendar and clicks on the "Create New Event" button.
    - Navigates to "My To-Do" and adds two To-Do tasks with specified details.

## Test Data

- The To-Do task data is provided through a CSV file located at `/Users/xinyihu/Desktop/NEU/info6255/SeleniumProject/to-do.csv`.

## Reporting

- Use Allure for test reporting.
    ```bash
    allure serve allure-results
    ```

## Notes

- Ensure the WebDriver executable is available and paths are correctly set.
- Customize the test script based on specific requirements or Canvas changes.

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

# 3. Selenium Test Scenario 3: Download a Classroom Guide

## Overview

This repository contains a Selenium test scenario written in Java for automating the process of downloading a classroom guide from Northeastern University's service portal.

## Prerequisites

- **Java JDK:** Ensure that Java JDK is installed.
- **WebDriver:** Make sure the WebDriver (GeckoDriver for Firefox) is installed.
- **Browser:** Mozilla Firefox browser.
- **TestNG:** Framework for test execution.
- **Allure:** For test reporting.

## Setup

1. **Clone the repository:**
    ```bash
    git clone https://github.com/your-username/your-repository.git
    ```

2. **Project Setup:**
    - Set up the project in your preferred IDE.
    - Download dependencies using Maven or Gradle.

3. **WebDriver Configuration:**
    - Download and configure GeckoDriver for Firefox.

## Configuration

- The test scenario is configured to download a classroom guide from the Northeastern University service portal.

## Usage

1. **Run Tests:**
    - Run the `Test03` class as a TestNG test.

2. **Test Steps:**
    - Opens a new tab and navigates to the Northeastern University service portal.
    - Selects a specific classroom from the list.
    - Clicks on the Quick Guide PDF link.

## Reporting

- Use Allure for test reporting.
    ```bash
    allure serve allure-results
    ```

## Notes

- Ensure the WebDriver executable is available and paths are correctly set.
- Customize the test script based on specific requirements or portal changes.

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

# 4. Selenium Test Scenario 4: Download a Dataset

## Overview

This repository contains a Selenium test scenario written in Java for automating the process of downloading a dataset from the Northeastern University Library's digital repository service.

## Prerequisites

- **Java JDK:** Ensure that Java JDK is installed.
- **WebDriver:** Make sure the WebDriver (GeckoDriver for Firefox) is installed.
- **Browser:** Mozilla Firefox browser.
- **TestNG:** Framework for test execution.
- **Allure:** For test reporting.

## Setup

1. **Clone the repository:**
    ```bash
    git clone https://github.com/your-username/your-repository.git
    ```

2. **Project Setup:**
    - Set up the project in your preferred IDE.
    - Download dependencies using Maven or Gradle.

3. **WebDriver Configuration:**
    - Download and configure GeckoDriver for Firefox.

## Configuration

- The test scenario is configured to download a dataset from the Northeastern University Library's digital repository service.

## Usage

1. **Run Tests:**
    - Run the `Test04` class as a TestNG test.

2. **Test Steps:**
    - Opens a new tab and navigates to the Northeastern University Library's search page.
    - Clicks on the "Digital Repository Service."
    - Opens the datasets page and selects a specific dataset.
    - Clicks on the download link for the dataset.

## Reporting

- Use Allure for test reporting.
    ```bash
    allure serve allure-results
    ```

## Notes

- Ensure the WebDriver executable is available and paths are correctly set.
- Customize the test script based on specific requirements or library portal changes.

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

# 5. Selenium Test Scenario 5: Update the Academic Calendar

## Overview

This repository contains a Selenium test scenario written in Java for automating the process of updating the Academic Calendar on Northeastern University's Student Hub.

## Prerequisites

- **Java JDK:** Ensure that Java JDK is installed.
- **WebDriver:** Make sure the WebDriver (GeckoDriver for Firefox) is installed.
- **Browser:** Mozilla Firefox browser.
- **TestNG:** Framework for test execution.
- **Allure:** For test reporting.

## Setup

1. **Clone the repository:**
    ```bash
    git clone https://github.com/your-username/your-repository.git
    ```

2. **Project Setup:**
    - Set up the project in your preferred IDE.
    - Download dependencies using Maven or Gradle.

3. **WebDriver Configuration:**
    - Download and configure GeckoDriver for Firefox.

## Configuration

- The test scenario is configured to view the Academic Calendar on Northeastern University's Student Hub and unselect the graduate calendar.

## Usage

1. **Run Tests:**
    - Run the `Test05` class as a TestNG test.

2. **Test Steps:**
    - Opens a new tab and navigates to the Northeastern University Student Hub.
    - Clicks on "Academics, Classes & Registration."
    - Clicks on "Academic Calendar."
    - Switches to the Academic Calendar page.
    - Unchecks the graduate calendar option.
    - Scrolls to the bottom of the page.
    - Switches to the calendar iframe and verifies the "Add to My Calendar" button.

## Reporting

- Use Allure for test reporting.
    ```bash
    allure serve allure-results
    ```

## Notes

- Ensure the WebDriver executable is available and paths are correctly set.
- Customize the test script based on specific requirements or Student Hub changes.


## Contributors

- Xinyi Hu
- Sonal Gurav
- Sahil Gothoskar

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

# Test Suite Configuration

The test suite is configured using TestNG to execute the five test scenarios collectively. The `testng.xml` file defines the suite structure and specifies the classes to include in the suite.

## TestNG XML Configuration

The `testng.xml` file orchestrates the test suite with the following structure:

```xml
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
<suite name="Suite">
  <listeners>
    <listener class-name="io.qameta.allure.testng.AllureTestNg"/>
  </listeners>
  <test thread-count="5" name="Test">
    <classes>
      <class name="testPackage.Test01"/>
      <class name="testPackage.Test02"/>
      <class name="testPackage.Test03"/>
      <class name="testPackage.Test04"/>
      <class name="testPackage.Test05"/>
    </classes>
  </test> <!-- Test -->
</suite> <!-- Suite -->
```

## Suite Execution

- The testng.xml file specifies the suite structure, including the listeners used for Allure test reporting.
- The suite is named "Suite" and contains a single test named "Test."
- The test includes five classes (Test01 to Test05) representing the individual test scenarios.
- The suite is configured to run with a thread count of 5.

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
