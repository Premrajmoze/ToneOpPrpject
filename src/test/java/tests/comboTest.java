package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.WebHomePage;
import utils.ExtentManager;

public class comboTest {

	
	 WebDriver driver;
	    WebHomePage home;

	    @Test
	    public void addItemToCartTest() {
	    	ExtentManager.startTest("Verify Combo Test");
	        home.clickcomboProdect();
	        home.clickComboViewDetails();
	        home.clickAddToCart();
	        String actualcomboMsg = home.getSuccessMessageCombo();
	        Assert.assertEquals(actualcomboMsg, "Item Added to cart");
	        
	        ExtentManager.logPass("Item Added to Cart successfully");
	    }
	    }
