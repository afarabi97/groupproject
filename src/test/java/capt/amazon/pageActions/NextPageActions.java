package capt.amazon.pageActions;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import capt.amazon.pageElements.NextPageLocators;
import capt.utilities.SetupDrivers;

public class NextPageActions {
NextPageLocators NextPageLocatorsObj;

public NextPageActions(){

	NextPageLocatorsObj=new NextPageLocators();
	PageFactory.initElements(SetupDrivers.driver, NextPageLocatorsObj);
	
}
	public void displayclick() throws Exception{
		Thread.sleep(3000);
		Actions action=new Actions(SetupDrivers.driver);
		action.moveToElement(NextPageLocatorsObj.clkdis).click().build().perform();
		Thread.sleep(3000);
}
}