Feature: Samsung web

  Scenario: Navigate and get successfully message

    Given Navigate to Samsung
    When Get successfully message Samsung
    Then Close cookie window
    And Click on the Ekranlar from main menu
    And Click on the Monitör and Monitörleri Keşfedin
    Then Click on the monitor Ultra Genis
    And Click on the second monitor
    And Get successfully message