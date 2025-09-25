package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.WebHomePage;

public class dailyFitnessTest {

	 WebDriver driver;
	    WebHomePage home;

	    @Test
	    public void addItemToCartTest() {
	        home.clickDailyFitness();
	        home.clickOva360BuyProduct();
	        home.clickOvaImageProduct();
	        home.clickOvaAddToCart();
	        String actualOvaMsg = home.getSuccessMessageOva();
	        Assert.assertEquals(actualOvaMsg, "Item Added to cart");
	    }
	    }
