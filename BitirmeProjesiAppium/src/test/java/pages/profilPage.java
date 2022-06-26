package pages;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;


public class profilPage {

    By profilTitle = By.id("com.lcwaikiki.android:id/textviewTitleAccount");
    By signUpButton = By.id("com.lcwaikiki.android:id/registerNow");

    AppiumDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;

    public profilPage(AppiumDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);
    }

    public void checkProfilPage() {
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(profilTitle)));
    }

    public void clickSignUpButton() {
        elementHelper.click(signUpButton,10);
    }
}
