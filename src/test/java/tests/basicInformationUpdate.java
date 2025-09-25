package tests;

import org.testng.annotations.Test;

import base.mobileAppBasePage;
import pages.myProfilePage;
import utils.ExtentManager;

public class basicInformationUpdate extends mobileAppBasePage {

	 @Test
	    public void verifyBasicInformationUpdate() {
	        ExtentManager.startTest("Verify Basic Information Update");

	        myProfilePage basicInformationPage = new myProfilePage(driver);
	        basicInformationPage.updateBasicInformation("popat moze", "popatmoze@gmail.com");

	        ExtentManager.logPass("Basic Information updated successfully!");
	    }
}
