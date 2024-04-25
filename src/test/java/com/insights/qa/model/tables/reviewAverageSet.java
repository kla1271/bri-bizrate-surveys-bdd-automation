package com.insights.qa.model.tables;

import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class reviewAverageSet {

    private Integer EXTRACT_PROCESS_ID;
    private Integer MERCHANT_ID;
    private String QUESTION_KEY;
    private Double AVERAGE;
    private Integer COUNT;

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

    public Integer getCOUNT() {
        return COUNT;
    }
    public void setCOUNT(Integer COUNT) {
        this.COUNT = COUNT;
    }

    public static final class Review_Average_Mapper implements RowMapper<reviewAverageSet> {
        public reviewAverageSet mapRow(ResultSet resultSet, int i) throws SQLException{

            reviewAverageSet answer = new reviewAverageSet();

            answer.setEXTRACT_PROCESS_ID(resultSet.getInt("EXTRACT_PROCESS_ID"));
            answer.setMERCHANT_ID(resultSet.getInt("MERCHANT_ID"));
            answer.setQUESTION_KEY(resultSet.getString("QUESTION_KEY"));
            answer.setAVERAGE(resultSet.getDouble("AVERAGE"));
            answer.setCOUNT(resultSet.getInt("COUNT"));
            return answer;
        }
    }
}
