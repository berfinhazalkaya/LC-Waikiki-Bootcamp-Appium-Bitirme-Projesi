package pages;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

public class cartPage {
    By cartPageTitle = By.id("com.lcwaikiki.android:id/toolbarTitle");
    By productName = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.lcwaikiki.android:id/itemBasketTitleText\")");
    By productCode = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.lcwaikiki.android:id/itemBasketCodeText\")");
    By howManyProduct = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.lcwaikiki.android:id/itemBasketCountText\")");
    By sizeOfProduct = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.lcwaikiki.android:id/itemBasketSizeText\")");
    By totalPrice = By.id("com.lcwaikiki.android:id/grandTotalValueText");
    By payButton = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.lcwaikiki.android:id/tv_go_checkout\")");

    AppiumDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;

    public cartPage(AppiumDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);
    }

    public void checkShoppingCartPage() {
        elementHelper.checkElementVisible(cartPageTitle);
    }

    public void checkProductName() {
        String text = wait.until(ExpectedConditions.visibilityOf(driver.findElement(productName))).getText();
        System.out.println("Product Name = " + text);
    }
    public void checkProductCode() {
        String text = wait.until(ExpectedConditions.visibilityOf(driver.findElement(productCode))).getText();
        System.out.println("Product Code = " + text);
    }

    public void checkHowManyProduct() {
        String text = wait.until(ExpectedConditions.visibilityOf(driver.findElement(howManyProduct))).getText();
        System.out.println("How Many Product= " + text);
    }

    public void checkSizeofProduct() {
        String text = wait.until(ExpectedConditions.visibilityOf(driver.findElement(sizeOfProduct))).getText();
        System.out.println("Size Of Product = " + text);
    }

    public void checkTotalPrice() {
        String text = wait.until(ExpectedConditions.visibilityOf(driver.findElement(totalPrice))).getText();
        System.out.println("Total Price is = " + text);
    }

    public void clickPayButton() {
        elementHelper.click(payButton,10);
    }

}
