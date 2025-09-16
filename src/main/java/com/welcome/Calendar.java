package com.welcome;

import com.welcome.interfaces.ICalendar;

import java.util.GregorianCalendar;

public class Calendar implements ICalendar {

    @Override
    public int getDay() {
        return new GregorianCalendar().get(java.util.Calendar.DAY_OF_WEEK);
    }

    @Override
    public int getHour() {
        return new GregorianCalendar().get(java.util.Calendar.HOUR_OF_DAY);
    }
}
