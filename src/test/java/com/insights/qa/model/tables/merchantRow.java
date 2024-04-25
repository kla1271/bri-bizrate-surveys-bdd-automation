package com.insights.qa.model.tables;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class merchantRow {

    private Integer GroupIdMerchant;

    public Integer getGroupIdMerchant() {
        return GroupIdMerchant;
    }

    public void setGroupIdMerchant(Integer groupIdMerchant) {
        GroupIdMerchant = groupIdMerchant;
    }

    public static final class GroupId_Mapper implements RowMapper<merchantRow> {
        public merchantRow mapRow(ResultSet resultSet, int i) throws SQLException {
            merchantRow answer = new merchantRow();

            answer.setGroupIdMerchant(resultSet.getInt("MID"));

            return answer;
        }
    }


}
