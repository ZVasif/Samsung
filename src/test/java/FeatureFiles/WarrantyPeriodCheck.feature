Feature: Warranty Period Check

  Background:
    Given Navigate to Samsung
    When Get successfully message Samsung
    And Close cookie window

    Scenario: Accuracy of warranty periods offered to product categories
      Given Go to Samsung support page
      And Click on LEARN MORE to see warranty terms
      And Compare the warranty period of mobile devices with data
      And Compare the warranty period of TV and Lighting devices with the data
      And Compare the warranty period of WHITE GOODS with the data
      And Compare the warranty period of COMPUTER AND OFFICE devices with the data
      And Compare the warranty period of CAMERA AND VIDEO CAMERA devices with data
      And Compare the warranty period of the STORAGE devices with the data