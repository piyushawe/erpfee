package testRunner.transactionReportsRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features= {"featureFiles/transactionReportsFeatures/ReceiptWiseFeeTypeCollection"}
        ,glue= {"stepDefinitions"}
        ,monochrome=true
        ,plugin= {"pretty","html:target/cucumber_html_report",
        "json:target/cucumber.json",
        "junit:target/cucumber.xml"}
        ,tags= {"@scenario6"}
)
public class ReceiptWiseFeeTypeCollectionRunner {
}
