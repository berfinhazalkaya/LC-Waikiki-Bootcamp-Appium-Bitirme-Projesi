package stepDefinitions;
import io.cucumber.java.en.When;
import util.DriverFactory;

public class searchPageStep {

    pages.searchPage searchPage = new pages.searchPage(DriverFactory.getDriver());

    @When("click {int}. product")
    public void clickProduct(int a) {
        searchPage.clickFirstProduct(a);
    }

}