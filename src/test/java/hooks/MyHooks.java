package hooks;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import utilities.Baseclass;
public class MyHooks extends Baseclass {
    @Before
    public void setup() throws Exception {
        System.out.println("This is Before hook-runs before every scenario");
       launchBrowser("chrome");
    }
    @After
    public void teardown(){
        System.out.println("This is After hook-runs after every scenario");
        quitBrowser();
    }
}
