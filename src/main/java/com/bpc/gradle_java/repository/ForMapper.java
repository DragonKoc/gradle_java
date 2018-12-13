package com.bpc.gradle_java.repository;

import com.bpc.gradle_java.dto.Card;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class ForMapper implements RowMapper<Card> {

    @Override
    public Card mapRow(ResultSet rs, int rowNum) throws SQLException {

        Card payloadCard = new Card();

        payloadCard.setcard_id(rs.getString("card_id"));
        payloadCard.setcard_num(rs.getString("card_num"));
        payloadCard.setexp_date(rs.getString("exp_date"));
        payloadCard.setcardholder_name(rs.getString("cardholder_name"));
        payloadCard.setcard_status(rs.getString("card_status"));

        return payloadCard;
    }


}
