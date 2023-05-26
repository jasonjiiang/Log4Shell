package com.example.demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4J {
    private static final Logger logger = LogManager.getLogger(Log4J.class);

    public static void logError(String message) {
        logger.error(message);
    }
}
