Feature:User make an order and make payment by check

  Scenario: User
    Given User is logged to the account
    And he choose a clothes
    And he choose a size
    And he choose a quantity
    And he add stuff to the trolley
    When User goes to checkout
    And he confirm his address
    And he choose how he will collect it
    Then User will choose how to pay
    And he will order with an obligation to pay
    And he make a screenshot
    And he can close browser
