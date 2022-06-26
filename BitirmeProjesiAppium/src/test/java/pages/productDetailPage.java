package pages;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

public class productDetailPage {

    By productTitle = By.id("com.lcwaikiki.android:id/productTitleText");
    By detailTag = By.id("com.lcwaikiki.android:id/recyclerDetailTag");
    By mediumSize = MobileBy.AndroidUIAutomator("new UiSelector().text(\"M\")");
    By shoppingCartButton = By.id("com.lcwaikiki.android:id/basket");
    By shoppingCart = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Sepete Git\")");

    AppiumDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;

    public productDetailPage(AppiumDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 15);
        this.elementHelper = new ElementHelper(driver);
    }

    public void checkProductPage() {
        wait.until(ExpectedConditions.presenceOfElementLocated(productTitle));
    }

    public void clickDetailTag() {
        elementHelper.click(detailTag,15);
    }

    public void clickMediumSize() {
        elementHelper.click(mediumSize,15);
    }

    public void clickAddToShoppingCartButton() {
        elementHelper.click(shoppingCartButton,15);
    }

    public void clickShoppingCart() { elementHelper.click(shoppingCart,15); }
}
