package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions( 
		
		features=".//FeatureFiles//hooks.feature",
		glue= "stepDefination",
		
		//dryRun = true,
		monochrome = true,
		strict=true,
		plugin= {"pretty","html:target"}
		//tags= {"@RegressionTest,@End2EndTest"}
		)
public class TestRunner  {

}
