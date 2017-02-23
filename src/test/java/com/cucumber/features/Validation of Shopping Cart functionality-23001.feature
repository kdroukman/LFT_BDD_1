#Auto generated Octane revision tag
@TID23001REV0.2.0
Feature: Shopping Cart


	Scenario: Check to total price of the shopping cart
		Given Store Catalogue Items have been added to the shopping cart
		When A mouse is hovered over the shopping cart
		Then The contents and total price is displayed