Feature: BeyazEsya

  Scenario: Buying Washing/Drying Machine

    Given Navigate to Samsung
    When Get successfully message Samsung
    Then Close cookie window

    When Click on the Elements on HomePage
      |BeyazEsyaKlimalar|
      |CamasirKurutmaMakineleri|

    And Move to and Click on the Machine
      |WD90SatinAl|

    And Click on the Elements on HomePage
      |SepeteEkle|
      |SepeteGit|
      |SepetiOnayla|

    Then Mail Info Page Appears