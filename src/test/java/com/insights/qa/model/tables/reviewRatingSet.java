package com.insights.qa.model.tables;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class reviewRatingSet {

    private Integer EXTRACT_PROCESS_ID;
    private Integer MERCHANT_ID;
    private String IS_RATED;
    private String IS_CERTIFIED;
    private Integer RATING_PERIOD_FF_COUNT;

    public Integer getEXTRACT_PROCESS_ID() {
        return EXTRACT_PROCESS_ID;
    }
    public void setEXTRACT_PROCESS_ID(Integer EXTRACT_PROCESS_ID){
        this.EXTRACT_PROCESS_ID = EXTRACT_PROCESS_ID;
    }

    public Integer getMERCHANT_ID() {
        return MERCHANT_ID;
    }
    public void setMERCHANT_ID(Integer MERCHANT_ID) {
        this.MERCHANT_ID = MERCHANT_ID;
    }

    public String getIS_RATED() {
        return IS_RATED;
    }
    public void setIS_RATED(String IS_RATED) {
        this.IS_RATED = IS_RATED;
    }

    public String getIS_CERTIFIED() {
        return IS_CERTIFIED;
    }
    public void setIS_CERTIFIED(String IS_CERTIFIED) {
        this.IS_CERTIFIED = IS_CERTIFIED;
    }

    public Integer getRATING_PERIOD_FF_COUNT() {
        return RATING_PERIOD_FF_COUNT;
    }
    public void setRATING_PERIOD_FF_COUNT(Integer RATING_PERIOD_FF_COUNT) {
        this.RATING_PERIOD_FF_COUNT = RATING_PERIOD_FF_COUNT;
    }

    public static final class Review_Ratings_Mapper implements RowMapper<reviewRatingSet> {
        public reviewRatingSet mapRow(ResultSet resultSet, int i) throws SQLException {
            reviewRatingSet answer = new reviewRatingSet();

            answer.setEXTRACT_PROCESS_ID(resultSet.getInt("EXTRACT_PROCESS_ID"));
            answer.setMERCHANT_ID(resultSet.getInt("MERCHANT_ID"));
            answer.setIS_RATED(resultSet.getString("IS_RATED"));
            answer.setIS_CERTIFIED(resultSet.getString("IS_CERTIFIED"));
            answer.setRATING_PERIOD_FF_COUNT(resultSet.getInt("RATING_PERIOD_FF_COUNT"));
            return answer;
        }
    }
}
