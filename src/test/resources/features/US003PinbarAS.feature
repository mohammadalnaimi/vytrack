Feature: Pinbar verification

  Background: User is already in the log in page
    Given the user is on the login page


  Scenario Outline: As a user, I want to learn how to use the pinbar.
    Given the user logged in as "<userType>"
    And  the user clicks the "Learn how to use this space" link
    And the user should be able to see title on home page as "How To Use Pinbar"
     Then the user should be able to see explanation on home page as "Use pin icon on the right top corner of page to create fast access link in the pinbar."
     # Then the user should see image from source "/bundles/oronavigation/images/pinbar-location.jpg"

    Examples:
      | userType      |
      | Store Manager |
      | Sales Manager |


