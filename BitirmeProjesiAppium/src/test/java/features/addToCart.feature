@SignUpAndAddProductToCart
Feature: Sign Up And Add Product To Cart

  @TrueSignUp
  Scenario Outline: True Sign Up
    Given Berfin is opened LcWaikiki App
    Then check "<title>" Title
    Then check "<desc>" title decsription
    Then check Atla button
    When click Atla button
    Then check home page
    When click profil button
    Then check profil page
    When click sign up button
    Then check sign up page
    When write "ipekhazal@gmail.com" in email part
    When write "berfin12345" in password part
    When click show password button in sign up page
    When write "5555555555" in telephone part
    When click SMS button
    When click memberPrivacyApprove button
    When click register button
    Then check verification code screen

    Examples:
      |    title      |        desc        |
      |PRATİK ALT MENÜ| Yenilenen alt menü |


  @FalseSignUp
  Scenario Outline: False Sign Up
    Given Berfin is opened LcWaikiki App
    Then check "<title>" Title
    Then check "<desc>" title decsription
    Then check Atla button
    When click Atla button
    Then check home page
    When click profil button
    Then check profil page
    When click sign up button
    Then check sign up page
    When write "@gmailcom" in email part
    When write "1" in password part
    When click show password button in sign up page
    When write "5000" in telephone part
    When click register button
    Then check email error message
    When print email error message
    Then check password error message
    When print password error message
    Then check phone error message
    When print phone error message
    Then check contract error message
    When print contract error message

    Examples:
      |    title      |        desc        |
      |PRATİK ALT MENÜ| Yenilenen alt menü |

  @Cart
  Scenario Outline: Login and Add to Cart
    Given Berfin is opened LcWaikiki App
    Then check "<title>" Title
    Then check "<desc>" title decsription
    Then check Atla button
    When click Atla button
    Then check home page
    When click profil button
    Then check profil page
    When write "berfinhazalkaya@gmail.com" in email part
    When write "berfin12345" in password part
    When click show password button in sign up page
    When click login button
    Then check home page
    When click category button
    Then check category page
    When click clothes page button
    When click blouse page button
    Then check blouse page
    When click filter button
    Then check filter page
    When click size button
    Then check size page
    When click medium size button
    When click apply button
    Then check filter page
    When click color button
    Then check color page
    When write "siyah" in color search box
    When click black button
    When click apply button
    Then check filter page
    When click list results button
    When click 1. product
    Then check product page
    When click detail tag
    When click medium size
    When click add to shopping cart
    When click my shopping cart
    Then check shopping cart page
    Then check product name
    Then check product code
    Then check how many product
    Then check size of product
    Then check total price
    When click pay button
    Then check delivery method page
    When click delivery to address
    Then check delivery to address page
    When click hide payment types
    When click show payment types
    Then check debit or credit cart title
    When click debit-credit card
    When click cancel button
    Then check name surname box
    Then check credit cart no box
    Then check expiration date boxes
    Then check cvv box

    Examples:
    |    title      |        desc        |
    |PRATİK ALT MENÜ| Yenilenen alt menü |










