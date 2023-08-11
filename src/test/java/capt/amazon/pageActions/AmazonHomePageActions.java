package capt.amazon.pageActions;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import capt.amazon.pageElements.AmazonHomePageLocators;
import capt.utilities.SetupDrivers;

public class AmazonHomePageActions {
	
	AmazonHomePageLocators AmazonHomePageLocatorsObj;
	
	public AmazonHomePageActions(){
		AmazonHomePageLocatorsObj = new AmazonHomePageLocators();
		PageFactory.initElements(SetupDrivers.driver, AmazonHomePageLocatorsObj);
		}
	
	public void searchItems(String items) throws Exception{
		AmazonHomePageLocatorsObj.txtbxSearch.sendKeys(items);
		Thread.sleep(3000);
		AmazonHomePageLocatorsObj.btnSubmit.click();
		Thread.sleep(3000);
	}
	public void ClickBars() {
		
		AmazonHomePageLocatorsObj.clkbr.click();
	}
	public void ClickBook() throws Exception{
		
		Actions actions = new Actions(SetupDrivers.driver);
		actions.moveToElement(AmazonHomePageLocatorsObj.clkbk).click().build().perform();
	}
		
		
	
	public void ClickAudible() throws Exception{
		Thread.sleep(3000);
		Actions actions = new Actions(SetupDrivers.driver);
		actions.moveToElement(AmazonHomePageLocatorsObj.clkaudb).click().build().perform();
        Thread.sleep(3000);
	}
}
