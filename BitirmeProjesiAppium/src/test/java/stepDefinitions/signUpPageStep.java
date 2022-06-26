package stepDefinitions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import util.DriverFactory;

public class signUpPageStep {

    pages.signUpPage signUpPage = new pages.signUpPage(DriverFactory.getDriver());

    @Then("check sign up page")
    public void checkSignUpPage() {
        signUpPage.checkSignUpPage();
    }

    @When("write {string} in email part")
    public void writeInEmailPart(String email) { signUpPage.writeEmail(email); }

    @When("write {string} in password part")
    public void writeInPasswordPart(String password) {
        signUpPage.writePassword(password);
    }

    @When("click show password button in sign up page")
    public void clickShowPasswordButtonInSignUpPage() { signUpPage.clickShowPasswordIcon(); }

    @When("write {string} in telephone part")
    public void writeInTelephonePart(String telephone) {
        signUpPage.writeTelephone(telephone);
    }

    @When("click SMS button")
    public void clickSmsButton() {
        signUpPage.clickSMSButton();
    }

    @When("click memberPrivacyApprove button")
    public void clickMemberPrivacyApproveButton() { signUpPage.clickMPAButton(); }

    @When("click register button")
    public void clickRegisterButton() {
        signUpPage.clickRegisterButton();
    }

    @Then("check verification code screen")
    public void checkVerificationCodeScreen() {
        signUpPage.checkVerificationCode();
    }

    @Then("check email error message")
    public void checkEmailErrorMessage() { signUpPage.checkEmailErrorMessage(); }

    @When("print email error message")
    public void printEmailErrorMessage() { signUpPage.printEmailErrorMessage(); }

    @Then("check password error message")
    public void checkPasswordErrorMessage() {
        signUpPage.checkPasswordErrorMessage();
    }

    @When("print password error message")
    public void printPasswordErrorMessage() {
        signUpPage.printPasswordErrorMessage();
    }

    @Then("check phone error message")
    public void checkPhoneErrorMessage() {
        signUpPage.checkPhoneErrorMessage();
    }

    @When("print phone error message")
    public void printPhoneErrorMessage() { signUpPage.printPhoneErrorMessage(); }

    @Then("check contract error message")
    public void checkContractErrorMessage() { signUpPage.checkContractErrorMessage(); }

    @When("print contract error message")
    public void printContractErrorMessage() {
        signUpPage.printContractErrorMessage();
    }

    @When("click login button")
    public void clickLoginButton() {
        signUpPage.clickLoginButton();
    }
}