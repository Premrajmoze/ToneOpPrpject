package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class myProfilePage {
    private AndroidDriver driver;

    public myProfilePage(AndroidDriver driver) {
        this.driver = driver;
    }

    // Location Locators
    private By menuButton = By.className("com.horcrux.svg.PathView");
    private By profileIcon = By.xpath("//android.view.ViewGroup[@content-desc=\"Pop, FREE PLAN, +91-9561838093\"]/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.PathView");
    private By locationIcon = By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView[1]/android.view.ViewGroup/android.view.ViewGroup[1]/com.horcrux.svg.SvgView");
    private By locationInput = By.xpath("//android.widget.EditText[@text=\"Pune, Maharashtra\"]");
    private By selectLocation = By.xpath("//android.widget.TextView[@text=\"Mumbai, Maharashtra, India\"]");
    private By addLocationButton = By.xpath("//android.view.ViewGroup[@content-desc=\"Add Location\"]");
    private By locationUpdatesuccessMsg = By.xpath("//android.widget.TextView[@text=\"Location updated successfully!\"]");
    // BasicLocaters
    private By basicInformationIcon = By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView[1]/android.view.ViewGroup/android.view.ViewGroup[2]/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.PathView");
    private By nameField = By.xpath("//android.widget.EditText[@resource-id=\"text-input-outlined\" and @text=\"pop\"]");
    private By genderIcone = By.xpath("(//android.widget.TextView[@text=\"\"])[1]");
    private By selectGenderOption = By.xpath("//android.widget.TextView[@text=\"Male\"]");
    private By selectBirthDate = By.xpath("//android.widget.EditText[@resource-id=\"text-input-outlined\" and @text=\"2000-01-01\"]");
    private By clickConform = By.xpath("//android.widget.Button[@resource-id=\"android:id/button1\"]");
    private By updateEmail = By.xpath("//android.widget.EditText[@resource-id=\"text-input-outlined\" and @text=\"premrajmoze@gmail.com\"]");
    private By selectDailyActivity = By.xpath("(//android.widget.TextView[@text=\"\"])[2]");
    private By optionDailyActivity = By.xpath("//android.widget.TextView[@text=\"Highly  active\"]");
    private By unitHeight = By.xpath("//android.view.ViewGroup[@content-desc=\"Cm\"]/android.widget.ImageView");
    private By selectCmHeight = By.xpath("//android.widget.TextView[@text=\"Cm\"]");
    private By Height = By.xpath("//android.widget.EditText[@resource-id=\"text-input-outlined\" and @text=\"153\"]");
    private By selectHeigth = By.xpath("//android.widget.TextView[@text=\"155\"]");
    private By updateHeigth = By.xpath("//android.view.ViewGroup[@content-desc=\"Update Height\"]");
    private By unitWieght = By.xpath("//android.view.ViewGroup[@content-desc=\"Kg\"]/android.widget.ImageView");
    private By selectLbsWeight = By.xpath("//android.widget.TextView[@text=\"Lbs\"]");
    private By Weight = By.xpath("(//android.widget.EditText[@resource-id=\"text-input-outlined\"])[6]");
    private By updateWieght = By.xpath("//android.widget.TextView[@text=\"Update Weight\"]");
    private By targetWieght = By.xpath("(//android.widget.EditText[@resource-id=\"text-input-outlined\"])[7]");
    private By updatetargetWieght = By.xpath("//android.widget.TextView[@text=\"Update Weight\"]");
    private By submit = By.xpath("//android.widget.TextView[@text=\"Submit\"]");
    private By dataSetsuccessMsg = By.xpath("//android.widget.TextView[@text=\"Data set successfully!\"]");


    
    // Actions
    public void updateLocation(String newLocation) {
        driver.findElement(menuButton).click();
        driver.findElement(profileIcon).click();
        driver.findElement(locationIcon).click();

        WebElement updateField = driver.findElement(locationInput);
        updateField.clear();
        updateField.sendKeys(newLocation);
        
        driver.findElement(selectLocation).click();
        driver.findElement(addLocationButton).click();

        String actualLocationUpdateMsg = driver.findElement(locationUpdatesuccessMsg).getText();
        Assert.assertEquals(actualLocationUpdateMsg, "Location updated successfully!", "Location update message mismatch!");
    }
    public void updateBasicInformation(String newName,String newEmail) {
        driver.findElement(basicInformationIcon).click();
        WebElement updateName = driver.findElement(nameField);
        updateName.clear();
        updateName.sendKeys(newName);
        driver.findElement(genderIcone).click();
        driver.findElement(selectGenderOption).click();
        driver.findElement(selectBirthDate).click();
        driver.findElement(clickConform).click();
        WebElement email = driver.findElement(updateEmail);
        email.clear();
        email.sendKeys(newEmail);
        driver.findElement(selectDailyActivity).click();
        driver.findElement(optionDailyActivity).click();
        driver.findElement(unitHeight).click();
        driver.findElement(selectCmHeight).click();
        driver.findElement(Height).click();
        driver.findElement(selectHeigth).click();
        driver.findElement(updateHeigth).click();
        driver.findElement(unitWieght).click();
        driver.findElement(selectLbsWeight).click();
        driver.findElement(Weight).click();
        driver.findElement(updateWieght).click();
        driver.findElement(targetWieght).click();
        driver.findElement(updatetargetWieght).click();
        driver.findElement(submit).click();
        String actualDataSetMsg = driver.findElement(dataSetsuccessMsg).getText();
        Assert.assertEquals(actualDataSetMsg, "Data set successfully!", "Data set message mismatch!");
        
    }
}
