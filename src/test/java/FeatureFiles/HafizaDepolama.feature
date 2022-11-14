Feature: Hafiza / Depolama Menu Functionality

  Scenario: Select an Hafiza / Depolama product

    When Navigate to Samsung
    Given Get successfully message Samsung
    Then Close cookie window
    And Click on the element from main menu
      | hafizaDepolama |
      | hafizaDepolamaTumunuGor |
    And Click on the element from Filter Type
      | filterMemoryCard |