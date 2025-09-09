Feature: User end-to-end flow

  Scenario: Successful registration
    Given I am on the Registration page
    When I register with valid details
    Then I should see a success message "Your Account Has Been Created!"

  Scenario: Login with registered credentials
    Given I am on the Login page
    When I login with the registered credentials
    Then I should be redirected to My Account page

  Scenario: Search and add product to cart
    Given I am on the Home page
    When I search for "iPhone"
    Then I should see search results containing "iPhone"
    When I add the product to the cart
    Then I should see a success message "Success: You have added"

  Scenario: Remove product from cart
    Given I have a product in the cart
    When I remove the product from the cart
    Then I should see a message "Your shopping cart is empty!"
