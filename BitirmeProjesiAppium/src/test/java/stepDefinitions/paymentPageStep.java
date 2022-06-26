package stepDefinitions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import util.DriverFactory;
public class paymentPageStep {

    pages.paymentPage paymentPage = new pages.paymentPage(DriverFactory.getDriver());

    @Then("check delivery method page")
    public void checkDeliveryMethodPage() { paymentPage.checkDeliveryMethodPage(); }

    @When("click delivery to address")
    public void clickDeliveryToAddress() { paymentPage.clickDeliveryToAddress(); }

    @Then("check delivery to address page")
    public void checkDeliveryToAddressPage() {
        paymentPage.checkDeliveryToAddressPage();
    }

    @When("click hide payment types")
    public void clickHidePaymentTypes() { paymentPage.clickHidePaymentTypes(); }

    @When("click show payment types")
    public void clickShowPaymentTypes() { paymentPage.clickShowPaymentTypes(); }

    @Then("check debit or credit cart title")
    public void checkDebitOrCreditCartTitle() { paymentPage.checkDebitOrCreditCartTitle(); }

    @When("click debit-credit card")
    public void clickDebitCreditCard() { paymentPage.clickDebitorCreditCard(); }

    @When("click cancel button")
    public void clickCancelButton() {
        paymentPage.clickCancelButton();
    }

    @Then("check name surname box")
    public void checkNameSurnameBox() {
        paymentPage.checknameSurnameBox();
    }

    @Then("check credit cart no box")
    public void checkCreditCartNoBox() {
        paymentPage.checkCreditCartBox();
    }

    @Then("check expiration date boxes")
    public void checkExpirationDateBoxes() {
        paymentPage.checkExpirationDateBoxes();
    }

    @Then("check cvv box")
    public void checkCvvBox() {
        paymentPage.checkCvvBox();
    }

}