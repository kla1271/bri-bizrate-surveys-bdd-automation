package com.insights.qa.model.tables;

import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class joinReviews {
    private Integer EXTRACT_PROCESS_ID;
    private Integer MERCHANT_ID;
    private String IS_RATED;
    private String IS_CERTIFIED;
    private Integer RATING_PERIOD_FF_COUNT;
    private Integer PERIOD;
    private Double NEGATIVE_PERCENT;
    private Double NEUTRAL_PERCENT;
    private Double POSITIVE_PERCENT;
    private Integer NEGATIVE_COUNT;
    private Integer NEUTRAL_COUNT;
    private Integer POSITIVE_COUNT;
    private Integer COUNT_PERIOD;
    private Integer REVIEW_COUNT;
    private String SURVEY_TYPE;
    private String QUESTION_KEY;
    private Double AVERAGE;
    private Integer AVG_COUNT;
    private String SINGLE_QUESTION_KEY;

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

    public Integer getPERIOD() {
        return PERIOD;
    }
    public void setPERIOD(Integer PERIOD) {
        this.PERIOD = PERIOD;
    }

    public Double getNEGATIVE_PERCENT() {
        return NEGATIVE_PERCENT;
    }
    public void setNEGATIVE_PERCENT(Double NEGATIVE_PERCENT) {
        this.NEGATIVE_PERCENT = NEGATIVE_PERCENT;
    }

    public Double getNEUTRAL_PERCENT() {
        return NEUTRAL_PERCENT;
    }
    public void setNEUTRAL_PERCENT(Double NEUTRAL_PERCENT) {
        this.NEUTRAL_PERCENT = NEUTRAL_PERCENT;
    }

    public Double getPOSITIVE_PERCENT() {
        return POSITIVE_PERCENT;
    }
    public void setPOSITIVE_PERCENT(Double POSITIVE_PERCENT) {
        this.POSITIVE_PERCENT = POSITIVE_PERCENT;
    }

    public Integer getNEGATIVE_COUNT() {
        return NEGATIVE_COUNT;
    }
    public void setNEGATIVE_COUNT(Integer NEGATIVE_COUNT) {
        this.NEGATIVE_COUNT = NEGATIVE_COUNT;
    }

    public Integer getNEUTRAL_COUNT() {
        return NEUTRAL_COUNT;
    }
    public void setNEUTRAL_COUNT(Integer NEUTRAL_COUNT) {
        this.NEUTRAL_COUNT = NEUTRAL_COUNT;
    }

    public Integer getPOSITIVE_COUNT() {
        return POSITIVE_COUNT;
    }
    public void setPOSITIVE_COUNT(Integer POSITIVE_COUNT) {
        this.POSITIVE_COUNT = POSITIVE_COUNT;
    }

    public Integer getCOUNT_PERIOD() {
        return COUNT_PERIOD;
    }
    public void setCOUNT_PERIOD(Integer COUNT_PERIOD) {
        this.COUNT_PERIOD = COUNT_PERIOD;
    }

    public Integer getREVIEW_COUNT() {
        return REVIEW_COUNT;
    }
    public void setREVIEW_COUNT(Integer REVIEW_COUNT) {
        this.REVIEW_COUNT = REVIEW_COUNT;
    }

    public String getSURVEY_TYPE() {
        return SURVEY_TYPE;
    }
    public void setSURVEY_TYPE(String SURVEY_TYPE) {
        this.SURVEY_TYPE = SURVEY_TYPE;
    }

    public String getQUESTION_KEY() {
        return QUESTION_KEY;
    }
    public void setQUESTION_KEY(String QUESTION_KEY) {
        this.QUESTION_KEY = QUESTION_KEY;
    }

    public Double getAVERAGE() {
        return AVERAGE;
    }
    public void setAVERAGE(Double AVERAGE) {
        this.AVERAGE = AVERAGE;
    }

    public Integer getAVG_COUNT() {
        return AVG_COUNT;
    }
    public void setAVG_COUNT(Integer AVG_COUNT) {
        this.AVG_COUNT = AVG_COUNT;
    }

    public String getSINGLE_QUESTION_KEY() {
        return SINGLE_QUESTION_KEY;
    }

    public void setSINGLE_QUESTION_KEY(String SINGLE_QUESTION_KEY) {
        this.SINGLE_QUESTION_KEY = SINGLE_QUESTION_KEY;
    }

    public static final class joinReview_Mapper implements RowMapper<joinReviews> {
        public joinReviews mapRow(ResultSet resultSet, int i) throws SQLException {
            joinReviews answer = new joinReviews();

            answer.setMERCHANT_ID(resultSet.getInt("MERCHANT_ID"));
            answer.setQUESTION_KEY(resultSet.getString("QUESTION_KEY"));
            answer.setAVERAGE(resultSet.getDouble("AVERAGE"));
            answer.setAVG_COUNT(resultSet.getInt("AVG_COUNT"));

            return answer;
        }
    }

    public static final class QuestionKey_Mapper implements  RowMapper<joinReviews> {
        public joinReviews mapRow(ResultSet resultSet, int i) throws SQLException {
            joinReviews answer = new joinReviews();

            answer.setSINGLE_QUESTION_KEY(resultSet.getString("QUESTION_KEY"));

            return answer;
        }
    }
}
