package com.kvashenko.testWork;

import org.apache.log4j.Logger;

public class MessagePrinter {
    private final Logger logger = Logger.getLogger(MessagePrinter.class);

    public void printMessage(String message) {
        logger.info("print in console: " + message);
        System.out.println(message);
    }
}
