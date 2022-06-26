package stepDefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import util.DriverFactory;

public class welcomePageStep {

    pages.welcomePage welcomePage = new pages.welcomePage(DriverFactory.getDriver());

    @Given("Berfin is opened LcWaikiki App")
    public void berfinIsOpenedLcWaikikiApp() {
        welcomePage.checkAppIcon();
    }

    @Then("check {string} Title")
    public void checkTitle(String title) {
        welcomePage.checkTitle(title);
    }

    @Then("check {string} title decsription")
    public void checkDescTitleDecsription(String desc) {
        welcomePage.checkTitleDescription(desc);
    }

    @Then("check Atla button")
    public void checkAtlaButton() { welcomePage.checkButton(); }

    @When("click Atla button")
    public void clickAtlaButton() {
        welcomePage.clickAtlaButton();
    }
}