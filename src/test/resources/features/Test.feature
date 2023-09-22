@TestAutomated
Feature: Login in underc0de forum

  Background: Login
    Given the user is on the home screen of yltrue.com
    When the user enter the user: "admin" and password: "admin"
    And the user click the login button


    Scenario Outline: Click DO1 button and DO2 button and check disabled status
    When the user click the "<button1>" button
    Then the user verify that the status of button "<button1>" change to "disabled"
    Examples:
      | button1 |
      | DO1!    |
      | DO2!    |

  Scenario Outline: Change font text
    When the user click the "<button>" button "<times>" times
    Then the user verify the font size "<action>"
    Examples:
      | button | action    | times |
      | ▲      | increases | 6    |
      | ▼      | decreases | 6    |

  Scenario: Change the background color
    When the user enter the "blue" color in the input
    And the user press the "SET BACKGROUND COLOR!" button
    Then the user verify the background color was changed to "blue"

