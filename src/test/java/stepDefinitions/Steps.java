package stepDefinitions;
import io.cucumber.java.en.*;
import pageObjects.PF_LoginpageObjects;
public class Steps {
    PF_LoginpageObjects obj=new PF_LoginpageObjects();
    @Given("I launch browser and open application url")
    public void i_open_application_url() throws Exception {
      obj.launchapp();
    }
    @When("^I enter (.+) in the username field$")
    public void i_enter_username(String uname) throws Exception {
      obj.enterusername(uname);
    }
    @When("^I enter (.+) in the password field$")
    public void i_enter_password(String pwd)  {
      obj.enterpassword(pwd);
    }
    @When("I click on login button")
    public void i_click_login() {
      obj.clicklogin();
    }
    @Then("I navigate successfully to login page")
    public void i_navigate_to_login_page() throws Exception {
       obj.validateloginpage();
    }
    //
    @Then("I verify error message")
    public void i_verify_error_message() throws Exception {
     obj.verifyerrormessage();
    }



}
