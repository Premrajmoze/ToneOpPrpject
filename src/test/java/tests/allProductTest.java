package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.WebHomePage;
import utils.ExtentManager;

public class allProductTest {

    WebDriver driver;
    WebHomePage home;


    @Test
    public void addItemToCartTest() {
    	ExtentManager.startTest("Verify All Product Test");
        home.clickFirstProduct();
        home.clickProductImage();
        home.clickAddToCart();

        String actualMsg = home.getSuccessMessage();
        Assert.assertEquals(actualMsg, "Item Added to cart");
        ExtentManager.logPass("Item Added to cart Successfully");
    }
    }
