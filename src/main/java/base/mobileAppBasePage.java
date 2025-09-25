package base;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import java.net.URL;
import java.time.Duration;

public class mobileAppBasePage {
    protected AndroidDriver driver;

    @BeforeClass
    public void setup() throws Exception {
    	DesiredCapabilities capablity = new DesiredCapabilities();
    	capablity.setCapability("platformName", "Android");
    	capablity.setCapability("appium:deviceName", "IZ7LOROF4TRGUWCY");
    	capablity.setCapability("appium:platformVersion", "14.0");
    	capablity.setCapability("appium:automationName", "UiAutomator2");
    	capablity.setCapability("appium:noReset", true);
    	capablity.setCapability("appium:ignoreHiddenApiPolicyError", true);
    	capablity.setCapability("appium:appPackage", "com.toneop.mobile");
    	capablity.setCapability("appium:appActivity", "com.toneop.mobile.MainActivity");
        
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"), capablity);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        System.out.println("Application started successfully.");
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
