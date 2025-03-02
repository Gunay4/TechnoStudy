# Agile Software Testing Project - TechnoStudy

## Table of Contents
- [Project Overview](#project-overview)
- [Features Tested](#features-tested)
- [Team2 Practice Project](#team2-practice-project)
- [Technologies and Tools Used](#technologies-and-tools-used)
- [Prerequisites](#prerequisites)
- [Project Goals](#project-goals)
- [Contributors](#contributors)
- [License](#license)

## Project Overview
This project is dedicated to automating test cases for the Techno Study website using TestNG, a widely recognized testing framework for Java. The primary objective is to validate the functionality of key website components while maintaining data integrity in the live environment.

## Features Tested
The following test scenarios were executed as part of this project:

### US501 - Dropdown Menu Validation
- Verify the existence of the "Kurslar" or "Courses" dropdown menu.
- Ensure all available courses are displayed upon expanding the menu.
- Confirm that course names are clearly visible.
- Validate redirection to the selected course page.

### US502 - Campus Login Verification
- Confirm the presence of the "Campus Girişi" or "Log in to Campus" option.
- Ensure that selecting this option redirects to the Campus login page.

### US503 - Application Process
- Verify the existence of the "Apply" button on the homepage.
- Check if clicking "Apply" leads to the application form.
- Ensure that the form is structured for easy input with necessary fields.
- Confirm that "test" appears in name and email fields, and the country is set to "Andorra".
- Validate that a confirmation message is displayed upon submission.

### US504 - Course Submenu Verification
- Verify the presence of the "Kurslar" or "Courses" submenu.
- Ensure a structured list of courses or submenus is displayed upon selection.
- Confirm that each course has a title and a short description.
- Validate redirection to the course details page.

### US505 - Social Media Links
- Verify that social media icons are visible in the website footer.
- Ensure that each link is properly labeled with an icon or text.
- Confirm that clicking a link navigates to the respective social media page.

### US506 - Homepage Redirection via Logo
- Ensure the Techno Study logo is displayed on all pages.
- Validate that clicking the logo redirects users back to the homepage.

### US507 - Course Details Page
- Confirm the presence of a "More Info" button in the "Kendi Kursunu Seç" section.
- Verify that clicking this button navigates to the course details page.
- Ensure the Techno Study logo appears on the course details page.

### US508 - Terms of Use Verification
- Check for an "I have read and accept the terms" checkbox in the contact form.
- Validate that selecting this option redirects to the "Terms of Use" page.
- Ensure that the "Terms of Use" page is well-structured and easy to read.

## Team2 Practice Project
- **Website:** techno.study
- **Supported Browsers:** Chrome, Edge, Firefox

## Technologies and Tools Used
This project utilizes the following tools and technologies:
- **Java** - Core programming language
- **Selenium WebDriver** - Browser automation tool
- **TestNG** - Java testing framework
- **Git & GitHub** - Version control and collaboration
- **JIRA & Zephyr-Squad** - Test case management tools
- **Page Object Model (POM)** - A structured approach to test automation

## Prerequisites
Before working on this project, ensure you have the following:
- **Java Development Kit (JDK):** Installed and configured.
- **IDE (Integrated Development Environment):** IntelliJ IDEA is recommended.
- **Git:** Installed for version control.
- **Selenium WebDriver:** Basic knowledge and setup.
- **TestNG:** Familiarity with its annotations and usage.
- **Page Object Model (POM):** Understanding and implementation of this design pattern.
- **JIRA & Zephyr:** Experience in test case management and defect tracking.

## Project Goals
1. **Implement Page Object Model (POM):** Ensure well-structured and reusable test cases.
2. **Enable Parallel Execution:** Run tests across multiple browsers (Chrome & Firefox).
3. **Use XML-based Test Execution:** Organize and execute test cases through XML files.
4. **Perform Smoke and Regression Testing:** Maintain separate test suites for efficient execution.
5. **Ensure Live Testing Considerations:** Use "test" in name and email fields to simplify post-test cleanup, with "Argentina" as the default country.

## Contributors
- **alikilincwk**
- **AlizaminMammadli**
- **ariftemur**
- **Gunay4**
- **GWilsonpixie**
- **kardelenssu**
- **Sinem777**
- **umit20222**

## License
This project is developed for educational and practice purposes, enabling participants to enhance their software testing expertise.
