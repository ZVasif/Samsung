Feature: Samsung web

  Scenario: Navigate and get successfully message

    Given Navigate to Samsung
    When Get message "Samsung"
    Then Close cookie window