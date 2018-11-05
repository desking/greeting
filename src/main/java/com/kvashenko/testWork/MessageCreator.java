package com.kvashenko.testWork;

import com.kvashenko.testWork.determinant.TimesOfDay;
import org.apache.log4j.Logger;

import java.util.Locale;
import java.util.ResourceBundle;

public class MessageCreator {
    private final Logger logger = Logger.getLogger(MessageCreator.class);

    private static final String RECIPIENT = "recipient";
    private static final String SEPARATOR = "separator";
    private static final String SYMBOL_END = "symbol_end";

    public String getGreetingMessage(ResourceBundle resourceBundle, TimesOfDay timesOfDay) {
        StringBuilder message = new StringBuilder();
        message.append(resourceBundle.getString(timesOfDay.name().toLowerCase()))
                .append(resourceBundle.getString(SEPARATOR)).append(" ")
                .append(resourceBundle.getString(RECIPIENT))
                .append(resourceBundle.getString(SYMBOL_END));
        logger.info("created message: " + message.toString());
        return message.toString();
    }
}
