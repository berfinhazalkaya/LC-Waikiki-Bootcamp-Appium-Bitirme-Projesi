package stepDefinitions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import util.DriverFactory;

public class profilPageStep {

    pages.profilPage profilPage = new pages.profilPage(DriverFactory.getDriver());


    @Then("check profil page")
    public void checkProfilPage() { profilPage.checkProfilPage(); }

    @When("click sign up button")
    public void clickSignUpButton() { profilPage.clickSignUpButton(); }
}