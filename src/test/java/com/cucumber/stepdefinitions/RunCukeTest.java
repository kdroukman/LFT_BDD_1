package com.cucumber.stepdefinitions;

/**
 * Created by droukman on 10/5/2016.
 */

import org.junit.runner.RunWith;
import com.hpe.alm.octane.OctaneCucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(OctaneCucumber.class)
@CucumberOptions(
        features = "src/test/java/com/cucumber/features",
        glue = "com.cucumber.stepdefinitions",
        plugin = {
                "pretty",
                "html:target/cucumber",
                "junit:results.xml",
        }

)
public class RunCukeTest {

}