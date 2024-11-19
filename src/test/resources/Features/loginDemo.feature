@LoginDemo @Smoke
Feature: logindemo functinality
Scenario Outline: validate with valid cred login flow
#Given open browsers
And launch urls
When login with valid <username> and <Password>
Then Validate user is on login Page

Examples:
| username | Password |
| student | Password123 |
| student | Password123 |

