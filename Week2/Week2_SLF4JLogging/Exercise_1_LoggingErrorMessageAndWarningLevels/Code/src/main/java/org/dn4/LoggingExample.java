package org.dn4;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingExample {
    private static final Logger logger = LoggerFactory.getLogger(LoggingExample.class);
    public static void main(String[] args) {
        logger.info("Logging started");
        int userId = 12;
        String username = "Antar";
        String email = "test@antar.com";
        logger.debug("Fetching data for user [{}] with ID [{}] and email [{}]",username,userId,email);

        // Error Logging
        try {
            int result = divide(10,0);
            logger.info("Result {}",result);
        }catch (ArithmeticException ex){
            logger.error("Exception occurred during division: {}" ,ex.getMessage(),ex);

        }
        logger.trace("Trace level log - very detailed ");
        logger.info("Logging finished");
    }
    private static int divide(int a, int b) {
        return a / b;
    }
}
