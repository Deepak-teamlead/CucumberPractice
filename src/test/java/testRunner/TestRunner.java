package testRunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;


@CucumberOptions(features = "src\\test\\Features",
                  glue= {"stepDefinitions","hooks"},
                  plugin={"pretty","html:test-output/CucumberReports/CucumberReport.html"},
                 monochrome=true,
                  dryRun=false,
                  tags= "@All")


public class TestRunner extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
