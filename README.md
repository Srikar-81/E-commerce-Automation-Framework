# E-commerce-Automation-Framework

This project is a simple Test Automation Framework created to automate testing for web applications. 
It uses Java, Selenium, and TestNG to validate basic functionalities like login,registration,search on an e-commerce website.  
It was built with an emphasis on maintainability and clarity. Edit the data.properties file to update and to Run on Your browser.

 
**Technologies Used**

 	Java (JDK 17)

 	Selenium WebDriver

 	TestNG Maven (for project management and dependencies)

 	ExtentReports (for reporting test results)


**Features**

 	Page Object Model: A clear structure where each webpage is represented by a class, making
 		
		the framework easy to maintain.

 	ExtentReports Integration: Detailed reports are generated with screenshots for failed tests,
 		
		helping track issues more effectively.

 	Custom Listeners: For capturing events like test failures and screenshots, which are helpful for debugging.

 	TestNG for Test Execution: Organized test cases with parameters like valid/invalid inputs for
 		
		login, registration, and search functions.

 **Test Cases**

 	1. Login Test:

 		Test login with valid credentials.

 		Test login with invalid credentials.

 	2. Registration Test:

 		Register a new user with complete details.

 		Register a new user with only mandatory fields.

 	3. Search Test:

 		Search for an existing product.

 		Try searching for a product that doesn’t exist.

This project and its code are intended for educational purposes and have been committed to GitHub as part of the learning process.

