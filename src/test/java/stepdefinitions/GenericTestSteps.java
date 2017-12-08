package stepdefinitions;

import automationFramework.supportMethods.ReadFile;
import automationFramework.supportMethods.UIMap;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.EventHandlingUtility;
import webdriver.DriverMethods;

import java.io.File;
import java.io.IOException;

import static webdriver.AppDriver.driver;

public class GenericTestSteps {
    private File file = new File("configuration\\UIMap.properties");
    ReadFile readfile = new ReadFile();
    DriverMethods dm = new DriverMethods();
    EventHandlingUtility event = new EventHandlingUtility();
    UIMap uimap = new UIMap();

    public GenericTestSteps() throws IOException {
    }

    @Given("^for url$")
    public void for_url() throws Throwable {
        dm.getUrl(readfile.readProperty(file, "url"));
    }

    @When("^user enter username and password$")
    public void user_enter_username_and_password() throws Throwable {
        event.enterText(uimap.username, readfile.readProperty(file, "login"));
        //event.enterText(readfile.getElement(file, "username"), readfile.readProperty(file, "login"));
        event.enterText(readfile.getElement(file, "password"), readfile.readProperty(file, "pwd"));
    }

    @When("^click sign in to open erp home page$")
    public void click_sign_in_to_open_erp_home_page() throws Throwable {
        event.click(readfile.getElement(file, "signin"));
    }

    @Then("^user click fee manager logo$")
    public void user_click_fee_manager_logo() throws Throwable {
        try {
            if (event.isElementDisplayed(readfile.getElement(file, "feemanagerlogo")))
                event.click(readfile.getElement(file, "feemanagerlogo"));
        } catch (Exception e) {
            if (event.isElementDisplayed(readfile.getElement(file, "feemanagerlogoo")))
                event.click(readfile.getElement(file, "feemanagerlogoo"));
            dm.switchToWindow(1);
        }
    }
}