package com.welcome.fakeClass;

import com.welcome.interfaces.ICalendar;

public class FakeCalendar implements ICalendar {
    private final int day;
    private final int hour;

    public FakeCalendar(int day, int hour) {
        this.day = day;
        this.hour = hour;
    }


    public int getDay() {
        return day;
    }
    public int getHour() {
        return hour;
    }
}
