package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utilities.Baseclass;
public class PF_LoginpageObjects  extends Baseclass {
    public PF_LoginpageObjects(){
        this.driver=getDriverInstance();
    }
    public void launchapp() throws Exception {
       browserAndUrl("chrome","https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    public void enterusername() throws Exception {
        Thread.sleep(1000);
        WebElement username=driver.findElement(By.xpath("//input[@placeholder='Username']"));
        username.sendKeys("Admin");
    }
    public void enterpassword()throws Exception{
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
    }
    public void clicklogin(){
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }
    public void validateloginpage() throws Exception {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//h6[normalize-space()='Dashboard']")).isDisplayed();
        closedriver();
    }
    public void invalidusername() throws Exception{
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin1");
    }
    public void verifyerrormessage()throws Exception{
        Thread.sleep(2000);
        driver.findElement(By.xpath("//p[normalize-space()='Invalid credentials']")).isDisplayed();
        closedriver();
    }

}
