# Telephone Checker

This is a Java class that provides functionality to verify phone numbers and identify potential spam numbers.

## Description

The `TelephoneChecker` class has two main methods:

1. `verifyNumber(long number)`: This method verifies if the provided number is a valid phone number. It checks if the number is within a certain range to be considered valid.

2. `identifySpam(long number)`: This method checks if a provided phone number is potential spam based on the area code. Currently, it always returns `false` and needs to be implemented.

## Usage

To use this class, you need to create an instance of `TelephoneChecker` and call the methods with the phone number you want to check.

```java
TelephoneChecker checker = new TelephoneChecker();
boolean isValid = checker.verifyNumber(1234567890L);
boolean isSpam = checker.identifySpam(1234567890L);