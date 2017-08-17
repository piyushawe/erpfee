package testRunner.globalMastersRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features= {"featureFiles/globalMastersFeatures/DefineMoral.feature "}
        ,glue= {"stepDefinitions"}
        ,monochrome=true
        ,plugin= {"pretty","html:target/cucumber_html_report",
        "json:target/cucumber.json",
        "junit:target/cucumber.xml"}
        //,tags= {"~@scenario4,~@scenario5"}
        ,tags= {"@scenario11"}
)
public class DefineMoralRunner {

}
