package com.cucumber.stepdefinitions;

import com.hp.lft.unittesting.UnitTestBase;
import com.hp.lft.verifications.Verify;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.Scenario;
import com.hp.lft.sdk.*;
import com.hp.lft.sdk.web.*;
import com.hp.lft.report.*;

import java.net.URI;
import com.cucumber.leanft.AODWeb;
import java.io.IOException;

/**
 * Created by droukman on 2/22/2017.
 */
public class MessageDraftStepDefinitions {

    AODWeb website;
    Browser browser;


    @Before
    public void beforeScenario(Scenario scenario) throws IOException, GeneralLeanFtException, ReportException {
        //the following will start a new test node in the report
        try {
            ModifiableSDKConfiguration config = new ModifiableSDKConfiguration();
            config.setServerAddress(new URI("ws://localhost:5095"));
            SDK.init(config);
            Reporter.init();
        }
        catch (Exception e) {
        }

        browser = BrowserFactory.launch(BrowserType.CHROME);
        website = new AODWeb(browser);
        Reporter.startTest(scenario.getName());


    }


    @After
    public void afterScenario() throws InterruptedException, ReportException, GeneralLeanFtException {

        Reporter.endTest();

        Reporter.generateReport();
        browser.closeAllTabs();
        SDK.cleanup();
    }

    @Given("^I am on the contact us page$")
    public void i_am_on_the_contact_us_page() throws Throwable {
        browser.navigate("www.advantageonlineshopping.com");
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I enter (\\d+) characters$")
    public void i_enter_characters(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        website.ContactUsSubject().setValue("Test Value");
        //hrow new PendingException();
    }

    @Then("^The full message is entered successfully$")
    public void the_full_message_is_entered_successfully() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
