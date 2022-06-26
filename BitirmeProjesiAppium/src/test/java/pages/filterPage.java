package pages;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;
import java.util.List;

public class filterPage {

    By filterPageTitle = By.id("com.lcwaikiki.android:id/toolbarTitle");
    By colorButton = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Renk\")");
    By colorPageTitle = By.id("com.lcwaikiki.android:id/toolbarTitle");
    By colorSearchBox = By.id("com.lcwaikiki.android:id/searchFilterEditText");
    By blackButton = By.id("com.lcwaikiki.android:id/checked_color_text");
    By applyButton = By.id("com.lcwaikiki.android:id/subFilterButton");
    By sizeButton = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Beden\")");
    By sizePage = MobileBy.AndroidUIAutomator("new UiSelector().text(\"BEDEN\")");
    By listResultsButton = By.id("com.lcwaikiki.android:id/buttonFilter");

    AppiumDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;

    public filterPage(AppiumDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);
    }

    public void checkFilterPage() { elementHelper.checkElementPresence(filterPageTitle); }

    public void clickColorButton() { elementHelper.click(colorButton,10); }

    public void checkColorPage() {
        elementHelper.checkElementPresence(colorPageTitle);
    }

    public void writeColorSearchBox(String color) { elementHelper.sendKey(colorSearchBox,color); }

    public void clickBlackButton() { elementHelper.click(blackButton,10); }

    public void clickApplyButton() { elementHelper.click(applyButton,10); }

    public void clickSizeButton() {
        elementHelper.click(sizeButton,10);
    }

    public void checkSizePage() {
        elementHelper.checkElementPresence(sizePage);
    }

    public void clickMediumSizeButton() {
        List<WebElement> elementSizePage = driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.lcwaikiki.android:id/onSaleOnlyFilterLayout\")"));
        elementSizePage.get(10).click();
    }

    public void clickListResultsButton() { elementHelper.click(listResultsButton,10); }
}
