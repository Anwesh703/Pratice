package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
//tags="@regressionTest and @smokeTest"
@CucumberOptions(
		features = "src/test/java/features",
		glue="stepDefinations",tags="@DTETest",dryRun=true,monochrome=true,
		plugin={"pretty","html:target/cucumber.html","json:target/cucumber.json","junit:target/cukes.xml"}
		)
public class TestNGTestRunner extends AbstractTestNGCucumberTests{

}
