Feature: Shout Feature
@nonui
Scenario: Sean and Lucia are within the Range
Given Sean and Lucia are 20 meters away
When Sean shouts "free coffee" to Lucia
Then Lucia listens to the message
@nonui
Scenario: Sean and Lucia are not within the Range
Given Sean and Lucia are 300 meters away
When Sean shouts "free coffee" to Lucia
Then Lucia doeslistens to the message
@bagnonui
Scenario: Sarah has cucumber in her bag
Given Sarah has 10 cucumbers in her bag









 