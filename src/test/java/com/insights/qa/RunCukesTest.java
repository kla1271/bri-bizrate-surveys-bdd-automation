package com.insights.qa;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
 * Created by Kenny La on 04/16/24.
 */

//runs the tests.
@RunWith(Cucumber.class)

//@Cucumber.Options(format = "json:cucumber.json", tags = {"@regressionSuite", "~@in-progress", "~@skip"})
@CucumberOptions(format = "json:cucumber.json", tags = {"@getAllReviews", "~@in-progress", "~@skip"})


public class RunCukesTest {
}
