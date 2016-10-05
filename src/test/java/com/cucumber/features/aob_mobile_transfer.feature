Feature: Transfer funds using Mobile Banking

Scenario: Transfer 100 dollars
  Given I have logged into Mobile Banking
  And I have selected to transfer funds
  When I transfer 100 dollars
  Then The amount in from account is reduced by 100 dollars