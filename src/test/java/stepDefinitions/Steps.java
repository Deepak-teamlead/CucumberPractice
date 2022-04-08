package stepDefinitions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import cucumber.api.java.en.*;
import pageObjects.Loginpage_objects;
public class Steps {
	public WebDriver driver;
	public Loginpage_objects lp;
	
	@Given("user launches chrome browser")
	public void user_launches_chrome_browser() {
		System.setProperty("webdriver.chrome.driver", "D:\\Deepak files\\Hybrid Framework Qshore\\Jars or Dependencies\\chromedriver.exe");
		driver=new ChromeDriver();   
		lp=new Loginpage_objects(driver);
	}

	@When("user opens url {string}")
	public void user_opens_url(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}

	@When("user enters username as {string} and password as {string}")
	public void user_enters_username_as_and_password_as(String username, String password) throws Exception {
	    lp.enterusername(username);
	    lp.enterpassword(password);
	}

	@When("clicks on login button")
	public void clicks_on_login_button() throws Exception {
	    lp.clicklogin();
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String title) {
	  String realtitle = driver.getTitle();
	  if(realtitle == "Welcome to Admin Panel - Thumbpin")
		  System.out.println("Correct Title Test Passed");
	  else
		  System.out.println("Wrong Title Test Failed");
	}

	@When("user clicks on logout link")
	public void user_clicks_on_logout_link() throws Exception {
		Actions a=new Actions(driver);
		WebElement hiadmin = driver.findElement(By.xpath("//span[contains(text(),'Hi, admin')]"));
	    a.moveToElement(hiadmin).build().perform();
	    lp.clicklogout();
	}
	@Then("close browser")
	public void close_browser() {
	   driver.close();
	}

	
	
	
	
	
}
