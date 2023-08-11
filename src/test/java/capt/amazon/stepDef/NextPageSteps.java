package capt.amazon.stepDef;

import capt.amazon.pageActions.NextPageActions;
import cucumber.api.java.en.And;

public class NextPageSteps {
	NextPageActions NextPageActionsObj=new NextPageActions();
	@And("^click on first book$")
	public void click_on_first_book() throws Throwable {
		NextPageActionsObj.displayclick();
	}
	
}
