package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.WebHomePage;

public class comboTest {

	
	 WebDriver driver;
	    WebHomePage home;

	    @Test
	    public void addItemToCartTest() {
	        home.clickcomboProdect();
	        home.clickComboViewDetails();
	        home.clickAddToCart();
	        String actualcomboMsg = home.getSuccessMessageCombo();
	        Assert.assertEquals(actualcomboMsg, "Item Added to cart");
	    }
	    }
