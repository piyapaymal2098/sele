package Base;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;

public class baseClass {


    public static AndroidDriver driver;
    //public Utility utility;
   // public static Logger log = Logger.getLogger(BaseClass.class.getName());

    @BeforeClass
    public void emulatorSetup() throws MalformedURLException, URISyntaxException, InterruptedException, MalformedURLException {
        //Properties props = System.getProperties();
//        System.out.println("Current working directory is " + props.getProperty("user.dir"));
   //     PropertyConfigurator.configure(props.getProperty("user.dir")+ "\\src\\main\\resources\\files\\log4j.properties");

//        C:\Users\Qapitol\IdeaProjects\Calculator_automation\src\main\resources\properties\log4j.properties

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "ANDROID");
        caps.setCapability("platformVersion", "15");
        caps.setCapability("deviceName", "Pixel8a");
        caps.setCapability("automationName", "UIAutomator2");
        caps.setCapability("autoGrantPermissions", true);
        caps.setCapability("appPackage", "com.android.chrome");
        caps.setCapability("appActivity", "com.google.android.apps.chrome.IntentDispatcher");
        caps.setCapability("ignoreHiddenApiPolicyError", "true");
        caps.setCapability("noReset", "true");
        caps.setCapability("blockThirdPartyCookies", "true");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
        //driver.get("");
       // log.info("Initializing Appium Driver...");
    }

    @AfterClass
    public void closeDriver() {
        if (driver != null) {
            driver.quit();
           // log.info("Terminating Appium Driver...");
        }
    }

}
