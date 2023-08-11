package capt.amazon.pageActions;

import org.openqa.selenium.support.PageFactory;

import capt.amazon.pageElements.ThirdPageLocators;
import capt.utilities.SetupDrivers;

public class ThirdPageAction {
ThirdPageLocators ThirdPageLocatrosObj;
public ThirdPageAction() {
ThirdPageLocatrosObj=new ThirdPageLocators();
PageFactory.initElements(SetupDrivers.driver, ThirdPageLocatrosObj );
}
public void DisplayPurchase() {
	
	ThirdPageLocatrosObj.displ.isEnabled();
	ThirdPageLocatrosObj.displ.isDisplayed();
}
}
