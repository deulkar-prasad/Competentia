package Runner;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;

import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
features= {"\\SeleniumPrac\\Competentia\\src\\test\\java\\Features\\Login.feature"}, // the path of feature files
glue= {"StepDefination"}, // Path of the step definition files  
plugin= {"pretty","html:test-output", "junit:junit_xml/cucumber.xml"}, // to generate different type of reports
monochrome= true, //display the console output in a proper readable format
strict=true, // True: will fail the execution if there are any undefined or pending steps.
dryRun=true, // if true - checks all the steps have step definition  
tags= {"@Sanity,@Regression"}
)
public class TestRunner {

}
