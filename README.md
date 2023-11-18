# Selenium Test Scenario 1: Download the Latest Transcript

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

## Notes

- Ensure the WebDriver executable is available and paths are correctly set.
- Customize the test script based on specific requirements or portal changes.

## Contributors

- Xinyi Hu
- Sonal Gurav
- Sahil Gothoskar

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
