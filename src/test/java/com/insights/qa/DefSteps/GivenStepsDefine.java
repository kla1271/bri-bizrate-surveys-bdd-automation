package com.insights.qa.DefSteps;

import com.insights.qa.Main.World;
import cucumber.api.java.en.Given;
import org.apache.log4j.Logger;

/**
 * Created by Kenny La on 11/10/15.
 */
public class GivenStepsDefine {

    private static final Logger LOG = Logger.getLogger(GivenStepsDefine.class);

    @Given("^the service call endpoint (.+)$")
    public void getEndpoint(String ParsedEndpoint)
    {
        String baseUrl = (String) World.context.getBean("deliveryServiceBaseUrl");

        if (ParsedEndpoint.equals("merchants")) {
            World.setEndpointUrl(baseUrl + ParsedEndpoint + "/");
        }
        else {
            World.setEndpointUrl(baseUrl + ParsedEndpoint + "?");
        }
    }
}
