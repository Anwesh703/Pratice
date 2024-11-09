package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features",
		glue="stepDefinations",stepNotifications = true,
		tags="@Dtest",dryRun=true,monochrome=true,
		plugin={"pretty","html:target/cucumber.html","json:target/cucumber.json","junit:target/cukes.xml"})
//tags="@regressionTest or smokeTest" or tags="@regressionTest,smokeTest"- here both regrssionTest and Smoke Test tags will be executed
//tags="@regressionTest and smokeTest" - here only test case having both regressionTest and smoke test tags will be picked
//tags="not @sanityTest" - here everyTest cases run expect sanityTest related tags one
public class TestRunner {

}
