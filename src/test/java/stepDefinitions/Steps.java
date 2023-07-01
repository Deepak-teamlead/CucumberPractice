package stepDefinitions;
import io.cucumber.java.en.*;
import pageObjects.LoginpageObjects;
public class Steps {
    LoginpageObjects obj=new LoginpageObjects();
    @Given("I launch browser and open application url")
    public void i_open_application_url() throws Exception {
        obj.loginapplication();
    }
    @When("I enter username in username field")
    public void i_enter_username() {
        obj.enterusername();
    }
    @When("I enter password in password field")
    public void i_enter_password() {

    }
    @When("I click on login button")
    public void i_click_on_login() {

    }
    @Then("I navigate susscesfuly to login page")
    public void i_navigate_to_login_page() {

    }



}
