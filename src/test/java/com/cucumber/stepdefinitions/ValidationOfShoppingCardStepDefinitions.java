package com.cucumber.stepdefinitions;

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
import junit.framework.Assert;

import java.io.IOException;
import java.net.URI;
import java.awt.Point;

import java.util.concurrent.TimeUnit;

/**
 * Created by droukman on 2/24/2017.
 */
public class ValidationOfShoppingCardStepDefinitions {

    Browser browser;
    int itemCount;

    @Before
    public void BeforeScenario() throws IOException, GeneralLeanFtException, ReportException{
        try {


            ModifiableSDKConfiguration config = new ModifiableSDKConfiguration();
            config.setServerAddress(new URI("ws://localhost:5095"));
            SDK.init(config);
            Reporter.init();

        }
        catch(Exception e){
            Reporter.reportEvent("SDK Initialization", e.getMessage(),Status.Failed);
        }

        browser = BrowserFactory.launch(BrowserType.CHROME);

    }



    @After
    public void AfterScenario() throws ReportException, GeneralLeanFtException {
        Reporter.generateReport();
        SDK.cleanup();
    }

    @Given("^Store Catalogue Items have been added to the shopping cart$")
    public void store_Catalogue_Items_have_been_added_to_the_shopping_cart() throws Throwable {

        browser.navigate("http://advantageonlineshopping.com/");
        browser.describe(WebElement.class, new WebElementDescription.Builder()
                .tagName("SPAN").innerHTML("TABLETS").innerText("TABLETS").build()).click();
        browser.describe(WebElement.class, new WebElementDescription.Builder()
                .tagName("A").innerText("HP Elite x2 1011 G1 Tablet").build()).click();
        browser.describe(Button.class, new ButtonDescription.Builder()
                .buttonType("submit").tagName("BUTTON").name("ADD TO CART").build()).click();


    }

    @When("^A mouse is hovered over the shopping cart$")
    public void a_mouse_is_hovered_over_the_shopping_cart() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

        browser.describe(WebElement.class, new WebElementDescription.Builder()
                .tagName("HEADER").build()).click(new ClickArgs(MouseButton.LEFT, new Location(Position.TOP_RIGHT, new Point(1870,20))));
        browser.describe(WebElement.class, new WebElementDescription.Builder()
                .tagName("HEADER").build()).click(new ClickArgs(MouseButton.LEFT, new Location(Position.TOP_RIGHT, new Point(1860,30))));


    }

    @Then("^The contents and total price is displayed$")
    public void the_contents_and_total_price_is_displayed() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        String total =  browser.describe(WebElement.class, new WebElementDescription.Builder()
                .className("roboto-medium ng-binding").tagName("SPAN").innerText(new RegExpProperty("\\$.*")).build()).getDisplayName();
        Assert.assertEquals("$2,123", total);
        browser.closeAllTabs();
    }
}