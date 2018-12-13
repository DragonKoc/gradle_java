package com.bpc.gradle_java.controllers;

import com.bpc.gradle_java.dto.Card;
import com.bpc.gradle_java.repository.DAOInterface;
import com.bpc.gradle_java.repository.SimpleJDBCTemplateImlp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class KostyaRESTController {

    DAOInterface dao;

    @Autowired
    public KostyaRESTController(SimpleJDBCTemplateImlp simpleJDBCTemplateImlp) {
        this.dao = simpleJDBCTemplateImlp;
    }

    String ohYebatMnogoBukav = "<!doctype html>\n" +
            "<html>\n" +
            "  <head>\n" +
            "    <title>TOBI PIZDA LLC</title>\n" +
            "  </head>\n" +
            "  <body>\n" +
            "    <a href=\"http://localhost:8080/gradle_java/tutpizda\">TIKAI S GORODA, TOBI PIZDA!!!!</a>\n" +
            "  </body>\n" +
            "</html>";

    @RequestMapping("/")
    public String poslatNaher() {
        return ohYebatMnogoBukav;
    }



    @RequestMapping("/tutpizda")
    public String priehaliBleat() {
        return "NE VSPIV GOLUBCHIK!11";
    }

    @RequestMapping("/getCard")
    public List<Card> getCard() {
        List<Card> resultCards;

        resultCards = dao.getClientGUID("1");
        return resultCards;
    }

}
