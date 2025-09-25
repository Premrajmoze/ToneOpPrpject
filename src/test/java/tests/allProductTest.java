package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.WebHomePage;

public class allProductTest {

    WebDriver driver;
    WebHomePage home;


    @Test
    public void addItemToCartTest() {
        home.clickFirstProduct();
        home.clickProductImage();
        home.clickAddToCart();

        String actualMsg = home.getSuccessMessage();
        Assert.assertEquals(actualMsg, "Item Added to cart");
    }
    }
