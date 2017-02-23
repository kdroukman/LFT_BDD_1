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
import com.hp.lft.sdk.mobile.*;
import com.hp.lft.report.*;

import java.io.IOException;
import java.net.URI;

import com.cucumber.leanft.AOBAndroid;

/**
 * Created by droukman on 10/5/2016.
 */
public class AOBMobileTransferStepDefinitions {

    private AOBAndroid aobAndroidModel;
    private Device myDevice;
    private int savingsBalanceBefore;
    private int checkingBalanceBefore;
    private int savingsBalanceAfter;
    private int checkingBalanceAfter;

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

     /*   myDevice = MobileLab.lockDeviceById("656e674a");
        aobAndroidModel = new AOBAndroid(myDevice);
        aobAndroidModel.AdvantageApplication().restart();
        Reporter.startTest(scenario.getName());*/


    }


    @After
    public void afterScenario() throws InterruptedException, ReportException, GeneralLeanFtException {

        Reporter.endTest();

        Reporter.generateReport();
       // myDevice.unlock();
        SDK.cleanup();
    }

    @Given("^I have logged into Mobile Banking$")
    public void i_have_logged_into_Mobile_Banking() throws Throwable {
      /*  aobAndroidModel.AdvantageApplication().UsernameEditField().setText("username");
        aobAndroidModel.AdvantageApplication().PasswordEditField().setText("password");
        aobAndroidModel.AdvantageApplication().LoginButton().tap();

        savingsBalanceBefore = Integer.parseInt(aobAndroidModel.AdvantageApplication().SavingsBalanceLabel().getText());
        checkingBalanceBefore = Integer.parseInt(aobAndroidModel.AdvantageApplication().CheckingBalanceLabel().getText());*/

        throw new PendingException();

    }

    @Given("^I have selected to transfer funds$")
    public void i_have_selected_to_transfer_funds() throws Throwable {
      /*  aobAndroidModel.AdvantageApplication().MenuUiObject().tap();
        aobAndroidModel.AdvantageApplication().MoneyTransferLabel().tap();*/
        throw new PendingException();
    }

    @When("^I transfer (\\d+) dollars$")
    public void i_transfer_dollars(int arg1) throws Throwable {
        /*
        aobAndroidModel.AdvantageApplication().TransferSumEditField().setText("100");
        aobAndroidModel.AdvantageApplication().TRANSFERButton().tap();

        aobAndroidModel.AdvantageApplication().OKButton().tap();

        savingsBalanceAfter = Integer.parseInt(aobAndroidModel.AdvantageApplication().SavingsBalanceLabel().getText());
        checkingBalanceAfter = Integer.parseInt(aobAndroidModel.AdvantageApplication().CheckingBalanceLabel().getText());*/
        throw new PendingException();
    }

    @Then("^The amount in from account is reduced by (\\d+) dollars$")
    public void the_amount_in_from_account_is_reduced_by_dollars(int arg1) throws Throwable {
        /*
        Verify.areEqual((savingsBalanceBefore - savingsBalanceAfter), 100, "Savings Balance reduced by Transfer Amount");
        Verify.areEqual((checkingBalanceAfter - checkingBalanceBefore), 100, "Checking Balance increased by Transfer Amount");
        Reporter.reportEvent("Balance Check","Final balance after test is run",Status.Warning, myDevice.getSnapshot());
        */
        throw new PendingException();
    }


}
