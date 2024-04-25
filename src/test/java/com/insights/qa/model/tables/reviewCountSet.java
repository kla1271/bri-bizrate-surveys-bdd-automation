package com.insights.qa.model.tables;

import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class reviewCountSet {

    private Integer EXTRACT_PROCESS_ID;
    private Integer MERCHANT_ID;
    private Integer COUNT_PERIOD;
    private Integer REVIEW_COUNT;
    private String SURVEY_TYPE;

    public Integer getEXTRACT_PROCESS_ID() {
        return EXTRACT_PROCESS_ID;
    }
    public void setEXTRACT_PROCESS_ID(Integer EXTRACT_PROCESS_ID) {
        this.EXTRACT_PROCESS_ID = EXTRACT_PROCESS_ID;
    }

    public Integer getMERCHANT_ID() {
        return MERCHANT_ID;
    }
    public void setMERCHANT_ID(Integer MERCHANT_ID) {
        this.MERCHANT_ID = MERCHANT_ID;
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

    public static final class Review_Ratings_Mapper implements RowMapper<reviewCountSet> {
        public reviewCountSet mapRow(ResultSet resultSet, int i) throws SQLException {
            reviewCountSet answer = new reviewCountSet();

            answer.setEXTRACT_PROCESS_ID(resultSet.getInt("EXTRACT_PROCESS_ID"));
            answer.setMERCHANT_ID(resultSet.getInt("MERCHANT_ID"));
            answer.setCOUNT_PERIOD(resultSet.getInt("COUNT_PERIOD"));
            answer.setREVIEW_COUNT(resultSet.getInt("REVIEW_COUNT"));
            answer.setSURVEY_TYPE(resultSet.getString("SURVEY_TYPE"));

            return answer;
        }
    }
}
