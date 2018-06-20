This is a Maven UI Functional/Regression Demo Test Project
It uses Cucumber to run automated acceptance tests written in a behavior-driven development (BDD) style with Gherkin language parser.
Cucumber features and scenarios are scripted in the sample-webapp-functional-test.feature file.
It uses "https://webapp.astadia-taas.com" Web Application end points for the testing and the end-point url has been configured in the file DemoWebAppFunctionalstSteps.java.
Test Engineer can make changes  in the "sample-webapp-functional-test.feature" file 

Test Engineer can run the test, right click on pom.xml and do:
	- mvn clean
	  and then do
	- mvn test
	
	- The test result will be available in the following location: 
	  target/cucumber-report/html/demo-webapp-functional-test-reports/index.html
	  
Test Engineer can also run the maven test using CLI commands:
	- go to the directory contains the pom.xml  file and run the following commands
	- mvn clean test
	OR
	- mvn clean test -Dcucumber.options="--tags @FUNCTIONAL --tags @REGRESSION"  
	  (This will run all the tests that tagged with @FUNCTIONAL and @REGRESSION)
	  
	- The test result will be available in the following location: 
	  target/cucumber-report/html/demo-webapp-functional-test-reports/index.html
	  
The latest version of this demo test project can be cloned from the github location: https://github.com/AWSMkt-TaaS/FR-Cucumber

	  
	  
