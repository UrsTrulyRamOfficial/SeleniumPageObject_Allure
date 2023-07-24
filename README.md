# SeleniumPageObject_Allure
With further updates - This project is designed and developed with the help of -
1. Udemy course (OmPrakash Chavan - Selenium Java Test Framework & Best Practices - Masterclass) - [Learnings from Course (UDEMY - OC - Selenium).pdf](https://github.com/rajatt95/MasterSeleniumFramework/files/7421670/Learnings.from.Course.UDEMY.-.OC.-.Selenium.pdf)
2. YouTube playlist (Testing Mini Bytes - Selenium Automation Framework with Real-time dashboard)
------------------------------------------------------------
It has a concept of Atomic tests (Achieved by Selenium WebDriver API and RestAssured API)
------------------------------------------------------------
# Atomic Tests:
![image](https://github.com/UrsTrulyRamOfficial/SeleniumPageObject_Allure/assets/74490240/5bd7e581-4d0f-4dd0-9a55-5228ddb807d5)
------------------------------------------------------------
![image](https://github.com/UrsTrulyRamOfficial/SeleniumPageObject_Allure/assets/74490240/5178ec6b-ae92-4681-99ce-34c1579c448b)

![image](https://github.com/UrsTrulyRamOfficial/SeleniumPageObject_Allure/assets/74490240/8b477345-584a-4961-86a8-215c05169dc9)
------------------------------------------------------------
Updations done:
------------------------------------------------------------
**ExtentReports V5** 
1. User can apply the Filters - 
- Author - Ramesh, Arya, Abhi, Krish 
- Browser - Chrome, Edge, Safari, Firefox 
- TestType - Smoke, Sanity, Regression, BVT

2. Screenshots are attached in the ExtentReport as Base64 format.
![image](https://github.com/UrsTrulyRamOfficial/SeleniumPageObject_Allure/assets/74490240/d3472e9a-5ead-4ea3-a86d-a1745a438f45)
![image](https://github.com/UrsTrulyRamOfficial/SeleniumPageObject_Allure/assets/74490240/c4bff984-57a4-4a42-a3df-88512e7bc98c)
------------------------------------------------------------
**Allure Reports** 
![image](https://user-images.githubusercontent.com/26399692/135977881-10e654b4-6224-4aa9-8343-841af16aeeb3.png)
------------------------------------------------------------
**User has options for customization**
![image](https://github.com/UrsTrulyRamOfficial/SeleniumPageObject_Allure/assets/74490240/7ecb7a71-0826-4646-9cd0-c1bf22855f00)
------------------------------------------------------------
**Email to User(s) using Java mail API**
![image](https://github.com/UrsTrulyRamOfficial/SeleniumPageObject_Allure/assets/74490240/2d877615-8016-4a08-bb9d-4a4ebc971241)
------------------------------------------------------------
**Others implementations:**
1. Retry failed test cases
2. Custom Enums, Exceptions, Annotations 
3. Serialization and Deserialization using Jackson-Databind dependency
4. Data Driven testing using JSON file
-------------------------------
5. Icons addition in ExtentReport
a. Browser icon with every test case
b. Test status 
	       Test Description -> Last -> Pass (Happy), Fail (Sad)
c. WIN + Browser
d. Navigating to Right
e. Details (Add Rajat linkedIn and Github URL)
	      Make them Links and align it with Name
------------------------------
6. Zip the ExtentReports directory into Project path (you can send this Zip file as well as an Attachment in Email)
7. Automatically open the report after tests execution.
----------------------------------
8. Send EMail using Java mail API to User(s) with attachment(s).
 - https://mvnrepository.com/artifact/javax.mail/mail/1.4.7
 - https://www.tutorialspoint.com/java/java_sending_email.html
   
 - Gmail -> Manage your Google account:
        ![image](https://github.com/UrsTrulyRamOfficial/SeleniumPageObject_Allure/assets/74490240/f5c77ef9-f20d-49d1-944f-d980bdb03e8e)
   
 - Security -> Turn on : Less Secure App access:
        ![image](https://github.com/UrsTrulyRamOfficial/SeleniumPageObject_Allure/assets/74490240/94f3bdd8-09d3-4b33-9ca7-2c89d83ce2b6)

------------------------------------------------------------
**How to run the Project from Local machine**
1. Pull the code into your machine and import in IDE (Eclipse/intelliJ).
2. Go to testng_Local.xml -> Run this file as TestNG suite
  It should start the execution -> Parallel Cross Browser Testing.
 - **NOTE:** stg_config.properties is the default configuration file.
3. To view the Allure reports 
 - Setup the Allure in your machine
 - Go to URL (https://docs.qameta.io/allure/) -> Search for Manual installation -> Steps are mentioned
 - Go to your project location
 - Open command prompt -> allure serve allure-results
------------------------------------------------------------
**How to run the Project from Jenkins**

Please find the attached pdf document for reference.
[__Final-OC_Selenium-Github-ActiveChoiceParams.pdf](https://github.com/UrsTrulyRamOfficial/SeleniumPageObject_Allure/files/12127591/__Final-OC_Selenium-Github-ActiveChoiceParams.pdf)

![image](https://github.com/UrsTrulyRamOfficial/SeleniumPageObject_Allure/assets/74490240/96da3079-37d1-4870-b2c8-140720b61742)
------------------------------------------------------------
Email to User(s) using Jenkins:
![image](https://github.com/UrsTrulyRamOfficial/SeleniumPageObject_Allure/assets/74490240/df74bd8f-1019-452f-9000-1b568077910b)
------------------------------------------------------------
