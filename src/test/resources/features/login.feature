Feature:login

  Scenario: Verify login with valid data
    Given Launch chrome Browser
    When Open url "http://admin-demo.nopcommerce.com/login"
    Then Enter Email as "admin@yourstore.com" and Password "admin"
    And Click on Login button
    And Click on Logout button
    And Close Browser