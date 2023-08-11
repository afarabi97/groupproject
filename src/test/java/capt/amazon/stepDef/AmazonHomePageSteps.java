package capt.amazon.stepDef;

import capt.amazon.pageActions.AmazonHomePageActions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class AmazonHomePageSteps {

	AmazonHomePageActions AmazonHomePageActionsObj = new AmazonHomePageActions();
		
	@Given("^Open Amazon Homepage$")
	public void open_Amazon_Homepage() throws Throwable {
		
	}

	@Given("^Search for \"([^\"]*)\"$")
	public void search_for(String items) throws Throwable {
		AmazonHomePageActionsObj.searchItems(items);
	}
	@When("^click on All bars$")
	public void click_on_All_bars() throws Throwable {
		AmazonHomePageActionsObj.ClickBars();
	}

	@When("^click on books through shop by department$")
	public void click_on_books_through_shop_by_department() throws Throwable {
		AmazonHomePageActionsObj.ClickBook();
	}

	@When("^click on Audible books &originals$")
	public void click_on_Audible_books_originals() throws Throwable {
		AmazonHomePageActionsObj.ClickAudible();
	}
		
	
		
			
}