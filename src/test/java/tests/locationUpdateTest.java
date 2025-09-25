package tests;

import org.testng.annotations.Test;

import base.mobileAppBasePage;
import pages.myProfilePage;
import utils.ExtentManager;

public class locationUpdateTest extends mobileAppBasePage {

    @Test
    public void verifyLocationUpdate() {
        ExtentManager.startTest("Verify Location Update");

        myProfilePage locationPage = new myProfilePage(driver);
        locationPage.updateLocation("Mumbai, Maharashtra, India");

        ExtentManager.logPass("Location updated successfully!");
    }
}
