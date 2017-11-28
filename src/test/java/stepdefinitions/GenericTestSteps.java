package stepdefinitions;

import automationFramework.supportMethods.ReadFile;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import utilities.EventHandlingUtility;
import webdriver.DriverMethods;

import java.io.File;

public class GenericTestSteps {
    private File file= new File("configuration\\UIMap.properties");
    ReadFile readfile= new ReadFile ();
    DriverMethods dm= new DriverMethods();
    EventHandlingUtility event= new EventHandlingUtility();

    @Given("^for url$")
    public void for_url() throws Throwable {
       dm.getUrl(readfile.readProperty(file, "url"));
    }

    @When("^user enter username and password$")
    public void user_enter_username_and_password() throws Throwable {
        event.enterText(readfile.getElement(file,"username"), readfile.readProperty(file,"login"));
        event.enterText(readfile.getElement(file, "password"), readfile.readProperty(file,"pwd"));
    }

    @When("^click sign in to open erp home page$")
    public void click_sign_in_to_open_erp_home_page() throws Throwable {
        event.click(readfile.getElement(file,"signin"));
    }

    @Then("^user click fee manager logo$")
    public void user_click_fee_manager_logo() throws Throwable {
        event.click(readfile.getElement(file,"feemanagerlogo"));
        dm.waitImplicitly(50);
    }
}
