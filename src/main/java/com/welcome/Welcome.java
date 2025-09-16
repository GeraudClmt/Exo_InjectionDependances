package com.welcome;

import com.welcome.interfaces.ICalendar;

import java.util.GregorianCalendar;

public class Welcome {
    private final int day;
    private final int hour;
    ICalendar calendar;

    public Welcome() {
       this(new Calendar());
    }

    public Welcome(ICalendar iCalendar) {
        this.calendar = iCalendar;

        day = calendar.getDay();
        hour = calendar.getHour();
    }

    public String getMessage() {
        if(day > 0 && day < 6){
            if((day == 5 && hour >= 18) || ( day == 1 && hour < 9)){
                return "Bon week-end";
            }else if(hour >= 9 && hour < 13){
                return "Bonjour";
            }else if (hour >= 13 && hour < 18) {
                return "Bon après-midi";
            }else{
                return "Bonsoir";
            }
        }else{
            return "Bon week-end";
        }
    }
}