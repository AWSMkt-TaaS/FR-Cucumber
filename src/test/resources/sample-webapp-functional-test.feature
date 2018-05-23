Feature: Validate the web site pages
  Navigate to the Test page.
  Enter the values in two text boxes. 
  Hit concatenate button to populate the result in the third textbox.
  Validate the result populated is as expected.

  @FUNCTIONAL @REGRESSION @STAGE
  Scenario: Concatenate two numbers in home apge and navigate to about page
    Given I am using app url to navigate to the Test page
    And I have entered "222" into the first text box
    And Then I have entered "333" into the second text box
    When I press concatenate button
    Then the result should be "222333" on the third text box
    
   