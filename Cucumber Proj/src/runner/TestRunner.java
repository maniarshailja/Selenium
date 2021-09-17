package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Feature",glue= {"stepDefinition"},tags={"@smoke"},plugin= {"pretty","junit:junitrepo/junitreport"},monochrome=true)
public class TestRunner {

}
