package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class LoginAdminPage {

    AppiumDriver driver;

    public LoginAdminPage(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//android.widget.Button[@resource-id=\"com.android.chrome:id/signin_fre_continue_button\"]")
    public WebElement continueButton;

    @FindBy(id = "com.android.chrome:id/button_primary")
    public WebElement loginButton;

    @FindBy(id = "com.android.chrome:id/ack_button")
    public WebElement ackButton;

    @FindBy(xpath = "//android.widget.EditText[@resource-id=\"com.android.chrome:id/search_box_text\"]")
    public WebElement urlBar;

    @FindBy(xpath = "//android.widget.TextView[@resource-id=\"com.android.chrome:id/line_1\" and @text=\"https://opensource-demo.orangehrmlive.com\uE007\"]")
    public WebElement urlText;

    @FindBy(xpath = "//android.view.View[@text=\"OrangeHRM Demo\"]")
    public WebElement orangeHRMlink;

    @FindBy(className = "android.widget.EditText")
    public WebElement usernameField;

    @FindBy(xpath = "//android.view.View[@resource-id=\"app\"]/android.view.View/android.view.View/android.view.View[3]/android.view.View[4]")
    public WebElement orangeHRMUsernameTextBox;

    @FindBy(xpath = "//android.view.View[@resource-id=\"app\"]/android.view.View/android.view.View/android.view.View[3]/android.view.View[6]/android.widget.EditText")
    public WebElement orangeHRMPasswordTextBox;

    @FindBy(xpath = "//android.widget.Button[@text=\"Login\"]")
    public WebElement LoginButton;

    @FindBy(xpath = "//android.widget.Button[@resource-id=\"com.android.chrome:id/touch_to_fill_button_title\"]")
    public WebElement singinpop;

    @FindBy(xpath = "//android.widget.Button[@resource-id=\"com.android.chrome:id/positive_button\"]")
    public WebElement OkButton;

    public void AdminLogin(){
//        try {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        /*continueButton.click();
        loginButton.click();
        ackButton.click();*/
            // urlBar.clear();
            urlBar.sendKeys("https://opensource-demo.orangehrmlive.com", Keys.ENTER);
        System.out.println("start");
        orangeHRMlink.click();
        System.out.println("middle");
            orangeHRMUsernameTextBox.click();
        System.out.println("click");
//            Thread.sleep(3000);
//            driver.findElement(By.xpath("//android.view.View[@text=\"Username\"]/parent::android.view.View/android.view.View[3]")).sendKeys("Admin");
            orangeHRMUsernameTextBox.sendKeys("Admin");
        System.out.println("sendkeys");
   /*     if(singinpop.isDisplayed()){
            singinpop.click();
        }*/
            orangeHRMPasswordTextBox.sendKeys("admin123");
            LoginButton.click();
            OkButton.click();
//        }catch (Exception e){
//            e.printStackTrace();
//        }
    }






}
