Feature: Pinbar verification

  Background: User is already in the log in page
    Given the user is on the login page


  Scenario Outline: As a user, I want to learn how to use the pinbar.
    Given the user logged in as "<userType>"
    And  the user clicks the "Learn how to use this space" link
    Then the user should see How To Use Pinbar
    And the user should see Use the pin icon on the right top corner of page to create fast access link in the pinbar.
    Then the user should see image from source "/bundles/oronavigation/images/pinbar-location.jpg"

    Examples:
      | userType |
      | Store Manager  |

