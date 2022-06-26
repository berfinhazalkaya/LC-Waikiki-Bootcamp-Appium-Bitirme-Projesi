package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import util.DriverFactory;

public class filterPageStep {

    pages.filterPage filterPage = new pages.filterPage(DriverFactory.getDriver());

    @Then("check filter page")
    public void checkFilterPage() { filterPage.checkFilterPage(); }

    @When("click size button")
    public void clickSizeButton() { filterPage.clickSizeButton(); }

    @Then("check size page")
    public void checkSizePage() {
        filterPage.checkSizePage();
    }

    @When("click medium size button")
    public void clickMediumSizeButton() { filterPage.clickMediumSizeButton(); }

    @When("click apply button")
    public void clickApplyButton() {
        filterPage.clickApplyButton();
    }

    @When("click color button")
    public void clickColorButton() {
        filterPage.clickColorButton();
    }

    @Then("check color page")
    public void checkColorPage() {
        filterPage.checkColorPage();
    }

    @When("write {string} in color search box")
    public void writeInColorSearchBox(String color) {
        filterPage.writeColorSearchBox(color);
    }

    @When("click black button")
    public void clickBlackButton() {
        filterPage.clickBlackButton();
    }

    @When("click list results button")
    public void clickListResultsButton() {
        filterPage.clickListResultsButton();
    }
}