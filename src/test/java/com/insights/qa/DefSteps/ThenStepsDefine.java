package com.insights.qa.DefSteps;

import com.insights.qa.HtmlParser.DomHtmlParser;
import com.insights.qa.HtmlParser.jSoupHtmlParser;
import com.insights.qa.Main.World;
import com.insights.qa.Main.groupRatings;
import com.insights.qa.model.sqlQueries.sqlReviews;
import com.insights.qa.model.tables.merchantRow;
import com.insights.qa.model.tables.joinReviews;
import com.insights.qa.model.tables.reviewPercentSet;
import cucumber.api.java.en.Then;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.List;

import static org.junit.Assert.assertTrue;

/**
 * Created by Kenny La on 04/16/2024.
 */
public class ThenStepsDefine {

    private static final Logger LOG = Logger.getLogger(ThenStepsDefine.class);
    public jSoupHtmlParser parser;
    public DomHtmlParser domParser;
    public StringBuilder result = new StringBuilder();

    @Then("^the service returns (\\d+)$")
    public void the_service_returns(int expected_response_code) {
        //construct jsoup parser.
        parser = new jSoupHtmlParser(World.getEndpointUrl());

        assertTrue("Status response is not " + expected_response_code + " vs " + parser.getHttpResponseCode(),
                parser.getHttpResponseCode() == expected_response_code);
        LOG.info("Service status code return " + expected_response_code + " -- PASS!");

    }

    @Then("^the numbers of (.+) tags should be equal to (\\d+)$")
         public void the_numbers_of_tags_should_be_equal_to(String string_to_parse, int num) {
        //construct jsoup parser.
        parser = new jSoupHtmlParser(World.getEndpointUrl());

        //parsing the html response
        assertTrue("The numbers of " + string_to_parse + " tags is not equal to " + num + " for : " + World.getEndpointUrl(),
                parser.getNumberOfTab(string_to_parse) == num);
        LOG.info("Test the numbers of " + string_to_parse + " tags should be equal to " + num + " -- PASS!");
    }

    @Then("^a value of (.+) tag should be equal to (.+)$")
    public void a_value_of_tag_should_be_equal_to(String string_to_parse, String value) {
        //construct jsoup parser.
        parser = new jSoupHtmlParser(World.getEndpointUrl());

        //parsing the html response
        assertTrue("A value of " + string_to_parse + " tags is not equal to " + value + " vs " + parser.getElementTextValue(string_to_parse) + " for : " + World.getEndpointUrl() + " " + parser.getElementTextValue(string_to_parse),
                parser.getElementTextValue(string_to_parse).equals(value));
        LOG.info("Test the value of " + string_to_parse + " tag should be equal to " + value + " -- PASS!");
    }

    @Then("^groupRatings endpoint validate")
    public void groupRatings_validation(){

        domParser = new DomHtmlParser(World.getEndpointUrl());

        List<merchantRow> MIDs = sqlReviews.getGroupRatingIdMerchant(World.getGroupRatingIdValue());

        for (int i = 0; i < MIDs.size(); i++){
            result.append(MIDs.get(i).getGroupIdMerchant());
            result.append(",");
        }

        String MidLists = result.toString();
        MidLists = MidLists.substring(0,MidLists.lastIndexOf(","));

        LOG.info("************************************" );
        LOG.info("GroupId: " + World.getGroupRatingIdValue() + " MID: (" + MidLists + ")");
        LOG.info("************************************\n" );

        List<joinReviews> ReviewRatingResults = sqlReviews.getReviewRatings(MidLists);
        List<joinReviews> ReviewQuestionKeys = sqlReviews.getQuestionKey(MidLists);
        List<reviewPercentSet> ReviewPercentages = sqlReviews.getGroupRatingPercentage(MidLists);

        groupRatings.setApiDimensionalAverages(domParser,"DimensionalAverages");
        groupRatings.calculateDatabaseAverages(ReviewRatingResults);
        groupRatings.verifyAverages(ReviewQuestionKeys);
        groupRatings.setPercentages(domParser,"Percentages");
        groupRatings.calculateDatabasePercent(ReviewPercentages);
        groupRatings.verifyPercentages();

    }

    @Then("^navigate to url")
    public void navigate_to_url(){
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://bizratesurveys.com");
    
        driver.findElement(By.className("coe-footer")).click();
    
        driver.quit();
    }
}
