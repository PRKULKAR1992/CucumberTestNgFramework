package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {".\\src\\main\\resources\\Features"},glue = {"StepDefination"},
        plugin= {"pretty","html:target/htmlreport.html"},
        tags= "@UI",dryRun = false,monochrome = true)
public class TestRunner extends AbstractTestNGCucumberTests {
}
