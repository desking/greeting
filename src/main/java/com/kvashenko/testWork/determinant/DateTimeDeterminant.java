package com.kvashenko.testWork.determinant;

import org.apache.log4j.Logger;

public class DateTimeDeterminant {
    private final Logger logger = Logger.getLogger(DateTimeDeterminant.class);

    public TimesOfDay timeDeterminant(int hoursCount) throws Exception {
        if (TimesOfDay.MORNING.getHours() <= hoursCount && TimesOfDay.DAY.getHours() > hoursCount) {
            logger.info("Now is " + TimesOfDay.MORNING);
            return TimesOfDay.MORNING;
        } else if (TimesOfDay.DAY.getHours() <= hoursCount && TimesOfDay.EVENING.getHours() > hoursCount) {
            logger.info("Now is " + TimesOfDay.DAY);
            return TimesOfDay.DAY;
        } else if (TimesOfDay.EVENING.getHours() <= hoursCount && TimesOfDay.NIGHT.getHours() > hoursCount) {
            logger.info("Now is " + TimesOfDay.EVENING);
            return TimesOfDay.EVENING;
        } else if ((TimesOfDay.NIGHT.getHours() == hoursCount || TimesOfDay.MORNING.getHours() > hoursCount) && hoursCount >= 0) {
            logger.info("Now is " + TimesOfDay.NIGHT);
            return TimesOfDay.NIGHT;
        }
        logger.error("Invalid time");
        throw new Exception("Invalid time");
    }
}
