package com.kvashenko.testWork;

import com.kvashenko.testWork.determinant.DateTimeDeterminant;
import com.kvashenko.testWork.determinant.TimesOfDay;
import org.apache.log4j.BasicConfigurator;

import java.time.LocalDateTime;
import java.util.Locale;
import java.util.ResourceBundle;

public class Greeting {
    private static final String MESSAGES_FILE = "greeting_messages";

    public static void main(String[] args) throws Exception {
        BasicConfigurator.configure();
        DateTimeDeterminant dateTimeDeterminant = new DateTimeDeterminant();
        MessageCreator messageCreator = new MessageCreator();
        MessagePrinter messagePrinter = new MessagePrinter();
        LocalDateTime currentDateTime = LocalDateTime.now();
        TimesOfDay timesOfDay = dateTimeDeterminant.timeDeterminant(currentDateTime.getHour());
        ResourceBundle resourceBundle = ResourceBundle.getBundle(MESSAGES_FILE, Locale.getDefault());
        String greetingMessage = messageCreator.getGreetingMessage(resourceBundle, timesOfDay);
        messagePrinter.printMessage(greetingMessage);
    }
}
