package com.kvashenko.testWork;

import com.kvashenko.testWork.determinant.DateTimeDeterminant;
import com.kvashenko.testWork.determinant.TimesOfDay;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DateTimeDeterminantTest {
    private DateTimeDeterminant dateTimeDeterminant;

    @Before
    public void setUp() {
        dateTimeDeterminant = new DateTimeDeterminant();
    }

    @Test
    public void testMorning() throws Exception {
        Assert.assertEquals(TimesOfDay.MORNING, dateTimeDeterminant.timeDeterminant(6));
        Assert.assertEquals(TimesOfDay.MORNING, dateTimeDeterminant.timeDeterminant(7));
        Assert.assertEquals(TimesOfDay.MORNING, dateTimeDeterminant.timeDeterminant(8));
    }

    @Test
    public void testDay() throws Exception {
        Assert.assertEquals(TimesOfDay.DAY, dateTimeDeterminant.timeDeterminant(9));
        Assert.assertEquals(TimesOfDay.DAY, dateTimeDeterminant.timeDeterminant(10));
        Assert.assertEquals(TimesOfDay.DAY, dateTimeDeterminant.timeDeterminant(11));
        Assert.assertEquals(TimesOfDay.DAY, dateTimeDeterminant.timeDeterminant(12));
        Assert.assertEquals(TimesOfDay.DAY, dateTimeDeterminant.timeDeterminant(13));
        Assert.assertEquals(TimesOfDay.DAY, dateTimeDeterminant.timeDeterminant(14));
        Assert.assertEquals(TimesOfDay.DAY, dateTimeDeterminant.timeDeterminant(15));
        Assert.assertEquals(TimesOfDay.DAY, dateTimeDeterminant.timeDeterminant(16));
        Assert.assertEquals(TimesOfDay.DAY, dateTimeDeterminant.timeDeterminant(17));
        Assert.assertEquals(TimesOfDay.DAY, dateTimeDeterminant.timeDeterminant(18));
    }

    @Test
    public void testEvening() throws Exception {
        Assert.assertEquals(TimesOfDay.EVENING, dateTimeDeterminant.timeDeterminant(19));
        Assert.assertEquals(TimesOfDay.EVENING, dateTimeDeterminant.timeDeterminant(20));
        Assert.assertEquals(TimesOfDay.EVENING, dateTimeDeterminant.timeDeterminant(21));
        Assert.assertEquals(TimesOfDay.EVENING, dateTimeDeterminant.timeDeterminant(22));
    }

    @Test
    public void testNight() throws Exception {
        Assert.assertEquals(TimesOfDay.NIGHT, dateTimeDeterminant.timeDeterminant(23));
        Assert.assertEquals(TimesOfDay.NIGHT, dateTimeDeterminant.timeDeterminant(0));
        Assert.assertEquals(TimesOfDay.NIGHT, dateTimeDeterminant.timeDeterminant(1));
        Assert.assertEquals(TimesOfDay.NIGHT, dateTimeDeterminant.timeDeterminant(2));
        Assert.assertEquals(TimesOfDay.NIGHT, dateTimeDeterminant.timeDeterminant(3));
        Assert.assertEquals(TimesOfDay.NIGHT, dateTimeDeterminant.timeDeterminant(4));
        Assert.assertEquals(TimesOfDay.NIGHT, dateTimeDeterminant.timeDeterminant(5));
    }

    @Test(expected = Exception.class)
    public void testInvalidTime() throws Exception {
        dateTimeDeterminant.timeDeterminant(677);
    }
}
