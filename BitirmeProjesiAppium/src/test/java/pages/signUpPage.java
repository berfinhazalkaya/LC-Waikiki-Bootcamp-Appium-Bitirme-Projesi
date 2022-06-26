package pages;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

public class signUpPage {

    By signUpTitle = By.id("com.lcwaikiki.android:id/headerLogin");
    By writeEmail = By.id("com.lcwaikiki.android:id/edtEmail");
    By writePassword = By.id("com.lcwaikiki.android:id/edtPassword");
    By showPasswordIcon = By.id("com.lcwaikiki.android:id/text_input_end_icon");
    By writeTelephone = By.id("com.lcwaikiki.android:id/edtPhoneNumber");
    By smsButton = By.id("com.lcwaikiki.android:id/smsChecked");
    By MPAButton = By.id("com.lcwaikiki.android:id/contractChecked");
    By registerButton = By.id("com.lcwaikiki.android:id/buttonRegister");
    By telCodeTitle = By.id("com.lcwaikiki.android:id/dialogTitleText");
    By emailError = By.id("com.lcwaikiki.android:id/errortextEmail");
    By passwordError = By.id("com.lcwaikiki.android:id/errortextPassword");
    By phoneError = By.id("com.lcwaikiki.android:id/errortextPhone");
    By contractError = By.id("com.lcwaikiki.android:id/errorContractInfo");
    By loginButton = By.id("com.lcwaikiki.android:id/buttonLogin");

    AppiumDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;

    public signUpPage(AppiumDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);
    }

    public void checkSignUpPage() {
        elementHelper.checkElementVisible(signUpTitle);
    }

    public void writeEmail(String email) {
        elementHelper.sendKey(writeEmail,email);
    }

    public void writePassword(String password) {
        elementHelper.sendKey(writePassword,password);
    }

    public void clickShowPasswordIcon() {
        elementHelper.click(showPasswordIcon,10);
    }

    public void writeTelephone(String telephone) {
        elementHelper.sendKey(writeTelephone,telephone);
    }

    public void clickSMSButton() {
        elementHelper.click(smsButton,10);
    }

    public void clickMPAButton() {
        elementHelper.click(MPAButton,10);
    }

    public void clickRegisterButton() {
        elementHelper.click(registerButton,10);
    }

    public void checkVerificationCode() {
        String title = driver.findElement(telCodeTitle).getText();
        System.out.println("Telephone Verification Code Screen Title is : " + title);
        System.out.println("The case of checking the sms verification screen by entering the correct data on the register page is over.");
    }

    public void checkEmailErrorMessage() {
        elementHelper.checkElementVisible(emailError);
    }

    public void printEmailErrorMessage() {
        String error = driver.findElement(emailError).getText();
        System.out.println("Email Error Message is : " + error);
    }
    public void checkPasswordErrorMessage() { elementHelper.checkElementVisible(passwordError); }

    public void printPasswordErrorMessage() {
        String error = driver.findElement(passwordError).getText();
        System.out.println("Password Error Message is : " + error);
    }

    public void checkPhoneErrorMessage() {
        elementHelper.checkElementVisible(phoneError);
    }

    public void printPhoneErrorMessage() {
        String error = driver.findElement(phoneError).getText();
        System.out.println("Phone Error Message is : " + error);
    }

    public void checkContractErrorMessage() { elementHelper.checkElementVisible(contractError); }

    public void printContractErrorMessage() {
        String error = driver.findElement(contractError).getText();
        System.out.println("Contract Error Message is : " + error);
    }

    public void clickLoginButton() {
        elementHelper.click(loginButton,10);
    }
}
