Feature:Check the Live Chat

  Scenario: Check the Lİve Chat properly
    When Navigate to Samsung
    Given Get successfully message Samsung
    Then Close cookie window
    And Click the live chat in order to type on something and click and send message
    And Check the Whats App Support Icon
