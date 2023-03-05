@myaccount_login
Feature: My Account-Login

@smoke
  Scenario: log-in with valid username and password
    Given user go to "http://practice.automationtesting.in/"
    When user click on My Account Menu
    Then user enter registered username in username textbox
    Then user enter password in password textbox
    Then user click on login button
    Then user must successfully login to the web page
    And user close driver

 @regression
Scenario: log-in with incorrect username and incorrect password
    Given user go to "http://practice.automationtesting.in/"
    When user click on My Account Menu
    Then user enter incorrect username in username textbox
    Then user enter incorrect password in password textbox
    Then user click on login button
    Then user must verify error message Invalid username
    And user close driver

 @smoke
  Scenario: log-in with correct username and empty password
    Given user go to "http://practice.automationtesting.in/"
    When user click on My Account Menu
    Then user enter correct username in username textbox
    Then user enter empty password in the password textbox
    Then user click on login button
    Then user must verify error message (Invalid password)
    And user close driver

 @testrunner
Scenario: log-in with empty username and valid password
  Given user go to "http://practice.automationtesting.in/"
  When user click on My Account Menu
  Then user enter empty username in username-textbox
  Then user enter valid password in the password textbox
  Then user click on login button
  Then user must verify error message (Invalid username)
  And user close driver

  @login_5
  Scenario: log-in with empty username and empty password
    Given user go to "http://practice.automationtesting.in/"
    When user click on My Account Menu
    Then user enter empty username in username-textbox
    Then user enter empty password in the password textbox
    Then user click on login button
    Then user must verify error message (Invalid username)
    And user close driver

 @login_6
  Scenario: log-in-Password should be masked
    Given user go to "http://practice.automationtesting.in/"
    When user click on My Account Menu
    Then user enter the password field with some characters.
    Then The password field should display the characters in asterisks
    And user close driver

  @login_7
  Scenario: log-in handles with case sensitive
    Given user go to "http://practice.automationtesting.in/"
    When user click on My Account Menu
    Then user the case changed username in username textbox
    Then the case chenged password in the password tetxbox
    Then user click on login button
    Then login must fail saying incorrect username and password.
    And user close driver


  @login_8
  Scenario: log-in authentication
    Given user go to "http://practice.automationtesting.in/"
    When user click on My Account Menu
    Then user enter registered username in username textbox
    Then user enter password in password textbox
    Then user click on login button
    Then Once user logged in, sign out of the site
    Then user press back button
    Then user shouldn’t be signed in to his account rather a general webpage must be visible
    And user close driver

