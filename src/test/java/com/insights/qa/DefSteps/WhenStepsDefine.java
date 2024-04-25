package com.insights.qa.DefSteps;

import com.insights.qa.Main.World;
import cucumber.api.java.en.When;
import org.apache.log4j.Logger;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kenny La on 11/10/15.
 */
public class WhenStepsDefine {

    private static final Logger LOG = Logger.getLogger(WhenStepsDefine.class);

    @When("^the endpoint is invoked with the following params")
    public void invokeDifferentParams(List<List<String>> givenParameters)
    {

        List<String> params = new ArrayList<String>();
        List<String> values = new ArrayList<String>();


        for (int x = 1; x < givenParameters.size(); x++)
        {
            List<String> row = givenParameters.get(x);
            params.add(row.get(0));
            values.add(row.get(1));

            if (row.get(0).equals("groupId"))
            {
                World.setGroupRatingId(row.get(0));
                World.setGroupRatingIdValue(row.get(1));
            }
            else if (row.get(0).equals("mid"))
            {
                World.setParamMid(row.get(0));
                World.setValueMid(row.get(1));
            }
        }

        if (params.size() == values.size())
        {
            //Checking for merchants
            if(World.getEndpointUrl().contains("accounts/group")){
                for (int i = 0; i <params.size(); i++){
                    World.setEndpointUrl(World.getEndpointUrl() + World.getValueMid());
                }
            }
            else {
                //append product search to the url
                for (int i = 0; i < params.size(); i++) {
                    if (i == 0) {
                        World.setEndpointUrl(World.getEndpointUrl() + params.get(i));
                        World.setEndpointUrl(World.getEndpointUrl() + "=" + values.get(i));
                        World.setEndpointUrl(World.getEndpointUrl().replaceAll(" ", "+"));
                    } else {
                        {
                            World.setEndpointUrl(World.getEndpointUrl() + "&" + params.get(i));
                            World.setEndpointUrl(World.getEndpointUrl() + "=" + values.get(i));
                            World.setEndpointUrl(World.getEndpointUrl().replaceAll(" ", "+"));
                        }
                    }
                }
            }
        }
        else
        {
            System.out.println("ERROR: the size of array parameters and array values are not matching -- please check feature files.");
        }
        LOG.info("Testing Endpoint: " + World.getEndpointUrl());
    }

}
