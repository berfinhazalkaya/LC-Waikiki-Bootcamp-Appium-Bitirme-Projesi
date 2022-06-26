package pages;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

public class categoryPage {

    By categoryPageTitle = By.id("com.lcwaikiki.android:id/toolbarTitle");
    By clothePageButton = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Giyim\")");
    By blouseButton = MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(1)).scrollIntoView(new UiSelector().textMatches(\"Bluz\").instance(0))");
    By blouseTitle = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Bluz\")");
    By filterButton = By.id("com.lcwaikiki.android:id/filter_text");

    AppiumDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;

    public categoryPage(AppiumDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);
    }

    public void checkCategoryPageTitle() {
        elementHelper.checkElementVisible(categoryPageTitle);
    }

    public void clickClothePageButton() { elementHelper.click(clothePageButton,10); }

    public void clickBlousePageButton() { elementHelper.click(blouseButton,10); }

    public void checkBlousePage() {
        elementHelper.checkElementVisible(blouseTitle);
    }

    public void clickFilterButton() {
        elementHelper.click(filterButton,10);
    }
}
