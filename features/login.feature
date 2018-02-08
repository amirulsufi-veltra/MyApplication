Feature: Login page
  Scenario: Login to continue
   # wrong access
    When I enter "user1" to "Username" text box
    When I enter "123456" to "Password" text box
    When I tap the "LOGIN" button
    Then I should not see "Login Success!"
    # Successful login as a valid user with id "test" and password "123456"
    When I enter "test" to "Username" text box
    When I enter "123456" to "Password" text box
    When I tap the "LOGIN" button
    Then I should see the "Login Success!"
    Then I am taking to the homepage screen