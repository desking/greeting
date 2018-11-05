package com.kvashenko.testWork;

import com.kvashenko.testWork.determinant.TimesOfDay;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Locale;
import java.util.ResourceBundle;

public class MessageCreatorTest {
    private MessageCreator messageCreator;

    @Before
    public void setUp() {
        messageCreator = new MessageCreator();
    }

    @Test
    public void testMessageLocaleRU(){
        ResourceBundle bundle = ResourceBundle.getBundle("greeting_messages", Locale.forLanguageTag("ru"));
        Assert.assertEquals("Доброе утро, Мир!",messageCreator.getGreetingMessage(bundle, TimesOfDay.MORNING));
        Assert.assertEquals("Добрый день, Мир!",messageCreator.getGreetingMessage(bundle, TimesOfDay.DAY));
        Assert.assertEquals("Добрый вечер, Мир!",messageCreator.getGreetingMessage(bundle, TimesOfDay.EVENING));
        Assert.assertEquals("Доброй ночи, Мир!",messageCreator.getGreetingMessage(bundle, TimesOfDay.NIGHT));
    }
}
