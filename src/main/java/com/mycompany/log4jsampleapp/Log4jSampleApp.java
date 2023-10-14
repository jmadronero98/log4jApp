package com.mycompany.log4jsampleapp;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author joeymadronero
 */
public class Log4jSampleApp {

    public static void main(String[] args) {
        
        Logger logger = LogManager.getLogger(Log4jSampleApp.class);
        
        //logger.trace("This is a trace information");
        logger.debug("This is debug message");
        logger.info("This is an information message");
        logger.warn("This a warning message");
        logger.error("This a an error message");
        logger.fatal("This is a fatal message");
        
                        
    }
}
