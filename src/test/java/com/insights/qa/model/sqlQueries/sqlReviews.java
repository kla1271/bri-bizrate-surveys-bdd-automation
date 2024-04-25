package com.insights.qa.model.sqlQueries;

import com.insights.qa.model.tables.merchantRow;
import com.insights.qa.model.tables.joinReviews;
import com.insights.qa.model.tables.reviewPercentSet;
import org.apache.log4j.Logger;

import java.util.List;

import static com.insights.qa.Main.World.dbJdbcTemplate;

public class sqlReviews {

    private static Logger LOG = Logger.getLogger(sqlReviews.class);

    public static List<joinReviews> getReviewRatings(String MID){

        List<joinReviews> ans = null;

        ans = dbJdbcTemplate.query("SELECT ra.MERCHANT_ID, ra.QUESTION_KEY, ra.AVERAGE, ra.AVG_COUNT " +
                        "FROM MERCHANT_RATING.REVIEW_AVERAGE ra, MERCHANT_RATING.REVIEW_COUNTS rc, " +
                        "MERCHANT_RATING.REVIEW_PERCENTS rp, MERCHANT_RATING.REVIEW_RATINGS rr " +
                        "WHERE ra.MERCHANT_ID = rc.MERCHANT_ID AND ra.MERCHANT_ID = rp.MERCHANT_ID " +
                        "AND ra.MERCHANT_ID = rr.MERCHANT_ID AND rc.COUNT_PERIOD = rp.PERIOD " +
                        "AND ra.MERCHANT_ID in (" + MID + ") AND rc.COUNT_PERIOD = 90 " +
                        "AND rc.SURVEY_TYPE = 'POS' ORDER BY QUESTION_KEY DESC ",
                new Object[]{},
                new joinReviews.joinReview_Mapper());

        return ans;
    }

    public static List<joinReviews> getQuestionKey(String MID){

        List<joinReviews> ans = null;

        ans = dbJdbcTemplate.query("SELECT DISTINCT ra.QUESTION_KEY " +
                        "FROM MERCHANT_RATING.REVIEW_AVERAGE ra, MERCHANT_RATING.REVIEW_COUNTS rc, " +
                        "MERCHANT_RATING.REVIEW_PERCENTS rp, MERCHANT_RATING.REVIEW_RATINGS rr " +
                        "WHERE ra.MERCHANT_ID = rc.MERCHANT_ID AND ra.MERCHANT_ID = rp.MERCHANT_ID " +
                        "AND ra.MERCHANT_ID = rr.MERCHANT_ID AND rc.COUNT_PERIOD = rp.PERIOD " +
                        "AND ra.MERCHANT_ID in (" + MID + ") AND rc.COUNT_PERIOD = 90 " +
                        "AND rc.SURVEY_TYPE = 'POS' GROUP BY ra.QUESTION_KEY ",
                new Object[]{},
                new joinReviews.QuestionKey_Mapper());

        return ans;
    }

    public static List<merchantRow> getGroupRatingIdMerchant(String groupId) {

        List<merchantRow> ans = null;

        ans = dbJdbcTemplate.query("SELECT MID " +
                        "FROM MERCHANT.MERCHANT " +
                        "WHERE GROUP_ID = ? ",
                new Object[]{Integer.parseInt(groupId)},
                new merchantRow.GroupId_Mapper());

        return ans;
    }

    public static List<reviewPercentSet> getGroupRatingPercentage(String MidList) {

        List<reviewPercentSet> ans = null;

        ans = dbJdbcTemplate.query("SELECT MERCHANT_ID,PERIOD,NEGATIVE_PERCENT,NEUTRAL_PERCENT, " +
                "POSITIVE_PERCENT,NEGATIVE_COUNT,NEUTRAL_COUNT,POSITIVE_COUNT " +
                "FROM MERCHANT_RATING.REVIEW_PERCENTS " +
                "WHERE MERCHANT_ID IN ("+ MidList +") ORDER BY PERIOD DESC",
                new Object[]{},
                new reviewPercentSet.Review_Percents_Mapper());
        return ans;
    }



}

