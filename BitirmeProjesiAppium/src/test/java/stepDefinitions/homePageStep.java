package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import util.DriverFactory;

public class homePageStep {

    pages.homePage homePage = new pages.homePage(DriverFactory.getDriver());

    @Then("check home page")
    public void checkHomePage() { homePage.checkHomePage(); }

    @When("click profil button")
    public void clickProfilButton() { homePage.clickProfilButton(); }

    @When("click category button")
    public void clickCategoryButton(){ homePage.clickCategoryButton(); }
}