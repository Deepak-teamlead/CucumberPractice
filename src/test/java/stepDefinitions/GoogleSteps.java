package stepDefinitions;
import io.cucumber.java.en.*;
import pageObjects.PF_GoogleObjects;

public class GoogleSteps {
    PF_GoogleObjects obj=new PF_GoogleObjects();
    @Given("I launch browser and open google url")
    public void i_launch_browser_and_open_google_url() throws Exception {
      obj.launchGoogle();
    }
    @When("I search for iphone")
    public void i_search_for_iphone() {
      obj.searchIphone();
    }
    @Then("I verify page title")
    public void i_verify_page_title() {
      obj.verifyTitle();
    }


}
