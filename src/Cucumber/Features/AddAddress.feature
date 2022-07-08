Feature: User can add his Address details to the profile

#  Scenario: Valid details
#    Given User is logged to the account
#    And he goes to address form page
#    When User add Bob, 9 Ful House, London, E4 9BL, United Kingdom and 8555741963 details to account
#    Then User can double check all details
#    And he can close browser

    Scenario Outline: User can add more addresses
      Given User is logged to the account
      And he goes to address form page
      When User add <Alias>, <Address>, <City>, <PostCode>, <Country> and <Phone> details to account
      Then User can double check all details
      And he can close browser
      Examples:
        | Alias | Address     | City    | PostCode | Country        | Phone      |
        | Fun   | 1 Midle Str | Newport | E4 8BX   | United Kingdom | 8912456357 |
        | Eye   | 2 Last Str  | Derby   | N17 9BA  | United Kingdom | 4523789951 |

