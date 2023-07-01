package pageObjects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.Baseclass;
public class LoginpageObjects extends Baseclass {

    public void loginapplication() throws Exception {
  browserAndUrl("chrome","https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
 }
 @FindBy(xpath="//input[@placeholder='Username']") WebElement username;
 public void enterusername() throws Exception {
  Thread.sleep(2000);
  username.sendKeys("Admin");
  driver.close();

 }
	

}
