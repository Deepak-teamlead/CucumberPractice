package pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Loginpage_objects {
	
public WebDriver ldriver;

public Loginpage_objects(WebDriver rdriver) {
	ldriver=rdriver;
	PageFactory.initElements(rdriver,this);
}
	
//Pageobject class for Login page
@FindBy(xpath="//body/div[3]/div[2]/form[1]/div[1]/div[1]/input[1]") WebElement webusername;
@FindBy(xpath="//body/div[3]/div[2]/form[1]/div[2]/div[1]/input[1]") WebElement webpassword;
@FindBy(xpath="//body/div[3]/div[2]/form[1]/div[3]/button[1]") WebElement webloginbutton;
@FindBy(xpath="//body/div[2]/div[1]/ul[1]/li[1]/ul[1]/li[2]/a[1]") WebElement weblogoutlink;
//********************************    
public void enterusername(String uname) throws Exception {
	   webusername.clear();
	   Thread.sleep(1000);
	   webusername.sendKeys(uname);
	}
public void enterpassword(String pwd) throws Exception {
	webpassword.clear();
	 Thread.sleep(1000);
	webpassword.sendKeys(pwd);
	}	
public void clicklogin() throws Exception{
	 Thread.sleep(1000);
	webloginbutton.click();
}
public void clicklogout() throws Exception{
	Thread.sleep(1000);
	weblogoutlink.click();
}	
}
