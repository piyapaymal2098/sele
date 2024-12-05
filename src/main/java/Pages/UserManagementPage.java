package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserManagementPage {

    AppiumDriver driver;

    public UserManagementPage(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//android.widget.Button[@text=\"\uF4FE Add\"]")
    public WebElement addUserButton;

    @FindBy(xpath = "(//android.widget.TextView[@text=\"\uF229\"])[2]")
    public WebElement UserRollDropdown;

    @FindBy(xpath = "//android.view.View[@text=\"Admin\"]")
    public WebElement adminoption;

    @FindBy(xpath = "//android.view.View[@resource-id=\"app\"]/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[4]/android.view.View/android.widget.EditText")
    public WebElement UserName;
    @FindBy(xpath = "//android.view.View[@text=\"Manali Sanjay More\"]")
    public WebElement EmilyJones;

    @FindBy(xpath = "(//android.widget.TextView[@text=\"\uF229\"])[3]")
    public WebElement Status;

    @FindBy(xpath = "//android.view.View[@resource-id=\"app\"]/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[8]/android.widget.EditText")
    public WebElement Enabled;

    @FindBy(xpath = "//android.view.View[@resource-id=\"app\"]/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[8]/android.widget.EditText")
    public WebElement Username;

    @FindBy(xpath = "//android.view.View[@resource-id=\"app\"]/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[9]/android.view.View[2]/android.widget.EditText")
    public WebElement UserPass;

    @FindBy(xpath = "//android.view.View[@resource-id=\"app\"]/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[11]/android.widget.EditText")
    public WebElement UserconfirmPass;

    @FindBy(className = "android.widget.Button")
    public WebElement SaveButton;





    public void AddUser() {
        addUserButton.click();
        UserRollDropdown.click();
        adminoption.click();
        UserName.sendKeys("Manali Sanjay More");
        EmilyJones.click();
        Status.click();
        Enabled.click();
        Username.sendKeys("JonSmit");
        UserPass.sendKeys("JonSmiT@123#");
        UserconfirmPass.sendKeys("JonSmiT@123#");
        SaveButton.click();
        driver.manage().deleteAllCookies();
    }
}
