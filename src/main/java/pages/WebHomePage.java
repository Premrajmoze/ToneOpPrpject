package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import base.WebBasePage;

public class WebHomePage extends WebBasePage {


	public WebHomePage(WebDriver driver) {
        super(driver);
    }

    // Locators
    private By firstProduct = By.xpath("(//h3[@class='w-20 text-xs  text-black font-arial font-normal text-center'])[1]");
    private By productImage = By.xpath("//img[@alt='biotin-gummies-1']");
    private By addToCartBtn = By.xpath("//button[contains(@class,'px-5') and contains(@class,'rounded-full')]");
    private By successMsg = By.xpath("//*[text()='Item Added to cart']");
    
    private By combo = By.xpath("(//h3[@class='w-20 text-xs  text-black font-arial font-normal text-center'])[2]");
    private By comboViewDetails = By.xpath("(//button[@class='transform overflow-hidden  duration-200 hover:scale-105 shadow-md px-5  capitalize min-w-max  bg-[#27A2C6] text-white py-1 px-2 md:py-2 md:px-4 font-arial font-semibold text-sm md:text-base mt-2 capitalize rounded flex items-center justify-center gap-2'])[1]");
    private By comboAddToCart = By.xpath("(//button[@class='transform overflow-hidden  duration-200 hover:scale-105 shadow-md px-5  capitalize rounded-full bg-[white] border-[#27A2C6] text-[#27A2C6]   flex items-center justify-center font-arial font-semibold border  py-3 w-full md:w-64 text-xl flex items-center justify-center gap-2'])[1]");
    private By comboSuccessMsg = By.xpath("(//*[text()='Item Added to cart'])[1]");
    
    private By dailyFitness = By.xpath("(//h3[@class='w-20 text-xs  text-black font-arial font-normal text-center'])[3]");
    private By ova360BuyProduct = By.xpath("(//button[@class='transform overflow-hidden  duration-200 hover:scale-105 shadow-md px-5  capitalize min-w-max bg-[#27A2C6] text-white py-1 md:py-2 px-1 md:px-4   font-arial font-semibold text-xs md:text-sm mt-2 capitalize rounded flex items-center justify-center gap-2'])[1]");
    private By ovaImageProduct = By.xpath("//img[@alt='ova_360_sachet']");
    private By ovaAddToCart = By.xpath("//button[@class='transform overflow-hidden  duration-200 hover:scale-105 shadow-md px-5  capitalize rounded-full  bg-[white] border-[#27A2C6] text-[#27A2C6] flex items-center justify-center font-arial font-semibold border  py-2 w-full md:w-64  text-lg md:text-xl flex items-center justify-center gap-2']");
    private By ovaSuccessMsg = By.xpath("(//*[text()='Item Added to cart'])[2]");
    
    // Actions
    public void clickFirstProduct() {
        clickElement(driver.findElement(firstProduct));
    }

    public void clickProductImage() {
        clickElement(driver.findElement(productImage));
    }

    public void clickAddToCart() {
        clickElement(driver.findElement(addToCartBtn));
    }

    public String getSuccessMessage() {
        return getText(driver.findElement(successMsg));
    }
    public void clickcomboProdect() {
    	clickElement(driver.findElement(combo));
    }
    public void clickComboViewDetails() {
    	clickElement(driver.findElement(comboViewDetails));
    }
    public void clickComboAddToCart() {
    	clickElement(driver.findElement(comboAddToCart));
    }
    public String getSuccessMessageCombo() {
        return getText(driver.findElement(comboSuccessMsg));
    }
    public void clickDailyFitness() {
    	clickElement(driver.findElement(dailyFitness));
    }
    public void clickOva360BuyProduct() {
    	clickElement(driver.findElement(ova360BuyProduct));
    }
    public void clickOvaImageProduct() {
    	clickElement(driver.findElement(ovaImageProduct));
    }
    public void clickOvaAddToCart() {
    	clickElement(driver.findElement(ovaAddToCart));
    }
    public String getSuccessMessageOva() {
        return getText(driver.findElement(ovaSuccessMsg));
    }
}
