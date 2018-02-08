require 'calabash-android/calabash_steps'

When(/^I enter "([^"]*)" to "([^"]*)" text box$/) do |arg1, arg2|
  query("* marked:'#{arg2}'", setText: arg1)
end

When(/^I tap the "([^"]*)" button$/) do |arg1|
  touch("* marked:'#{arg1}'")
  sleep 1
end

Then(/^I should see the "([^"]*)"$/) do |arg1|
#  pending # Write code here that turns the phrase above into concrete actions
end

When(/^I tap the "([^"]*)" text$/) do |arg1|
   touch("* marked:'#{arg1}'")
   sleep 1
end

Then(/^I am taking to the homepage screen$/) do
  sleep 5
end