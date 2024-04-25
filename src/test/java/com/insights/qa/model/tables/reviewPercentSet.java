package com.insights.qa.model.tables;

import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class reviewPercentSet {

    private Integer EXTRACT_PROCESS_ID;
    private Integer MERCHANT_ID;
    private Integer PERIOD;
    private Double NEGATIVE_PERCENT;
    private Double NEUTRAL_PERCENT;
    private Double POSITIVE_PERCENT;
    private Integer NEGATIVE_COUNT;
    private Integer NEUTRAL_COUNT;
    private Integer POSITIVE_COUNT;

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

    public static final class Review_Percents_Mapper implements RowMapper<reviewPercentSet> {
        public reviewPercentSet mapRow(ResultSet resultSet, int i) throws SQLException {
            reviewPercentSet answer = new reviewPercentSet();

            answer.setMERCHANT_ID(resultSet.getInt("MERCHANT_ID"));
            answer.setPERIOD(resultSet.getInt("PERIOD"));
            answer.setNEGATIVE_PERCENT(resultSet.getDouble("NEGATIVE_PERCENT"));
            answer.setNEUTRAL_PERCENT(resultSet.getDouble("NEUTRAL_PERCENT"));
            answer.setPOSITIVE_PERCENT(resultSet.getDouble("POSITIVE_PERCENT"));
            answer.setNEGATIVE_COUNT(resultSet.getInt("NEGATIVE_COUNT"));
            answer.setNEUTRAL_COUNT(resultSet.getInt("NEUTRAL_COUNT"));
            answer.setPOSITIVE_COUNT(resultSet.getInt("POSITIVE_COUNT"));
            return answer;
        }
    }
}

