package stepDefinitions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import util.DriverFactory;

public class productDetailPageStep {

    pages.productDetailPage productDetailPage = new pages.productDetailPage(DriverFactory.getDriver());

    @Then("check product page")
    public void checkProductPage() { productDetailPage.checkProductPage(); }

    @When("click detail tag")
    public void clickDetailTag() { productDetailPage.clickDetailTag(); }

    @When("click medium size")
    public void clickMediumSize() {
        productDetailPage.clickMediumSize();
    }

    @When("click add to shopping cart")
    public void clickAddToShoppingCart() {
        productDetailPage.clickAddToShoppingCartButton();
    }

    @When("click my shopping cart")
    public void clickMyShoppingCart() {
        productDetailPage.clickShoppingCart();
    }
}