package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

/* 
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 */


@RunWith(Cucumber.class)
@CucumberOptions(features="Features", glue= {"StepDefinition"})


public class Runner {

}
