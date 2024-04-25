package com.insights.qa.Main;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Created by Kenny La on 11/10/15.
 */
public class World {

    protected static final Logger LOG = Logger.getLogger(World.class);

    public final static ApplicationContext context = new ClassPathXmlApplicationContext("classpath:beans.xml");
    public static JdbcTemplate dbJdbcTemplate = (JdbcTemplate) context.getBean("rdsJdbcTemplate");
    public static String EndpointUrl;

    public static String paramMid = null;
    public static String valueMid = null;
    public static String paramProductId = null;
    public static String valueProductId = null;
    public static String paramCountryCode = null;
    public static String valueCountryCode = null;
    public static String paramDeviceType = null;
    public static String valueDeviceType = "DESKTOP";
    public static String paramOriginCode = null;
    public static String valueOriginCode = "US";
    public static String paramSegment = null;
    public static String valueSegment = null;
    public static Boolean originResult = false;
    public static String paramFlow = null;
    public static String valueFlow = null;
    public static String groupRatingId = null;
    public static String groupRatingIdValue = null;


    /**
     * Before class that runs before each feature executions
     */
    @Before
    public void configEnvironment() {
        //LOG.info("Configuring the environmnet, setting up World variables.");
        //env = System.getenv("ENV");
        //LOG.info("Environment = " + env);
    }

    /**
     * After class that runs after each feature executions
     */
    @After
    public void tearDown() {
        //clean ups that need to do after each features,
        //current does not have any.
    }

    public static String getEndpointUrl() {
        return EndpointUrl;
    }

    public static void setEndpointUrl(String EndpointUrl) {
        World.EndpointUrl = EndpointUrl;
    }

    public static String getParamMid(){return paramMid;}
    public static void setParamMid(String paramMid){World.paramMid = paramMid;}

    public static String getValueMid(){return valueMid;}
    public static void setValueMid(String valueMid){World.valueMid = valueMid;}

    public static String getParamProductId(){return paramProductId;}
    public static void setParamProductId(String paramProductId){World.paramProductId = paramProductId;}

    public static String getValueProductId(){return valueProductId;}
    public static void setValueProductId(String valueProductId){World.valueProductId = valueProductId;}

    public static String getParamCountryCode(){return paramCountryCode;}
    public static void setParamCountryCode(String paramCountryCode){World.paramCountryCode = paramCountryCode;}

    public static String getValueCountryCode(){return valueCountryCode;}
    public static void setValueCountryCode(String valueCountryCode){World.valueCountryCode = valueCountryCode;}

    public static String getParamDeviceType(){return paramDeviceType;}
    public static void setParamDeviceType(String paramDeviceType){World.paramDeviceType = paramDeviceType;}

    public static String getValueDeviceType(){return valueDeviceType;}
    public static void setValueDeviceType(String valueDeviceType){World.valueDeviceType = valueDeviceType;}

    public static String getParamOriginCode(){return paramOriginCode;}
    public static void setParamOriginCode(String paramOriginCode){World.paramOriginCode = paramOriginCode;}

    public static String getValueOriginCode(){return valueOriginCode;}
    public static void setValueOriginCode(String valueOriginCode){World.valueOriginCode = valueOriginCode;}

    public static String getParamSegment(){return paramSegment;}
    public static void setParamSegment(String paramSegment){World.paramSegment = paramSegment;}

    public static String getValueSegment(){return valueSegment;}
    public static void setValueSegment(String valueSegment){World.valueSegment = valueSegment;}

    public static Boolean getOriginResult(){return originResult;}
    public static void setOriginResult(Boolean originResult){World.originResult = originResult;}

    public static String getParamFlow(){return paramFlow;}
    public static void setParamFlow(String paramFlow){World.paramFlow = paramFlow;}

    public static String getValueFlow(){return valueFlow;}
    public static void setValueFlow(String valueFlow){World.valueFlow = valueFlow;}

    public static String getGroupRatingId() {
        return groupRatingId;
    }

    public static void setGroupRatingId(String groupRatingId) {
        World.groupRatingId = groupRatingId;
    }

    public static String getGroupRatingIdValue() {
        return groupRatingIdValue;
    }

    public static void setGroupRatingIdValue(String groupRatingIdValue) {
        World.groupRatingIdValue = groupRatingIdValue;
    }
}
