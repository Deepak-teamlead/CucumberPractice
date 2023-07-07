package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import utilities.Baseclass;

public class PF_GoogleObjects extends Baseclass {
    public void launchGoogle() throws Exception {
        browserAndUrl("chrome", "https://www.google.co.in/");
    }

    public void searchIphone() {
        driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("iphone", Keys.ENTER);
    }

    public void verifyTitle() {
        Assert.assertTrue(driver.getTitle().contains("iphone"));
        driver.close();
    }
}


