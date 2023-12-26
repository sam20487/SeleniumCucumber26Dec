# Overview
This is selenium with java based framework.

Components Of the Framework:
Following tech stack are used
1. Java
2. Cucumber
3. Selenium
4. maven

## Before start
Clone the repo:using git or you can download the directory from git

How to run: go to directory SeleniumCucumberBDD-master\CucumberJava

and run the maven command to run the two scenarios.

pre-condition: 
1. java needs to installed and JAVA_HOME needs to be set.
2. maven needs to installed and MAVEN_HOME needs to set.

#### Run the tests:
command to execute to run tests:
mvn clean test

Features file path: $worksapce\src\test\resources\Features

After Running the test case report will generate following path:
$workspace\target\HtmlReports\index.html

Limitation:
1. Locators are hard coded in script file which can be moved to properties file.
2. hooks implementation is missing.
3. Basic reporting framework is used , it can be enhanced further.
4. test data currently hard coded in scipts(example- url), which can be read from config files 

"# SeleniumCucumber26Dec" 
