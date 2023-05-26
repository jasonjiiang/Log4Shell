package com.example.demo.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.ModelMap;

@Controller
public class EmailController {
    @RequestMapping(value = "/email", method = RequestMethod.GET)
    public String emailPage() {
        return "email";
    }

    @RequestMapping(value = "/email", method = RequestMethod.POST)
    public String validPage(@RequestParam String email, ModelMap model) {
        boolean isValid = validateEmail(email);
        if (isValid) {
            return "valid";
        }

        Logger logger = LogManager.getLogger(com.example.demo.Log4J.class);
        logger.error(email);
        return "email";
    }

    private boolean validateEmail(String email) {
        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        return email.matches(regex);
    }
}
