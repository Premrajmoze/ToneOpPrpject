package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class demo {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://toneop.care/");
	driver.manage().window().maximize();

	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));

	// Scroll and click first product
	WebElement allProdect = driver.findElement(By.xpath("(//h3[@class='w-20 text-xs  text-black font-arial font-normal text-center'])[1]"));
	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", allProdect);
	wait.until(ExpectedConditions.elementToBeClickable(allProdect));
	allProdect.click();

	// Click product image
	WebElement hairAndSkinImage = wait.until(ExpectedConditions.elementToBeClickable(
	    By.xpath("//img[@alt='biotin-gummies-1']")));
	hairAndSkinImage.click();

	// Click Add to Cart
	WebElement addToCart = wait.until(ExpectedConditions.elementToBeClickable(
	    By.xpath("//button[contains(@class,'px-5') and contains(@class,'rounded-full')]")));
	addToCart.click();

	// Assert success message
	WebElement successmsg = wait.until(ExpectedConditions.visibilityOfElementLocated(
	    By.xpath("//*[text()='Item Added to cart']")));
	String actualsmg = successmsg.getText();
	Assert.assertEquals(actualsmg, "Item Added to cart");
}
}