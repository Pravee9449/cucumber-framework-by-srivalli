package runnerClasses;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
//Praveen just to see it is updated or not
@RunWith(Cucumber.class)
@CucumberOptions(features="./src/test/resources/Features/Vtiger.feature",glue="stepDefinition")
public class VtigerLoginTestRunner {
	
	

}
