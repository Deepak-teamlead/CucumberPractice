package stepDefinitions;
import io.cucumber.java.en.*;
import pageObjects.PF_LoginpageObjects;
import utilities.Baseclass;
public class Steps extends Baseclass  {
    // creating constructor to call Baseclass driver instance
    public Steps(){
        this.driver=getDriverInstance();
    }
    PF_LoginpageObjects obj=new PF_LoginpageObjects();
    @Given("I launch browser and open application url")
    public void i_open_application_url() throws Exception {
      obj.launchapp();
    }
    @When("I enter username in the username field")
    public void i_enter_username() throws Exception {
      obj.enterusername();
    }
    @When("I enter password in the password field")
    public void i_enter_password() throws Exception {
      obj.enterpassword();
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
    @When("I enter invalid username in the username field")
    public void i_enter_invalid_username() throws Exception {
       obj.invalidusername();
    }

    @Then("I verify error message")
    public void i_verify_error_message() throws Exception {
     obj.verifyerrormessage();
    }



}
