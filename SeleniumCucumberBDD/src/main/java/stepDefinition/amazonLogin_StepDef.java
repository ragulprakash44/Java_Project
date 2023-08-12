package stepDefinition;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.ast.DataTable;
public class amazonLogin_StepDef {





	@Given("^I want to Launch a webdriver and navigate to AmazonURL$")
	public void i_want_to_launch_a_webdriver_and_navigate_to_amazon_url() throws InterruptedException {

	}

	@When("^Click on search option button$")
	public void click_on_search_option_button() throws InterruptedException {

	}

	@When("^enter product name in search box$")
	public void enter_product_name_in_search_box() throws InterruptedException {

	}
	
	@When("^enter product \"([^\"]*)\" in search box$")
	public void enter_product_name_in_search_box1(DataTable table)  {

	}


	@Then("^I want to exit the webdriver$")
	public void i_want_to_exit_the_webdriver() throws InterruptedException {

	}

}

