Feature: Home page
  Scenario: continue without login to homepage
   When I tap the "Continue without login" text
   Then I should see the "Continue without login"
   Then I am taking to the homepage screen
   # Successful navigate to homepage
   When I tap the "Continue" text
   Then I should see the "Homepage click"