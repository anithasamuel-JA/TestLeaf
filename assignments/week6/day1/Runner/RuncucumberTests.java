package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		dryRun=false,
		features= {"src/test/java/Features/DeleteLead.feature"},
		glue= {"StepDefinition"},
		monochrome=true
		
		)

public class RunCucumberTests extends AbstractTestNGCucumberTests{

}
