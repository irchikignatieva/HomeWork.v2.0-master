Feature: Log In in i.ua

  Scenario:
    Given I open browser Chrome
    When I open i.ua site
    Then I see \w* site


    Scenario:
      Given I open browser Chrome
      When I open i.ua site
      Then I enter \w*
      Then I enter \w*
      Then I see result \w*



