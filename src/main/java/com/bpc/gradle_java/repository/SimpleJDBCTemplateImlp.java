package com.bpc.gradle_java.repository;

import com.bpc.gradle_java.dto.Card;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SimpleJDBCTemplateImlp implements DAOInterface {


    @Autowired
    private JdbcTemplate jdbcdriverconnect;


    public List<Card> getClientGUID(String clientId){

        String clUID = "select * from cards where card_id > 0 and client_Id = 1";

        List<Card> resultQ ;

        resultQ = jdbcdriverconnect.query(clUID, new Object[] {clientId}, new ForMapper());

return resultQ;
    }

}
