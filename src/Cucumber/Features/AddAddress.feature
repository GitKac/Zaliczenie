Feature: User can add his Address details to the profile

  Scenario: Valid details
    Given User is logged to the account
    And he goes to address form page
    When User add his <Alias> <Address> <PostCode> <City> <Country> and <Phone> details to account
    Then User can double check all details
    And he can close browser

#    Scenario Outline: Valid details
#      Given User is logged to the account
#      And he goes to address form page
#      When User add his <Alias> <Address> <PostCode> <City> <Country> and <Phone> details to account
#      Then User can double check all details
#      And he can close browser
#      Examples:
#        | Alias | Address   | City    | PostCode | Country        | Phone      |
#        | Fun   | Midle Str | Newport | E4 8BX   | United Kingdom | 8912456357 |
#        | Eye   | Last Str  | Derby   | N17 9BA  | United Kingdom | 4523789951 |

