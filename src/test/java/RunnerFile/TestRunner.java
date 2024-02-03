package RunnerFile;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/FeatureFiles",
                 glue= {"StepDefinations"},
                 monochrome=true, publish=true,
                 tags="@Regression or @Smoke",plugin= {"pretty","html:target/Cucumber.html","json:target/Cucumber.json"
		        ,"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})

public class TestRunner extends AbstractTestNGCucumberTests {

}
