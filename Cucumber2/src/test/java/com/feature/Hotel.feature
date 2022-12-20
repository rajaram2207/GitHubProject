Feature: Room Booking Finctionally

Scenario: Hotel login
Given User open chromeband enter a url
When User enter username
And User enter password
Then User click the login

Scenario: Room Details
Given User Enter The Details
When User Enter The Location 
And User Enter The HotelName
And User Enter The Room Type
And User Enter The Number Of Room
And User Enter The Check In Date
And User Enter The Check Out Date
And User Enter The Number Of Adult
And User Enter The Number Of Children
Then User Click The Search 


Scenario: Selection 
Given User Select The Room
When User Click The Select
Then User Click The Contiune

Scenario: Book The Room
Given User Enter The details
When User Enter The First Name
And User Enter The Last Name
And User Enter The Address
And User Enter The Card Number
And User Enter The Card Type
And User Enter The Expiry Month
And User Enter The Expiry Year
And User Enter The Ccv Number
Then User Click The Book Now