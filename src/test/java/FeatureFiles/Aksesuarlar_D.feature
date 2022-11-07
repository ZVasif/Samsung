Feature: Story with send keys

  Scenario: Send keys product name and buy

    When Navigate to Samsung
    Given Get successfully message Samsung
    Then Close cookie window
    And Click on the element from main menu
      | aksesuarlar |
      | searchBox   |
    Then Send product name
      | sendProduct | tablet |
    And Click Enter
    And Seleck TAB ULTRA
      | tab8   |
      | buy    |
      | addTo  |
      | goTo   |
      | delete |
      And Close window
      | close  |


