package pages;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;
import java.util.List;

public class searchPage {
    By productImages = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.lcwaikiki.android:id/productImageView\")");

    AppiumDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;

    public searchPage(AppiumDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);
    }

    public void clickFirstProduct(int a) {
        List<AndroidElement> element = driver.findElements(productImages);
        element.get(0).click();
    }
}
