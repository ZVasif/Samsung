Feature: Samsung web

  Scenario: Navigate and get successfully message

    Given Navigate to Samsung
    When Get successfully message Samsung
    Then Close cookie window
    And Action to the IT from main menu and click on the Monitörleri Keşfedin
    Then Click on the monitor Ultra Genis
    And Click on the second monitor
    And Get successfully message