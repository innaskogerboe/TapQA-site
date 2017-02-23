package cucumber.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.PendingException;

import cucumber.pages.SearchPage;
import cucumber.support.Hooks;

public class SearchSteps {

	private SearchPage page;

	public SearchSteps(Hooks hooks) {
		page = new SearchPage(hooks.getDriver());
	}



	@When("^I search for \"([^\"]*)\"$")
	public void i_search_for(String target) throws Throwable {
		page.searchFor(target);
	}

	@When("^select \"([^\"]*)\" in the search results$")
	public void select_in_the_search_results(String expResult) throws Throwable {
		page.selectResult(expResult);
	}

}


