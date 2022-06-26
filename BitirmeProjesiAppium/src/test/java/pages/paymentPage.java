package pages;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

public class paymentPage {

    By typeOfDeliveryTitle = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Teslimat Türü\")");
    By deliveryAddress = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Adrese Teslimat\")");
    By DeliveryAddressTitle = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Teslimat Adresi\")");
    By debitOrCreditCard = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Banka / Kredi Kartı\")");
    By cancelButton = By.id("com.lcwaikiki.android:id/mp_pin_dialog_cancel_button");
    By nameSurnameBox = By.id("com.lcwaikiki.android:id/edtNameCredit");
    By creditCartBox = By.id("com.lcwaikiki.android:id/edtNumberCredit");
    By expirationDateBox = By.id("com.lcwaikiki.android:id/creditCardMountText");
    By expirationDateBox2 = By.id("com.lcwaikiki.android:id/creditCardYearText");
    By CvvBox = By.id("com.lcwaikiki.android:id/edtCVV");
    By paymentTitle = By.id("com.lcwaikiki.android:id/paymentTypeTitle");
    By paymentIcon = By.id("com.lcwaikiki.android:id/paymentTypeConstraintLayout");

    AppiumDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;

    public paymentPage(AppiumDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);
    }

    public void checkDeliveryMethodPage() {
        elementHelper.checkElementPresence(typeOfDeliveryTitle);
    }

    public void clickDeliveryToAddress() {
        elementHelper.click(deliveryAddress,10);
    }

    public void checkDeliveryToAddressPage() { elementHelper.checkElementPresence(DeliveryAddressTitle); }

    public void clickHidePaymentTypes() {
        elementHelper.checkElementVisible(paymentTitle);
        elementHelper.click(paymentTitle,20);
    }

    public void clickShowPaymentTypes() {
        elementHelper.checkElementVisible(paymentIcon);
        elementHelper.click(paymentIcon,20);
    }

    public void checkDebitOrCreditCartTitle() {
        elementHelper.checkElementPresence(debitOrCreditCard);
    }

    public void clickDebitorCreditCard() { elementHelper.click(debitOrCreditCard,30); }

    public void clickCancelButton() {
        elementHelper.click(cancelButton,20);
    }

    public void checknameSurnameBox() {
        String text = wait.until(ExpectedConditions.visibilityOf(driver.findElement(nameSurnameBox))).getText();
        System.out.println("Name Surname Box Text = " + text);
    }

    public void checkCreditCartBox() {
        String text = wait.until(ExpectedConditions.visibilityOf(driver.findElement(creditCartBox))).getText();
        System.out.println("Credit Cart Box Text = " + text);
    }

    public void checkExpirationDateBoxes() {
        String text = wait.until(ExpectedConditions.visibilityOf(driver.findElement(expirationDateBox))).getText();
        System.out.println("Expiration Date Box1 Text = " + text);
        String text2 = wait.until(ExpectedConditions.visibilityOf(driver.findElement(expirationDateBox2))).getText();
        System.out.println("Expiration Date Box2 Text = " + text2);
    }

    public void checkCvvBox() {
        String text = wait.until(ExpectedConditions.visibilityOf(driver.findElement(CvvBox))).getText();
        System.out.println("Cvv Box Text= " + text);
    }
}
