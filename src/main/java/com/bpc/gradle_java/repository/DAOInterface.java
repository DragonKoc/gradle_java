package com.bpc.gradle_java.repository;

import com.bpc.gradle_java.dto.Card;

import java.util.List;

public interface DAOInterface {

    public List<Card> getClientGUID(String clientId);

}
