package testrunner.transactionreport;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features= {"featurefiles/transactionreport/DailyFeeCollection.feature "}
        ,glue= {"stepdefinitions"}
        ,monochrome=true
        ,plugin= {"pretty","html:target/cucumber_html_report",
        "json:target/cucumber.json",
        "junit:target/cucumber.xml"}
        //,tags= {"@verify_with_filters, @verify_with_no_filters"}
        ,tags= {"@scenario11"}
)
public class DailyFeeCollectionRunner {
}