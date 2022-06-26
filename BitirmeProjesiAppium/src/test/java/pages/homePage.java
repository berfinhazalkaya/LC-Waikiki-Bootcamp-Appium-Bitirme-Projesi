package pages;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

public class homePage {
    By categoryButton = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Kategoriler\")");
    By profilButton = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Profil\")");
    By welcomeTitle = By.id("com.lcwaikiki.android:id/txtWelcomeHeader");

    AppiumDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;

    public homePage(AppiumDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);
    }

    public void checkHomePage() { elementHelper.checkElementVisible(welcomeTitle); }

    public void clickProfilButton() {
        elementHelper.click(profilButton,10);
    }

    public void clickCategoryButton() {
        elementHelper.click(categoryButton,10);
    }
}
