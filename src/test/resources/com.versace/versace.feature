Feature: Validation of Versace sign up

  Scenario Outline:Validation of Versace sign up
    Given the user on the  home page
    Then user select "<Title>" option
    Then user enters "<FirstName>" , "<LastName>"
    Then user enters "<BirthDateMonth>","<BirthDateDay>","<BirthDateYear>"
    * user selects "<Country>"
    * user provide "<Email>", "<ConfirmEmail>","<Password>","<ConfirmPassword>","<PhoneNumber>"
    * user clicks "PrivacyPolicyButton"  , "RegisterButton"
    Then  user validate details "<Title>","<FirstName>" , "<LastName>","<BirthDateMonth>","<BirthDateDay>","<BirthDateYear>","<Country>","<Email>", "<ConfirmEmail>","<Password>","<ConfirmPassword>","<PhoneNumber>"

    Examples:
      | Title | FirstName | LastName | BirthDateMonth | BirthDateDay | BirthDateYear | Country       | Email          | ConfirmEmail   | Password | ConfirmPassword | PhoneNumber
      | Mr    | Serhat    | Greenman | 05             | 01           | 1993          | United States | srht@gmail.com | srht@gmail.com | SRC12345 | SRC12345        | 3334445555: