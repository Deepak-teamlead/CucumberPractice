package testRunner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import stepDefinitions.Steps;
@RunWith(Cucumber.class)
@CucumberOptions(features = "./Features/Login.feature",
                  glue= {"Steps","hooks"},
                  plugin={"pretty","html:test-output/CucumberReports/CucumberReport.html"},
                 monochrome=true,
                  dryRun=false,
                  tags= "@Reression")


public class TestRunner {


}
