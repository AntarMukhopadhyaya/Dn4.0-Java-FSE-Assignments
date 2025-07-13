package com.cognizant.spring_learn.controller;

import com.cognizant.spring_learn.Country;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CountryController {
    private static final Logger LOGGER = LoggerFactory.getLogger(CountryController.class);

    @GetMapping("/country/{code}")
    public Country getCountryByCode(@PathVariable String code){
        LOGGER.info("getCountryByCode called");
        LOGGER.info("Country code: {}", code);
        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        List<Country> countries = context.getBean("countries", List.class);
        LOGGER.info("Countries loaded: {}", countries);
        if (countries == null || countries.isEmpty()) {
            LOGGER.warn("No countries found in the context");
            return null;
        }
        LOGGER.info("Searching for country with code: {}", code);

        return countries.stream().filter(c -> c.getCode().equalsIgnoreCase(code) )
                .findFirst()
                .orElse(null);
    }

}
