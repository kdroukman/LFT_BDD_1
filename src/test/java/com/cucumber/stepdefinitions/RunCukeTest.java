package com.cucumber.stepdefinitions;

/**
 * Created by droukman on 10/5/2016.
 */

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/com/cucumber/features",
        glue = "com.cucumber.stepdefinitions",
        plugin = {
                "pretty",
                "html:target/cucumber",
        }

)
public class RunCukeTest {

}