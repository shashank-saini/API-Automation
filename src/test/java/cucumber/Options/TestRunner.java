package cucumber.Options;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.CucumberOptions.*;
import cucumber.api.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(features="/var/jenkins_home/workspace/API-Automation/src/test/java/features",plugin ="json:target/jsonReports/cucumber-report.json",glue= {"stepDefinations"})
public class TestRunner {

}
