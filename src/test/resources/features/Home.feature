Feature: Home Page functionality

    Background:
        Given user is on homepage

    Scenario: Validate home page logo
        Then logo should contain chase

#    Scenario: Validate sign in navigation
#        When user clicks signin
#        Then signin page should open
#
#    Scenario: Validate hamburger menu
#        When user clicks hamburger menu
#        Then banking options should display
