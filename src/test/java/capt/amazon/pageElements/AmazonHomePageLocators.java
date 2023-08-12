package capt.amazon.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonHomePageLocators {

	//Click on Search Amazon Text box
	@FindBy (xpath = "//input[@aria-label='Search Amazon']")
	public WebElement txtbxSearch;
	
	//click on search logo
	@FindBy (xpath="//input[@type='submit']")
	public WebElement btnSubmit;
	
	@FindBy(xpath="//a[@id='nav-hamburger-menu']")
	public WebElement clkbr;
	@FindBy(xpath="//a[@data-ref-tag=\"nav_em_1_1_1_17\"]/div[1]")
	public WebElement clkbk;
	
	@FindBy(xpath="(//a[contains(text(), 'Audible Books')])[2]")
	public WebElement clkaudb;
	
	
}
