#Auto generated Octane revision tag
@TID20001REV0.2.0
Feature:Message Input Field


	Scenario: Enter a long message
		Given I am on the contact us page
		When I enter 255 characters
		Then The full message is entered successfully
