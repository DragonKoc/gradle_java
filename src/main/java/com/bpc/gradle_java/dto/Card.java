package com.bpc.gradle_java.dto;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
     * <p>Java class for card complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType name="card"&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="card_id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="card_num" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="client_id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="exp_date" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="cardholder_name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="card_status" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "card", propOrder = {
            "card_id",
            "card_num",
           // "client_id",
            "exp_date",
            "cardholder_name",
            "card_status",
            "client_id"
    })
    public class Card {

        @XmlElement(required = true)
        protected String card_id;
        @XmlElement(required = true)
        protected String card_num;
        @XmlElement(required = true)
        protected String exp_date;
        @XmlElement(required = true)
        protected String cardholder_name;
        @XmlElement(required = true)
        protected String card_status;
        @XmlElement(required = true)
        protected String client_id;

        /**
         * Gets the value of the card_id property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getcard_id() {
            return card_id;
        }

        /**
         * Sets the value of the card_id property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setcard_id(String value) {
            this.card_id = value;
        }

        /**
         * Gets the value of the card_num property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getcard_num() {
            return card_num;
        }

        /**
         * Sets the value of the card_num property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setcard_num(String value) {
            this.card_num = value;
        }

        /**
         * Gets the value of the client_id property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getclient_id() {
            return client_id;
        }

        /**
         * Sets the value of the client_id property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setclient_id(String value) {
            this.client_id = value;
        }

        /**
         * Gets the value of the exp_date property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getexp_date() {
            return exp_date;
        }

        /**
         * Sets the value of the exp_date property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setexp_date(String value) {
            this.exp_date = value;
        }

        /**
         * Gets the value of the cardholder_name property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getcardholder_name() {
            return cardholder_name;
        }

        /**
         * Sets the value of the cardholder_name property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setcardholder_name(String value) {
            this.cardholder_name = value;
        }

        /**
         * Gets the value of the card_status property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getcard_status() {
            return card_status;
        }

        /**
         * Sets the value of the card_status property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setcard_status(String value) {
            this.card_status = value;
        }
}
