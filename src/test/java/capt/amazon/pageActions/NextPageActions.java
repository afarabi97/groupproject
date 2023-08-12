package capt.amazon.pageActions;

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

NextPageLocatorsObj.clkdis.click();
			
			}
		
}
