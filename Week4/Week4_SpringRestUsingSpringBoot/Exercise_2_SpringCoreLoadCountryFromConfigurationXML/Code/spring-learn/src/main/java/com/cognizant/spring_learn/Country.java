package com.cognizant.spring_learn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Country {
    private static final Logger LOGGER = LoggerFactory.getLogger(Country.class);
    private String name;
    private String code;

    public Country(){
        LOGGER.debug("Inside Country constructor");
    }
    public String getCode(){
        LOGGER.debug("Getting country code: {}", code);
        return code;
    }
    public void setCode(String code){
        LOGGER.debug("Setting country code: {}", code);
        this.code = code;
    }
    public String getName(){
        LOGGER.debug("Getting country name: {}", name);
        return name;
    }
    public void setName(String name){
        LOGGER.debug("Setting country name: {}", name);
        this.name = name;
    }
    @Override
    public String toString(){
        return "Country[name=" + name + ", code=" + code + "]";
    }
}
