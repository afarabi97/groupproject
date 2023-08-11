package capt.amazon.stepDef;

import capt.amazon.pageActions.ThirdPageAction;
import cucumber.api.java.en.Then;

public class ThirdPageSteps {
	
	ThirdPageAction ThirdPageActionObj=new ThirdPageAction();
	
	@Then("^User should get an option to purchase$")
	public void user_should_get_an_option_to_purchase() throws Throwable {
		ThirdPageActionObj.DisplayPurchase();
	}
}
