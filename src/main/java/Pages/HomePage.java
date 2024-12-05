package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    AppiumDriver driver;

    public HomePage(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//android.widget.TextView[@text=\"\uF479\"]")
    public WebElement MenuBar;

    @FindBy(xpath = "//android.view.View[@content-desc=\"Admin\"]")
    public WebElement AdminButton;



    public void adminOption(){
        MenuBar.click();
        AdminButton.click();

    }
}
