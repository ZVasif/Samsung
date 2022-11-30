Feature: Galaxy Z Fold 4

  Scenario: Add Z Fold basket and remove the basket

    When Navigate to Samsung
    Given Get successfully message Samsung
    Then Close cookie window
    And Click on the element from main menua
      | mobilButton |
    Then Click on GalaxZ
    And Buy Galaxy Z Flip
    And Add Cart
    And Select phone color
    And Click cart button
    And Go to cart
    And Delete to cart
    Then Close open pages