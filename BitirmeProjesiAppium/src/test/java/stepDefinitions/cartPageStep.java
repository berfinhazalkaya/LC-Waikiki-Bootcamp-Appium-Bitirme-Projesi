package stepDefinitions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import util.DriverFactory;

public class cartPageStep {

    pages.cartPage cartPage = new pages.cartPage(DriverFactory.getDriver());

    @Then("check shopping cart page")
    public void checkShoppingCartPage() {
        cartPage.checkShoppingCartPage();
    }

    @Then("check product name")
    public void checkProductName() { cartPage.checkProductName(); }

    @Then("check product code")
    public void checkProductCode() {
        cartPage.checkProductCode();
    }

    @Then("check how many product")
    public void checkHowManyProduct() { cartPage.checkHowManyProduct(); }

    @Then("check size of product")
    public void checkSizeOfProduct() { cartPage.checkSizeofProduct(); }

    @Then("check total price")
    public void checkTotalPrice() { cartPage.checkTotalPrice(); }

    @When("click pay button")
    public void clickPayButton() {
        cartPage.clickPayButton();
    }
}