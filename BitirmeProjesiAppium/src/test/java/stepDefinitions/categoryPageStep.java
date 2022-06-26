package stepDefinitions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import util.DriverFactory;

public class categoryPageStep {

    pages.categoryPage categoryPage = new pages.categoryPage(DriverFactory.getDriver());

    @Then("check category page")
    public void checkCategoryPage() { categoryPage.checkCategoryPageTitle(); }

    @When("click clothes page button")
    public void clickClothesPageButton() {
        categoryPage.clickClothePageButton();
    }

    @When("click blouse page button")
    public void clickBlousePageButton() {
        categoryPage.clickBlousePageButton();
    }

    @Then("check blouse page")
    public void checkBlousePage() { categoryPage.checkBlousePage(); }

    @When("click filter button")
    public void clickFilterButton() {
        categoryPage.clickFilterButton();
    }


}