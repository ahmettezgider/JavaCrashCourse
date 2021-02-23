Feature: test links


  Scenario: test link

    Given a user on "http://demowebshop.tricentis.com/"
    When  a all links should be defined under cssSelector "div.product-grid a"
    Then  a all links should be properly defined