@failed_myaccount_login
Feature: My Account-Login

  @login_1
  Scenario: log-in with valid username and password
    Given user go to "http://practice.automationtesting.in/"
    When user click on My Account Menu
    Then user enter registered username in username textbox
    Then user enter password in password textbox
    Then user click on login button
    Then user must successfully login to the web page
    And user close driver

  @login_2
  Scenario: log-in with incorrect username and incorrect password
    Given user go to "http://practice.automationtesting.in/"
    When user click on My Account Menu
    Then user enter incorrect username in username textbox
    Then user enter incorrect password in password textbox
    Then user click on login button
    Then user must verify error message Invalid username
    And user close driver

  @login_3
  Scenario: log-in with correct username and empty password
    Given user go to "http://practice.automationtesting.in/"
    When user click on My Account Menu
    Then user enter correct username in username textbox
    Then user enter empty password in the password textbox
    Then user click on login button
    Then user must verify error message (Invalid password)
    And user close driver
