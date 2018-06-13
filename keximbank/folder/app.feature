Feature: login


Scenario: validate the tittle of homepage
Given     launch the site
When     check the tittle with "KEXIM BANK" data
Then     username field should be displayed
And      close site


Scenario Outline: validate the userid and password
Given    launch the site
When     enter the userid with "<username>" data and enter the password with "<password>" data and click on login
Then     branches button should be displayed
And      close site

Examples: |username|password|
          |Admin|Admin|

