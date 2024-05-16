Feature: Filter Customers' Information

  Background: User is already in the log in page
    Given the user is on the login page

  Scenario Outline: Verify that users see 8 filter items on the Account page
    Given the user logged in as "<userType>"
    When the user hovers on Customers module
    And the user clicks on Accounts
    And the user clicks on Filter Icon
    Then verify user can see all 8 filter items

    Examples:
      | userType      |
      | Store Manager |
      | Sales Manager |

