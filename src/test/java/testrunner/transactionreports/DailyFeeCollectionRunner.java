package testrunner.transactionreports;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features= {"featurefiles/transactionreports/DailyFeeCollection.feature "}
        ,glue= {"stepdefinitions"}
        ,monochrome=true
        ,plugin= {"pretty","html:target/cucumber_html_report",
        "json:target/cucumber.json",
        "junit:target/cucumber.xml"}
        //,tags= {"@verify_with_filters, @verify_with_no_filters"}
        ,tags= {"@scenario7"}
)
public class DailyFeeCollectionRunner {
}
